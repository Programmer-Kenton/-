package com.sky.service;

import com.sky.vo.TurnoverReportVO;

import java.time.LocalDate;

/**
 * @Description TODO
 * @Version 1.0.0
 * @Date 2024/7/11 16:12
 * @Github https://github.com/Programmer-Kenton
 * @Author Kenton
 */

public interface ReportService {

    /**
     * 统计指定时间区间内的营业额数据
     * @param begin
     * @param end
     * @return
     */
    TurnoverReportVO getTurnoverStatistics(LocalDate begin, LocalDate end);
}
