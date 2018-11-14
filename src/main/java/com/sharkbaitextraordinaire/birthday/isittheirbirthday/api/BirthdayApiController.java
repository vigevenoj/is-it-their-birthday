package com.sharkbaitextraordinaire.birthday.isittheirbirthday.api;

import com.sharkbaitextraordinaire.birthday.isittheirbirthday.BirthdayChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BirthdayApiController {

    private BirthdayChecker birthdayChecker;

    @Autowired
    public void setBirthdayChecker(BirthdayChecker birthdayChecker) {
        this.birthdayChecker = birthdayChecker;
    }

    @RequestMapping(value = "/isitreallythough", method = RequestMethod.GET, produces = {"application/json"}, consumes = MediaType.ALL_VALUE)
    public BirthdayApiResponse isItReallyThough() {
        return new BirthdayApiResponse(birthdayChecker.yesOrNo());
    }
}
