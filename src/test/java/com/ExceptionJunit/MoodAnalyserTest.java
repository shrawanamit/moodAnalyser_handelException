package com.ExceptionJunit;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void should_return_SAD_if_message_contains_sad() throws MoodException{
        MoodAnalyser moodAnalyser=new MoodAnalyser("I am in sad mood");
        String mood_status=moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", mood_status);
    }
    @Test
    public void should_return_HAPPY_if_message_not_contains_sad() throws MoodException{
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String mood_status = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood_status);
    }

    @Test
    public void given_NUll_shouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try{
            moodAnalyser.analyseMood();
        }catch (MoodException e){
            Assert.assertEquals(MoodException.ExceptionType.ENTERED_NULL, e.type);
        }

    }

    @Test
    public void given_Empty_shouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try{
            moodAnalyser.analyseMood();
        }catch (MoodException e){
            Assert.assertEquals(MoodException.ExceptionType.ENTERED_EMPTY, e.type);
        }


    }

//    @Test
//    public void given_Null_shouldReturnHappy() throws MoodException{
//        MoodAnalyser moodAnalyser = new MoodAnalyser();
//        thrown.expect(MoodException.class);
//        thrown.expectMessage("this is no mood");
//        String mood_status = moodAnalyser.analyseMood();
//    }
}
