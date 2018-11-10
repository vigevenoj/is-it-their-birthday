package com.sharkbaitextraordinaire.birthday.isittheirbirthday;

import com.sharkbaitextraordinaire.birthday.isittheirbirthday.config.BirthdayConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BirthdayController {

    private BirthdayConfiguration birthdayConfiguration;

    @Autowired
    public void setBirthdayConfiguration(BirthdayConfiguration birthdayConfiguration) {
        this.birthdayConfiguration = birthdayConfiguration;
    }

    // TODO inject our user's name from the application configuration
    // TODO inject our user's birthday from the application configuration
    // TODO compare current date (plus skew) to user's birthday from configuration

    @RequestMapping("/")
    public String isItTheirBirthday(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", birthdayConfiguration.getCelebratorName());
        return "index";
    }
}
