package com.ExceptionJunit;

public class MoodAnalyser {
    private String message;
    public MoodAnalyser(){}

    public MoodAnalyser(String message) {
        this.message=message;
    }
    public String analyseMood(String message) throws MoodException {
        this.message=message;
        return analyseMood();
    }
    public String analyseMood() throws MoodException {
        try {
            if (message.length() == 0) {
                throw new MoodException(MoodException.ExceptionType.ENTERED_EMPTY,"please enter proper mood");
            }
            if (message.contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }
        catch(NullPointerException e){
           throw new MoodException(MoodException.ExceptionType.ENTERED_NULL,"please enter proper mood");
        }
    }
}
