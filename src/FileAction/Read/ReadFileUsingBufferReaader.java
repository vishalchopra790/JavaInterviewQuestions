/*
 * Copyright (c) Vishal
 */

package FileAction.Read;

import java.io.*;

public class ReadFileUsingBufferReaader {
    public static void main(String[] args) {
        String path="C:\\Users\\Vchopra\\OneDrive - APEX Analytix, LLC\\SA Maual\\sample.txt";
        BufferedReader bufferedReader=null;
        try {
            File file=new File(path);
            bufferedReader=new BufferedReader(new FileReader(file));
            System.out.println("content is:");
            int c =0;
            while((c=bufferedReader.read())!=-1){
                System.out.print((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
