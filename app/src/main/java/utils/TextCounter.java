package utils;

import android.content.Context;
import android.widget.Toast;

public class TextCounter {

    public static String getCharsCount(String input) {
        if (input == null || input.isEmpty()) {
            return "0";
        }
        else {
            return String.valueOf(input.length());
        }
    }

    public static String countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
            return "0";
        }
        else {
            String[] words = input.split("\\s+");
            return String.valueOf(words.length);
        }
    }
}
