package com.vueserver.manager.service;

import com.alibaba.druid.util.StringUtils;
import com.vueserver.manager.vo.Triple;
import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * @description:
 * @author: hetao
 * @create: 2020-06-17 20:58
 **/
public class NextOrderDay {

    private static final long day = 3600 * 24 * 1000L;
    private static final long week = day * 7;

    public static Triple getNextOrderDay(@NotNull Date validDate, @NotNull Date currentDate,int nrtType,
                                         @NotNull String smssNrt, @NotNull String smssOrderDay){

        /**1. 假如 currentDate < validDate. 直接返回 false 不是下单日 。Triple中的Date 返回 currentDate + 7 , Integer 返回 7 。*/
        if(currentDate.getTime()<validDate.getTime()){
            Long orderDateTime = currentDate.getTime() + day;
            Date orderDate = new Date(orderDateTime);
            Triple triple = new Triple();
            triple.setIsOrderDay(false);
            triple.setOrderDay(orderDate);
            triple.setInterval(7);
            return triple;
        }
        Triple triple = new Triple();
        int interval = 0;
        /**2. 否则，使用逗号分隔 smssOrderDay ， 提取 星期数 或 月日数，顺序排列 （用 LinkedHashSet）*/
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        String[] smssOrderDayArr = smssOrderDay.split(",");
        Arrays.sort(smssOrderDayArr);
        for(String smssOrderDayEle : smssOrderDayArr){
            linkedHashSet.add(Integer.parseInt(smssOrderDayEle));
        }

        /**3. 假如 nrt_type == 1 */
        if(nrtType == 1){
            /**1. 提取 validDate 的 星期数 (dayOfWeek) ， 假如 星期数在 smssOrderDay 中，则 validDate就是第一下单日 （记为 firstOrderDay） 。
             * 否则根据 smssOrderDay 的星期数，寻找大于并且最近的一天符合星期数的日期，作为第一下单日。*/
            int validDateWeekNo = dayOfWeek(validDate);
            Date firstOrderDay = null;
            Date nextOrderDay = null;
            boolean isInOneWeek = false;

            if(linkedHashSet.contains(validDateWeekNo)){
                 firstOrderDay = validDate;
            }else{
                //如果validDate 的星期数小于已有的某一个星期数，则取这个星期数进行计算，如果没有小于这个validDate的星期数，计算结果属于当前日期
                // 则取linkedHashSet的第一个星期数进行计算，计算结果日期属于下一个星期
                for(int dayOfWeekNo : linkedHashSet){
                    if(validDateWeekNo < dayOfWeekNo){
                        Long resultTime = validDate.getTime() + (dayOfWeekNo - validDateWeekNo) * day;
                        firstOrderDay = new Date(resultTime);
                        isInOneWeek = true;
                    }
                }
                if(!isInOneWeek){
                    int dayOfWeekNumber = linkedHashSet.iterator().next();
                    Long resultTime = validDate.getTime() + (7 - validDateWeekNo + dayOfWeekNumber) * day;
                    firstOrderDay = new Date(resultTime);
                }
            }
            /**2. 获取 firstOrderDay 这一周的周一的日期，记为 firstOrderWeekMonday 。获取 currentDate 这一周的周一的日期，
             * 记为 currentWeekMonday 。计算 （currentWeekMonday - firstOrderWeekMonday) / 7 % smssNrt  （这是计算周数差差对smssNrt的余数） ,
             * 记为 weekDistance . */
            Date firstOrderWeekMonday = getWeekMonday(firstOrderDay);
            Date currentWeekMonday = getWeekMonday(currentDate);
            int weekDistance = (int)((currentWeekMonday.getTime() - firstOrderWeekMonday.getTime()) / week) % Integer.parseInt(smssNrt);


            /**1.假如 weekDistance == 0，表示 currentWeekMonday 这一周可以下单 */
            if(weekDistance == 0){
                    int currentDateWeekNo = dayOfWeek(currentDate);
                    Date candidateOrderDay = null;
                    boolean isInOneWeekCurr = false;

                /**1.假如 currentDate 的星期数 在 smssOrderDay 中。那么 currentDate 就是下单日。
                 * 寻找大于并距离 currentDate 最近的一天符合星期数的日期， 记为 candidateOrderDay. */
                    if(linkedHashSet.contains(currentDateWeekNo)){
                        for(int dayOfWeekNo : linkedHashSet){
                            if(currentDateWeekNo < dayOfWeekNo){
                                Long resultTime = currentDate.getTime() + (dayOfWeekNo - currentDateWeekNo) * day;
                                candidateOrderDay = new Date(resultTime);
                                isInOneWeekCurr = true;
                            }
                        }
                        /**1.假如 smssNrt == 1 并且 candidateOrderDay 和 currentDate 在同一周。 那么 candidateOrderDay 作为下一个下单日（ nextOrderDay ）。
                         * 返回的 Triple 中的 Integer 就是 nextOrderDay - currentDate .*/
                        /**2. 否则。 计算 nextOrderWeekMonday = currentWeekMonday + smssNrt * 7 . 表示在 nextOrderWeekMonday 的这一周可以下单。
                         * 寻找大于等于 nextOrderWeekMonday，并且最近的一天符合星期数的日期，作为下一个下单日 nextOrderDay 。*/
                        if(StringUtils.equals("1",smssNrt) && isInOneWeekCurr){
                            nextOrderDay = candidateOrderDay;
                            interval = (int)((nextOrderDay.getTime() - currentDate.getTime())/day);
                        }else{
                            nextOrderDay = nextOrderDay(currentWeekMonday, smssNrt, linkedHashSet);
                            interval = (int)((nextOrderDay.getTime() - currentDate.getTime())/day);
                        }
                        triple.setIsOrderDay(true);
                        triple.setOrderDay(nextOrderDay);
                        triple.setInterval(interval);
                    }
                    /**2.假如 currentDate 的星期数 不在 smssOrderDay 中。那么 currentDate 就不是下单日。 寻找大于并距离 currentDate
                     * 最近的一天符合星期数的日期， 记为 candidateOrderDay. */
                    if(!linkedHashSet.contains(currentDateWeekNo)) {
                        for(int dayOfWeekNo : linkedHashSet) {
                            if (currentDateWeekNo < dayOfWeekNo) {
                                Long resultTime = currentDate.getTime() + (dayOfWeekNo - currentDateWeekNo) * day;
                                candidateOrderDay = new Date(resultTime);
                                isInOneWeekCurr = true;
                            }
                        }
                        /**1.假如 candidateOrderDay 和 currentDate 在同一周 。 那么 candidateOrderDay 作为下一个下单日（ nextOrderDay ）。
                         * 返回的 Triple 中的 Integer 就是 nextOrderDay - currentDate .*/
                        /**2.否则  计算 nextOrderWeekMonday = currentWeekMonday + smssNrt * 7 . 表示在 nextOrderWeekMonday 的这一周可以下单。
                         * 寻找大于等于 nextOrderWeekMonday，并且最近的一天符合星期数的日期，作为下一个下单日 nextOrderDay 。*/
                        if(isInOneWeekCurr){
                            nextOrderDay = candidateOrderDay;
                            interval = (int)((nextOrderDay.getTime() - currentDate.getTime())/day);
                        }else{
                            nextOrderDay = nextOrderDay(currentWeekMonday, smssNrt, linkedHashSet);
                            interval = (int)((nextOrderDay.getTime() - currentDate.getTime())/day);
                        }
                        triple.setIsOrderDay(false);
                        triple.setOrderDay(nextOrderDay);
                        triple.setInterval(interval);
                    }
                }
                /**2. 假如 weekDistance > 0 , 表示 currentDate 这周不可以下单 ，currentDate 一定不是下单日。
                 * 计算 nextOrderWeekMonday = currentWeekMonday + weekDistance * 7 , 表示在 nextOrderWeekMonday 的这一周可以下单。
                 * 寻找大于等于 nextOrderWeekMonday，并且最近的一天符合星期数的日期，作为下一个下单日 nextOrderDay 。 */
                if(weekDistance > 0){
                    long nextOrderWeekMondayTime = currentWeekMonday.getTime() + weekDistance * week;
                    Date nextOrderWeekMonday = new Date(nextOrderWeekMondayTime);
                    //因为是周一,所以自然是每一周的第一天，计算时候直接取1
                    int dayOfWeekNumber = linkedHashSet.iterator().next();
                    Long nextOrderDayTime = nextOrderWeekMonday.getTime() + (dayOfWeekNumber - 1) * day;
                    nextOrderDay  = new Date(nextOrderDayTime);
                    interval = (int)((nextOrderDay.getTime() - currentDate.getTime())/day);
                    triple.setIsOrderDay(false);
                    triple.setOrderDay(firstOrderDay);
                    triple.setInterval(interval);
                }
        }
        return triple;
    }

