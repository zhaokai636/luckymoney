package com.imooc.mapper;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "limit")
public class LimitConfig {
    String  minManey;
    String maxManey;
    String description;

    public String getMinManey() {
        return minManey;
    }

    public void setMinManey(String minManey) {
        this.minManey = minManey;
    }

    public String getMaxManey() {
        return maxManey;
    }

    public void setMaxManey(String maxManey) {
        this.maxManey = maxManey;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
