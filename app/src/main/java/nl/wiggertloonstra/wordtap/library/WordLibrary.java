package nl.wiggertloonstra.wordtap.library;

import java.util.ArrayList;
import java.util.List;

public class WordLibrary {

    private static final List<String> words = new ArrayList<>();
    private static int index = 0;

    private static WordLibrary instance;

    private WordLibrary() {
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
    }

    public static WordLibrary getInstance() {
        if (instance == null) {
            instance = new WordLibrary();
        }
        return instance;
    }

    public String getNextWord() {
        String newWord = words.get(index);
        index = (index + 1) % words.size();
        return newWord;
    }
}
