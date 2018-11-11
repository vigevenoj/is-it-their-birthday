package com.sharkbaitextraordinaire.birthday.isittheirbirthday.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;
import java.time.MonthDay;

@Component
@ConfigurationProperties
public class BirthdayConfiguration {

    @NotEmpty
    private String celebrantName;
    // MonthDay is formatted "--MM-dd", like "--11-14" or "--12-03"
    private MonthDay birthdayDate;

    public String getCelebrantName() {
        return this.celebrantName;
    }

    public void setCelebrantName(String celebrantName) {
        this.celebrantName = celebrantName;
    }

    public MonthDay getBirthdayDate() {
        return this.birthdayDate;
    }

    public void setBirthdayDate(MonthDay birthdayDate) {
        this.birthdayDate = birthdayDate;
    }
}
