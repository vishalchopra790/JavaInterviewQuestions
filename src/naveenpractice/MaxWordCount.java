package naveenpractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MaxWordCount {
    public static void main(String[] args) {
        BufferedReader bufferedReader=null;
        Map<String, Integer> map=new HashMap<String, Integer>();
        try {
            bufferedReader=new BufferedReader(new FileReader("D:\\Vishal\\Selenium\\Java Practice\\JavaInterviewQuestions\\demo.txt"));
            String currline=bufferedReader.readLine();
            while(currline != null){

                String[] words=  currline.split(" ");
                for(String word : words){
                    if(!word.isEmpty()){
                        if(map.containsKey(word))
                            map.put(word,map.get(word)+1);
                        else
                            map.put(word,1);
                    }
                }


                currline=bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(map);
        Map<String, Integer> resultMap=new HashMap<>();
        map.entrySet()
                .stream()
                .filter(e->e.getValue()== Collections.max(map.values())).forEach(e->resultMap.put(e.getKey(), e.getValue()));
        resultMap.entrySet().forEach(System.out::println);
    }
}
