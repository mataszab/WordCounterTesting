package com.example.a2laboratorinis;

import org.junit.Test;

import static org.junit.Assert.*;

import java.text.Format;

import utils.TextCounter;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Test01GetCharsCount() {
        String input = null;
        int expectedValue = 0;
        int inputValue = Integer.valueOf(TextCounter.getCharsCount(input));
        assertEquals(expectedValue, inputValue);
    }

    @Test
    public void Test02GetCharsCount() {
        String input = "";
        int expectedValue = 0;
        int inputValue = Integer.valueOf(TextCounter.getCharsCount(input));
        assertEquals(expectedValue, inputValue);
    }

    @Test
    public void Test03GetCharsCount() {
        String input = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
        int expectedValue = 30;
        int inputValue = Integer.valueOf(TextCounter.getCharsCount(input));
        assertEquals(expectedValue, inputValue);
    }


    @Test
    public void Test01CountWordsUsingSplit() {
        String input = null;
        int expectedValue = 0;
        int inputValue = Integer.valueOf(TextCounter.countWordsUsingSplit(input));
        assertEquals(expectedValue, inputValue);
    }

    @Test
    public void Test02CountWordsUsingSplit() {
        String input = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
        int expectedValue = 1;
        int inputValue = Integer.valueOf(TextCounter.countWordsUsingSplit(input));
        assertEquals(expectedValue, inputValue);
    }

    @Test
    public void Test03CountWordsUsingSplit() {
        String input = "! # $ % & ' ( ) * + , - . / : ; < = > ? @ [ ] ^ _ ` { | } ~";
        int expectedValue = 30;
        int inputValue = Integer.valueOf(TextCounter.countWordsUsingSplit(input));
        assertEquals(expectedValue, inputValue);
    }
}