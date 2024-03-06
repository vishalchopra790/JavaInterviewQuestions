package naveenpractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileContentCount {
    public static void main(String[] args) {
        int wordCount=0;
        int lineCount=0;
        int charCount=0;

        BufferedReader bufferedReader=null;
        try {
            bufferedReader=new BufferedReader(new FileReader("D:\\Vishal\\Selenium\\Java Practice\\JavaInterviewQuestions\\demo.txt"));
            String currline=bufferedReader.readLine();
            while(currline != null){
                lineCount++;
              String[] words=  currline.split(" ");
              wordCount=wordCount+words.length;
              for(String w:words){
                  charCount=charCount+w.length();
              }
              currline=bufferedReader.readLine();
            }
            System.out.println("w count: "+ wordCount);
            System.out.println("l count: "+ lineCount);
            System.out.println("c count: "+ charCount);
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
    }
}
