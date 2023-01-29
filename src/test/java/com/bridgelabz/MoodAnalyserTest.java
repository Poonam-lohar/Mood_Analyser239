package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_whenProper_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        System.out.println(mood);
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public void givenMessage_whenProper_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        String mood = moodAnalyser.analyseMood();
        System.out.println(mood);
        Assertions.assertEquals("HAPPY",mood);
    }
}


