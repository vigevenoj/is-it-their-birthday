package com.sharkbaitextraordinaire.birthday.isittheirbirthday;

import com.sharkbaitextraordinaire.birthday.isittheirbirthday.config.BirthdayConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.MonthDay;
import java.time.ZoneId;

@Component
public class BirthdayChecker {

    private BirthdayConfiguration birthdayConfiguration;

    @Autowired
    public void setBirthdayConfiguration(BirthdayConfiguration birthdayConfiguration) {
        this.birthdayConfiguration = birthdayConfiguration;
    }

    public boolean isItTheirBirthdayToday() {
        ZoneId tz = ZoneId.of("America/Los_Angeles");
        MonthDay today = MonthDay.now(tz);
        return today.equals(birthdayConfiguration.getBirthdayDate());
    }

    public String yesOrNo() {
        if(isItTheirBirthdayToday()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
