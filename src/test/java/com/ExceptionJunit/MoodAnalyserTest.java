package com.ExceptionJunit;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void should_return_SAD_if_message_contains_sad(){
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood_status=moodAnalyser.analyseMood("I am in sad mood");
        Assert.assertEquals("SAD", mood_status);
    }
    @Test
    public void should_return_HAPPY_if_message_not_contains_sad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood_status = moodAnalyser.analyseMood("I am in any mood");
        Assert.assertEquals("HAPPY", mood_status);
    }
}