    private static Date nextOrderDay(Date currentWeekMonday,String smssNrt,LinkedHashSet<Integer> linkedHashSet){
        long resultTime = currentWeekMonday.getTime() + Integer.parseInt(smssNrt) * week;
        Date nextOrderWeekMonday = new Date(resultTime);
        //因为是周一,所以自然是每一周的第一天，计算时候直接取1
        int dayOfWeekNumber = linkedHashSet.iterator().next();
        Long nextOrderDayTime = nextOrderWeekMonday.getTime() + (dayOfWeekNumber - 1) * day;
        Date nextOrderDay  = new Date(nextOrderDayTime);
        return nextOrderDay;
    }

    /**
     * 获取给定日期的周几
     * @param date
     * @return
     */
    private static int dayOfWeek(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int result = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        //0说明是星期日
        if(result == 0){
            result = 7;
        }
        return result;
    }

    /**
     * 获取给定时间所属周的周一日期
     * @param date
     * @return
     */
    private static Date getWeekMonday(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int result = calendar.get(Calendar.DAY_OF_WEEK);
        if(result == 1){
            calendar.add(Calendar.DAY_OF_MONTH, -1);
        }
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        calendar.add(Calendar.DATE, calendar.getFirstDayOfWeek()-day);
        return calendar.getTime();
    }

    public static void main(String[] args){
        getWeekMonday(new Date(new Date().getTime()+3600000*24*14));
    }
}
