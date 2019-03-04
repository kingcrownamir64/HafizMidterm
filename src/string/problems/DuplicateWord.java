package string.problems;

import java.util.ArrayList;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        String[] words = st.split(" ");
        int wrc = 1;


        for (int i = 0; i < words.length; i++)
        {
            for (int j = i + 1; j < words.length; j++)
            {

                if (words[i].equals(words[j]))
                {
                    wrc = wrc + 1;
                    words[j] = "0";

                }
            }

            if (wrc > 1) {
                if (words[i] != "0")
                    System.out.println("'" + words[i] + "'" + " repeats " + wrc + " times.");
                wrc = 1;

            }
        }

        float count = 0;
        float temp=0;

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == ' ') {
            } else {
                count++;
            }
        }
        System.out.println("Total number of characters in this string is " + count);
        System.out.println("Total number of words in this string is " + words.length);
        temp = count/words.length;
        System.out.println("Average length of all the words is: " + temp);
    }

    }

