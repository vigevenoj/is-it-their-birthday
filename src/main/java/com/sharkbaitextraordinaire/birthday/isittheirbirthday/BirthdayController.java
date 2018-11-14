package com.sharkbaitextraordinaire.birthday.isittheirbirthday;

import com.sharkbaitextraordinaire.birthday.isittheirbirthday.config.BirthdayConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.MonthDay;
import java.time.ZoneId;

@Controller
public class BirthdayController {

    private BirthdayConfiguration birthdayConfiguration;
    private BirthdayChecker birthdayChecker;

    @Autowired
    public void setBirthdayConfiguration(BirthdayConfiguration birthdayConfiguration) {
        this.birthdayConfiguration = birthdayConfiguration;
    }

    @Autowired
    public void setBirthdayChecker(BirthdayChecker birthdayChecker) {
        this.birthdayChecker = birthdayChecker;
    }

    @RequestMapping("/")
    public String isItTheirBirthday(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", birthdayConfiguration.getCelebrantName());
        model.addAttribute("title", "is it " + birthdayConfiguration.getCelebrantName() + "'s birthday today?");
        model.addAttribute("answer", birthdayChecker.yesOrNo());
        return "index";
    }
}
