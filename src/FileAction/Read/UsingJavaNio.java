/*
 * Copyright (c) Vishal
 */

package FileAction.Read;


import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class UsingJavaNio {
    public static void main(String[] args) {
        String path="C:\\Users\\Vchopra\\OneDrive - APEX Analytix, LLC\\SA Maual\\sample.txt";
        try {

           List<String> li= Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
           Iterator<String> i=li.iterator();
           while (i.hasNext()){
               System.out.println(i.next());
           }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
