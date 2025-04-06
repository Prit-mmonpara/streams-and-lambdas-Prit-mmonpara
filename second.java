// Q2. Word Frequency Counter
// Given a list of words, return a map with the frequency of each word.

// Input: ["apple", "banana", "apple"]
// Output: {apple=2, banana=1}
import java.util.*;

public class second {
    public static void main(String[] args)
    {
        String[] words = {"apple", "banana", "apple"};
        LinkedHashMap<String, Integer> wordCount = new LinkedHashMap<>();

        for(String word: words)
        {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for(Map.Entry<String, Integer> entry: wordCount.entrySet())
        {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
