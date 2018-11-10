package com.sharkbaitextraordinaire.birthday.isittheirbirthday.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;
import java.time.MonthDay;

@Component
@ConfigurationProperties
public class BirthdayConfiguration {

    @NotEmpty
    private String celebratorName;
    // MonthDay is formatted "--MM-dd", like "--11-14" or "--12-03"
    private MonthDay birthdayDate;

    public String getCelebratorName() {
        return this.celebratorName;
    }

    public void setCelebratorName(String celebratorName) {
        this.celebratorName = celebratorName;
    }

    public MonthDay getBirthdayDate() {
        return this.birthdayDate;
    }

    public void setBirthdayDate(MonthDay birthdayDate) {
        this.birthdayDate = birthdayDate;
    }
}
