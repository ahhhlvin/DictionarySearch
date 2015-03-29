package nyc.c4q.ahhhlvin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Dictionary dictionary = new Dictionary("/Users/alvin2/IdeaProjects/DictionarySearch/src/nyc/c4q/ahhhlvin/words");
        // System.out.println(dictionary.getWords());

        ArrayList<String> results = dictionary.fullSearch("aye");
        for (String word : results) {
            System.out.println(word);
        }

        /*ArrayList<String> preResults = dictionary.prefixSearch("about");
        System.out.println(preResults);

        ArrayList<String> suffResults = dictionary.suffixSearch("about");
        System.out.println(suffResults);


*/

    }
}
