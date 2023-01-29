package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_whenProper_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is sad message");
        System.out.println(mood);
        Assertions.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessage_whenProper_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is happy message");
        System.out.println(mood);
        Assertions.assertEquals("HAPPY",mood);
    }
}
