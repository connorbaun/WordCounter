import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) {
        //make a hashmap of String to Integers
        Map<String, Integer> wordCount = new HashMap<>();

        //here is my paragraph of words
        String paragraph = "The cat ran over the fence. The dog ran back to the house.";

        //chop that paragraph into an array. Each index is a new word.
        String[] words = paragraph.split("\\W+"); //regEx is Regular Expressions; split at every non-word symbol

        //add all the words to the HashMap
        //if a word is already in the HashMap and we see it come up again, increment its Integer value.
        for (String word : words) {
            word = word.toLowerCase(); //make words all lowercase to prevent 'The' and 'the' from being counted as 2 different words
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        //print out all keys and their values
        System.out.println(wordCount);


        //add your code below:



    }

}
