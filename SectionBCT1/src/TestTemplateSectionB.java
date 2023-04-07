package SectionB;


//import SectionE.VectorR4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TestTemplateSectionB {

    static ArrayList<WordContainer> wordList = new ArrayList<>();


    public static void main(String[] args) {
        // Create a wordContainer class at first with required variables
        // 1. iterate through Iterator -2
        // use an iterator to iterate through the word list. The iterator should be a static method
        // for printing you have to override the ToString method of the WordContainer class

        wordList.add(new WordContainer("AOOP"));
        wordList.add(new WordContainer("is"));
        wordList.add(new WordContainer("not"));
        wordList.add(new WordContainer("fun"));
        Iterator<WordContainer> iterate = wordList.iterator();

        while (iterate.hasNext())
        {
            System.out.print(iterate.next().toString());
        }
        System.out.println();
        // 2. sort by word length of each object with comparable and print the values - 2

//        while (iterate.hasNext())
//        {
//            System.out.print(iterate.next().compareTo(iterate));
//        }

        Collections.sort(wordList);

        Iterator<WordContainer> iterate2 = wordList.iterator();

        while (iterate2.hasNext())
        {
            System.out.print(iterate2.next().toString());
        }


        // done



        // 3. Write a custom ascii method to sort the words by Comparator interface. Explained in the class - 3

        Collections.sort(wordList, new FOR_COMPARE());


        // 4. hashmap  - 2
        // create a Hashmap with word string as KEY and length as value and put the words and their lengths in the



//        HashMap<String, Integer> hasmap = convertArrayListToHashMap(wordList);
//
//        private static HashMap<String, Integer>convertArrayListToHashMap(ArrayList<WordContainer> arrayList)
//        {
//
//            HashMap<String, Integer> hashMap = new HashMap<>();
//
//            for (String str : arrayList) {
//
//                hashMap.put(str, str.length());
//            }
//
//            return hashMap;
//        }

              HashMap<String, Integer> hasmap = new HashMap<>();

        Iterator<WordContainer> iterate3 = wordList.iterator();

        while (iterate3.hasNext())
        {

            hasmap.put(iterate3.next().str, iterate.next().str.length());

        }








        // hashmap. Then change the length of the word at 0th index to 0

        //---------BONUS PROBLEM --------- ( You Don't need to do this, if you do, you would get extra marks ) - 4
        // But you should do the given problems first, if you attempt this before the main problems, you would get no marks
        /**
         * Write a method using hashmap that checks if a string is Anagram of another string. It returns true if the two strings are anagram else false. examples
         * Listen , Silent
         * race, care
         */






    }
}
