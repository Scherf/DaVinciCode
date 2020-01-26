package de.scherf.davincicode;

import java.util.*;

public class Decrypter {

    public List<String> decrypt(String input) {
        StringTokenizer words = new StringTokenizer(input, "–");
        Iterator<Object> wordIterator = words.asIterator();
        List<String> wordList = new ArrayList<>();
        while (wordIterator.hasNext()){
            String word = (String) wordIterator.next();
            StringTokenizer letters = new StringTokenizer(word, " ");
            Iterator<Object> letterIterator = letters.asIterator();
            StringBuilder newWord = new StringBuilder();
            while (letterIterator.hasNext()) {
                String letter = (String) letterIterator.next();
                String decryptedLetter = replaceLetter(letter);
                newWord.append(decryptedLetter);
            }
            wordList.add(newWord.toString());
        }
        return wordList;
    }

    private String replaceLetter(String letter) {
        String mappedKey = getKeys().get(letter);
        if (mappedKey == null){
            mappedKey = "- " + letter;
        }
        return mappedKey;
    }

    private Map<String, String> getKeys() {
        Map<String, String> keys = new HashMap<>();
        keys.put("14","A");
        keys.put("10","B");
        keys.put("19","C");
        keys.put("17","D");
        keys.put("22","E");
        keys.put("0","F");
        keys.put("7","G");
        keys.put("25","H");
        keys.put("24","I");
        keys.put("6","J");
        keys.put("20","K");
        keys.put("15","L");
        keys.put("12","M");
        keys.put("23","N");
        keys.put("5","O");
        keys.put("1","P");
        keys.put("2","Q");
        keys.put("8","R");
        keys.put("16","S");
        keys.put("4","T");
        keys.put("3","U");
        keys.put("9","V");
        keys.put("13","W");
        keys.put("21","X");
        keys.put("11","Y");
        keys.put("18","Z");
        return keys;
    }
}
