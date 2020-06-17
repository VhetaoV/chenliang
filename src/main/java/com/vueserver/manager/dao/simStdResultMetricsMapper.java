package com.vueserver.manager.dao;

import com.vueserver.manager.entity.simStdResultMetrics;
import java.util.List;

public interface simStdResultMetricsMapper {
    int insert(simStdResultMetrics record);

    List<simStdResultMetrics> selectAll();
}