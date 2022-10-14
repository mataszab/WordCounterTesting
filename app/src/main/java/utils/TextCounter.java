package utils;

import android.content.Context;
import android.widget.Toast;

public class TextCounter {

    public static String getCharsCount(String input, Context context) {
        if (input == null || input.isEmpty()) {
            Toast.makeText(context, "Text field is empty!", Toast.LENGTH_LONG).show();
            return "0";
        }
        else {
            return String.valueOf(input.length());
        }
    }

    public static String countWordsUsingSplit(String input, Context context) {
        if (input == null || input.isEmpty()) {
            Toast.makeText(context, "Text field is empty!", Toast.LENGTH_LONG).show();
            return "0";
        }
        else {
            String[] words = input.split("\\s+");
            return String.valueOf(words.length);
        }
    }
}
