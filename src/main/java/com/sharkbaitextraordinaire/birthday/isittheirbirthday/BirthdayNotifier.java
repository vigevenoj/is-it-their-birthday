package com.sharkbaitextraordinaire.birthday.isittheirbirthday;

import com.sharkbaitextraordinaire.birthday.isittheirbirthday.config.BirthdayConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BirthdayNotifier {

    private static final Logger log = LoggerFactory.getLogger(BirthdayNotifier.class);
    private BirthdayConfiguration birthdayConfiguration;
    private BirthdayChecker birthdayChecker;

    @Autowired
    public void setBirthdayConfiguration(BirthdayConfiguration birthdayConfiguration) {
        this.birthdayConfiguration = birthdayConfiguration;
    }

    public void setBirthdayChecker(BirthdayChecker birthdayChecker) {
        this.birthdayChecker = birthdayChecker;
    }

    // run this check at midnight every day:
    @Scheduled(cron="0 0 0 * * *")
    public void checkIfItIsTheirBirthday() {
        log.info("Checking if it is our user's birthday");
        // TODO get user's name from configuration
        // TODO get user's birthday from configuration
        // TODO determine how many days it is until user's birthday
        // TODO determine notification paths
        // TODO send notifications about how many days it is until their birthday
    }

    public boolean isItTheirBirthday() {
        return true;
    }
}
