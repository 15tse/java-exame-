package hashmap;

import java.util.HashSet;
import java.util.Set;

public class Dictionary {
	 private Set<String> wordSet;

	    public Dictionary(String[] words) {
	        wordSet = new HashSet<>();
	        for (String word : words) {
	            wordSet.add(word.toLowerCase());
	        }
	    }

	    public boolean containsWord(String word) {
	        return wordSet.contains(word.toLowerCase());
	    }

	    public static void main(String[] args) {
	        String[] dictionaryWords = {"apple", "banana", "cherry"};
	        Dictionary dictionary = new Dictionary(dictionaryWords);

	        System.out.println(dictionary.containsWord("apple")); // true
	        System.out.println(dictionary.containsWord("grape")); // false
	    }


}
