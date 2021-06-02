/*
 * Copyright (c) Vishal
 */

package FileAction.Read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileInputStream {
    public static void main(String[] args) {
        String path="C:\\Users\\Vchopra\\OneDrive - APEX Analytix, LLC\\SA Maual\\sample.txt";
        FileInputStream fi=null;
        try {
            File file=new File(path);
            fi=new FileInputStream(file);
            System.out.println("file content is:");
            int c=0;
            while ((c=fi.read())!=-1){
                System.out.print((char)c);
            }
        }catch (Exception e){
e.printStackTrace();
        }finally {
            try {
                fi.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
