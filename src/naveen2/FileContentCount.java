package naveen2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileContentCount {
    static  String path="D:\\Vishal\\Selenium\\Java Practice\\JavaInterviewQuestions\\demo.txt";
    public static void main(String[] args) throws IOException {
        int charCount=0;
        int lineCount=0;
        int wordCount=0;
        BufferedReader reader=null;
        try {


            reader=new BufferedReader(new FileReader(path));
            String currline=reader.readLine();
            while (currline != null){
                lineCount++;
               String[] wordArray= currline.split(" ");
               wordCount=wordCount+wordArray.length;
               for(String word:wordArray)
                   charCount=charCount+word.length();

                currline=reader.readLine();
            }
            System.out.println("Line Count: "+lineCount);
            System.out.println("Char Count: "+charCount);
            System.out.println("Word Count: "+wordCount);

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            reader.close();
        }
    }
}
