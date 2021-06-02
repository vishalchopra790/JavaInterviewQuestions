/*
 * Copyright (c) Vishal
 */

package FileAction.Read;

import java.io.File;
import java.util.Scanner;

public class ReadFileUsingScanner {
    public static void main(String[] args) {
        String path="C:\\Users\\Vchopra\\OneDrive - APEX Analytix, LLC\\SA Maual\\sample.txt";
        Scanner s=null;
        try {
            File src=new File(path);
             s=new Scanner(src);
             while (s.hasNextLine()){
                 System.out.println(s.nextLine());
             }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            s.close();
        }
    }
}
