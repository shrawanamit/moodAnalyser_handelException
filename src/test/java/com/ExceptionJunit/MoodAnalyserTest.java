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
}
