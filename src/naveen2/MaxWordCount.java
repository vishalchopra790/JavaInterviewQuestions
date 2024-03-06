package naveen2;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxWordCount {
    static  String path="D:\\Vishal\\Selenium\\Java Practice\\JavaInterviewQuestions\\demo.txt";
    public static void main(String[] args) {
        Map<String, Integer> wordMap=new HashMap<>();
        BufferedReader reader=null;
        try {
            reader=new BufferedReader(new FileReader(path));
            String currentLine=reader.readLine().trim();
            while(currentLine!=null){
              String[] words=  currentLine.toLowerCase().split(" ");
              for(String word:words){
                  if(!word.isEmpty()) {
                      if (wordMap.containsKey(word)) {
                          wordMap.put(word, wordMap.get(word) + 1);
                      } else {
                          wordMap.put(word, 1);

                      }
                  }
              }
                currentLine=reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        wordMap.forEach((k,v)-> System.out.println(k+":"+v));
        Map<String, Integer> resultMap=new HashMap<>();

        wordMap
                .entrySet()
                .stream()
                .filter(e->e.getValue()== Collections.max(wordMap.values())).forEach(e->resultMap.put(e.getKey(),e.getValue()));
        System.out.println(resultMap);

    }
}
