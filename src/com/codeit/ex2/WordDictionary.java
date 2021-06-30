package com.codeit.ex2;

import java.util.HashMap;

public class WordDictionary {
    private HashMap<String, String> dictionary = new HashMap<>();

    public WordDictionary(){

    }

    public void addWord(String key, String name){
        this.dictionary.put(key.toUpperCase(),name);
    }
    public String find(String key){
        return this.dictionary.get(key.toUpperCase());
    }

}
