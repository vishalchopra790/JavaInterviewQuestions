/*
 * Copyright (c) Vishal
 */

package FileAction.Read;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {
    public static void main(String[] args) {
        String path="C:\\Users\\Vchopra\\OneDrive - APEX Analytix, LLC\\SA Maual\\sample.txt";
        FileReader fileReader=null;
        try {
            File file=new File(path);
            fileReader=new FileReader(file);
            System.out.println("content is:");
            int c =0;
            while((c=fileReader.read())!=-1){
                System.out.print((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
