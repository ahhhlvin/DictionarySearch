package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/28/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {


    private final ArrayList<String> words;



    public Dictionary(String filename) throws FileNotFoundException {
        words = new ArrayList<String>();

        Scanner scanner = new Scanner(new File(filename));
        while(scanner.hasNext()) {
            String word = scanner.nextLine();
            words.add(word);
        }
    }


    public ArrayList<String> fullSearch(String term) {
        ArrayList<String> results = new ArrayList<String>();

        for(String word: words) {
            if (word.contains(term)) {
                results.add(word);
            }
        }

        return results;
    }





    public ArrayList<String> prefixSearch(String term) {
        ArrayList<String> preResults = new ArrayList<String>();

        for(String word: words) {
            if (word.startsWith(term)) {
                preResults.add(word);
            }
        }

        return preResults;
    }





    public ArrayList<String> suffixSearch(String term) {
        ArrayList<String> suffResults = new ArrayList<String>();

        for(String word: words) {
            if (word.endsWith(term)) {
                suffResults.add(word);
            }
        }

        return suffResults;
    }

}
