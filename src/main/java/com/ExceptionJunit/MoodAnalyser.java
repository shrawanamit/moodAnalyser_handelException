package com.ExceptionJunit;

public class MoodAnalyser {
    private String message;
    public MoodAnalyser(){}

    public MoodAnalyser(String message){
        this.message=message;
    }
    public String analyseMood(String message) {
        if(message.contains("sad")) {
            return "SAD";
        } else{
            return "HAPPY";
        }
    }
}
