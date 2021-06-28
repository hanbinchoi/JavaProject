package d.string.practice;

import java.util.Locale;

public class UseStringMethods {
    public static void main(String[] args){
        UseStringMethods sample = new UseStringMethods();
        String sentence = "The String class represents character strings.";
        sample.printWords(sentence);
        sample.findString(sentence, "string");
        sample.findAnyCaseString(sentence,"string");
        sample.countChar(sentence,'s');
        sample.printContainWords(sentence,"ss");
    }
    public void printWords(String str){
        String[] words = str.split(" ");
        for(String word:words){
            System.out.println(word);
        }
    }
    public void findString(String str, String findStr){
        System.out.println(str.indexOf(findStr));
    }
    public void findAnyCaseString(String str, String findStr){
        System.out.println(str.toLowerCase().indexOf(findStr.toLowerCase()));
    }

    public void countChar(String str, char c){
        char[] array = str.toCharArray();

        int count = 0;
        for(char i:array){
            if (i==c) count +=1;
        }
        System.out.println(count);
    }
    public void printContainWords(String str, String findStr){
        String[] words = str.split(" ");

        for(String word:words){
            if(word.contains(findStr)) System.out.println(word);
        }
    }

}
