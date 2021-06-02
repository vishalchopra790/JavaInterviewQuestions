package FileAction;

import java.io.File;
import java.util.Arrays;


public class ListFilesPrint {
    public static void main(String[] args) {
printListOfFiles("C:\\Users\\Vchopra\\OneDrive - APEX Analytix, LLC\\SA Maual");
    }

    public static void printListOfFiles(String path){
        File file=new File(path);
        File[] down =file.listFiles();
        assert down != null;
        Arrays.sort(down);

        for(File e:down){
            if(e.isFile())
                System.out.println("File: "+e.getName() +" "+e.getAbsolutePath());
            if(e.isDirectory())
                System.out.println("Directory: "+e.getName() +" "+e.getUsableSpace());
        }
    }
}
