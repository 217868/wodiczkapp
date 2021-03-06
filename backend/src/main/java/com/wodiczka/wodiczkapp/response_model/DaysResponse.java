package com.wodiczka.wodiczkapp.response_model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;
import org.springframework.context.annotation.Lazy;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class DaysResponse {
    @JsonProperty("totalDaysLiters")
    int totalDayLiters;
    @JsonProperty("days")
    List<DailyUsage> days;

    public DaysResponse(int totalDayLiters, @Lazy List<DailyUsage> days) {
        this.totalDayLiters = totalDayLiters;
        this.days = days;
    }
}
