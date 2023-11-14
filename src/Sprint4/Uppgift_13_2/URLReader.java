package Sprint4.Uppgift_13_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class URLReader {

    private List<Word> wordList = new ArrayList<>();

    URLReader() throws IOException {
        URL text = new URL("https://raw.githubusercontent.com/dwyl/english-words/master/words.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(text.openStream()));
        populateWordList(reader);
        reader.close();
        sortWordList();
        printWordList();
    }

    protected void populateWordList(BufferedReader reader) throws IOException {
        String inputLine;
        while ((inputLine = reader.readLine()) != null) {
            int lineLength = inputLine.length();
            if (!doesWordExist(lineLength)) {
                wordList.add(new Word(lineLength));
            } else {
                addCount(lineLength);
            }
        }
    }

    public boolean doesWordExist(int length) {
        boolean exists = false;
        for (Word word : wordList) {
            if (word.getLength() == length)
                exists = true;
        }
        return exists;
    }

    public void addCount(int length) {
        for (Word word : wordList) {
            if (word.getLength() == length) {
                word.addCount();
            }
        }
    }

    public void sortWordList() {
        class wordComparator implements Comparator<Word> {
            @Override
            public int compare(Word word, Word other) {
                return word.getLength() - other.getLength();
            }
        }
        wordComparator comparator = new wordComparator();
        wordList.sort(comparator);
    }

    public void printWordList() {
        int totalCount = 0;
        for (Word word : wordList) {
            System.out.println("Ord med längd " + word.getLength() + ": \t" + word.getCount() + " förekomster");
            totalCount += word.getCount();
        }
        System.out.println("Totalt antal ord:\t" + totalCount);
    }

    public static void main(String[] args) throws IOException {
        new URLReader();


    }
}
