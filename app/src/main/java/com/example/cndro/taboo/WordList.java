package com.example.cndro.taboo;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jay on 2/27/2017.
 */

public class WordList {

    private ArrayList<String> words;
    private int size;

    public WordList(InputStream is){
        Scanner s = new Scanner(is);
        words = new ArrayList<String>();

        while(s.hasNext()) {
            words.add(s.nextLine());
        }
    }

    public String get(int idx){
        return words.get(idx);
    }

    public int size(){
        return words.size();
    }
}
