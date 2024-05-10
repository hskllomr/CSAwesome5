import java.io.*;
import java.nio.file.*;
import java.util.*;

public class SpellChecker
{
    // This dictionary includes 10,000 English words read in from the dictionary
    // file
    private String[] dictionary = new String[10000];

    /* Write a spellcheck() method using an enhanced for each loop
     * that takes a word as a parameter and returns true if it is
     * in the dictionary array. Return false if it is not found.
     */

    public boolean spellcheck(String word)
    {
        for(String w:dictionary)
        {
            if(word.equals(w))
            {
                return true;
            }
        }
        return false;
    }

    /* Write a checkText() method that takes a String[] parameter which is a sentence
     * of text in a String array and then calls your spellcheck method above
     * to check if each word in that text is spelled correctly.
     * Use an enhanced for each loop.
     * It should count and print out the misspelled words, and return the count.
     */
    public int checkText(String[] sentence)
    {
        int count=0;
        for(String word:sentence)
        {
            if(spellcheck(word))
            {
                count=count+1;
            }
        }
        return count;

    }

    // Do not change "throws IOException" which is needed for reading in the input
    // file
    public static void main(String[] args) throws IOException
    {
        SpellChecker checker = new SpellChecker();
        // Uncomment to test your method
        String word = "catz";
        System.out.println(word + " is spelled correctly? " + checker.spellcheck(word));
        System.out.println(word + " is spelled correctly? " + checker.spellcheck("cat"));

        // Testing checkText method
        String text = "Catz are cool aminals!";
        // replace punctuation symbols with empty string
        text = text.replaceAll("\\p{Punct}", "");
        // convert to lowercase
        text = text.toLowerCase();
        // split the text into a String array
        String[] words = text.split(" ");
        // Call your checkText method
        int numErrors = checker.checkText(words);
        System.out.println("There were " + numErrors + " spelling errors in " + text);

    }