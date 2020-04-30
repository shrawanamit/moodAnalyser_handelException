package com.ExceptionJunit;

public class MoodAnalyser {
    private String message;
    public MoodAnalyser(){}

    public MoodAnalyser(String message){
        this.message=message;
    }
    public String analyseMood(String message) {
        try {
            if (message.contains("sad")) {
                return "SAD";
            } else {
                throw  null;
            }
        }
        catch(NullPointerException e){
            return "HAPPY";
        }
    }
}
