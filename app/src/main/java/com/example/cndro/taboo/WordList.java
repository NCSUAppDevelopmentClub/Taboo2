package com.example.cndro.taboo;

import java.util.ArrayList;

/**
 * Created by Jay on 2/27/2017.
 */

public class WordList {


    private ArrayList<String> words;

    public WordList(){
        words = new ArrayList<String>();
        words.add("First");
        words.add("Second");
        words.add("Third");
        words.add("Fourth");
        words.add("Fifth");
    }

    public String get(int idx){
        return words.get(idx);
    }

    public int size(){
        return words.size();
    }
}
