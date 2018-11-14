package com.sharkbaitextraordinaire.birthday.isittheirbirthday.api;

public class BirthdayApiResponse {

    private String answer;

    public BirthdayApiResponse(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return this.answer;
    }
}
