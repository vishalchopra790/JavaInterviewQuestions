/*
 * Copyright (c) Vishal
 */

package FileAction.Read;

import java.awt.*;
import java.io.File;

public class OpenFileUsingDekstop {
    public static void main(String[] args) {
        String path="C:\\Users\\Vchopra\\OneDrive - APEX Analytix, LLC\\SA Maual\\sample.txt";

        try {
            File file =new File(path);
            if(!Desktop.isDesktopSupported()){
                System.out.println("Deskstop is not supported");
                return;
            }
            Desktop desktop=Desktop.getDesktop();
            if(file.exists()){
                desktop.open(file);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
