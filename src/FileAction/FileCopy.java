package FileAction;

import java.io.*;

public class FileCopy {

    public static void main(String[] args) throws IOException {
        copy("C:\\Users\\Vchopra\\Downloads\\Best_Team_Award.pdf", "C:\\Users\\Vchopra\\OneDrive - APEX Analytix, LLC\\Pictures\\best.pdf");
    }

    public static void copy(String path1, String path2) throws IOException {
        File file = new File(path1);
        File opFile = new File(path2);

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(opFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            assert fileInputStream != null;
            System.out.println(fileInputStream.available());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int i = 0;
        while ((i = fileInputStream.read()) != -1) {
            fileOutputStream.write(i);
        }

        if(fileInputStream!=null)
            fileInputStream.close();
        else if(fileOutputStream!=null)
            fileOutputStream.close();
    }
}
