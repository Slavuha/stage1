
package com.company;
import java.util.ArrayList;
import java.util.Arrays;
        import java.util.List;
        import java.util.Locale;

public class HomeTask {


    public static void main(String[] args) {
        String text = new String();
        text = "all loves jave. even that.  who do not knows about it";
        uptext(text);
    }
    public static String uptext(String text) {
        while (text.contains("  "))
            text = text.replace("  ", " ");
        text = text.trim();
        text = text.substring(0, 1).toUpperCase() + text.substring(1);
        String[] wordsList = text.split(" ");
        System.out.println(Arrays.toString(wordsList));
        ArrayList<String> wordList2 = new ArrayList<String>(Arrays.asList(wordsList));
        for (String s : wordList2)
            System.out.println(s);
        boolean endOfSentence = false;
        for (String currentWord : wordList2) {

            if (endOfSentence == true) {
                String newWord = currentWord
                        .substring(0, 1)
                        .toUpperCase()
                        + currentWord.substring(1);

                int index = wordList2.indexOf(currentWord);

                wordList2.set(index, newWord);
                endOfSentence = false;
            }
            if (currentWord.endsWith(".")) {
                endOfSentence = true;
            }
        }
     //  String updatedText = String.join(" ", ArrayListwordsList);
    //    System.out.println(updatedText);
        return text;   }
}

