package com.vueserver.manager.dao;

import com.vueserver.manager.entity.simStdOrderExecutionDailyLog;
import java.util.List;

public interface simStdOrderExecutionDailyLogMapper {
    int insert(simStdOrderExecutionDailyLog record);

    List<simStdOrderExecutionDailyLog> selectAll();
}