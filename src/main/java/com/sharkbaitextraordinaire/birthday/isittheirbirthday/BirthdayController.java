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

    @Autowired
    public void setBirthdayConfiguration(BirthdayConfiguration birthdayConfiguration) {
        this.birthdayConfiguration = birthdayConfiguration;
    }

    @RequestMapping("/")
    public String isItTheirBirthday(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", birthdayConfiguration.getCelebrantName());
        model.addAttribute("title", "is it " + birthdayConfiguration.getCelebrantName() + "'s birthday today?");
        // TODO this might need to be configurable later
        ZoneId tz = ZoneId.of("America/Los_Angeles");
        MonthDay today = MonthDay.now(tz);
        // TODO we should probably use some skew for comparison, but this works for now
        if (today.equals(birthdayConfiguration.getBirthdayDate())) {
            model.addAttribute("answer", "YES");
        } else {
            model.addAttribute("answer", "NO");
        }
        return "index";
    }
}
