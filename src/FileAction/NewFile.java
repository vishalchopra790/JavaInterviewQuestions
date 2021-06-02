package FileAction;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class NewFile {
    public static void main(String[] args) throws IOException {
        //createNewFileWithFile("C:\\Users\\Vchopra\\OneDrive - APEX Analytix, LLC\\SA Maual\\sample.pdf");
        //fileOutputStream();
        JavaNio("C:\\\\Users\\\\Vchopra\\\\OneDrive - APEX Analytix, LLC\\\\SA Maual\\\\javanio.txt");
    }
    public static void createNewFileWithFile(String path){
        File file=new File(path);

        try {
            boolean flag=file.createNewFile();
            if(flag)
                System.out.println("file created");
            else
                System.out.println("file already exists");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void fileOutputStream() throws IOException {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the file name with path:");
        String filename=s.nextLine();

        System.out.println("Enter the content:");
        String  content=s.nextLine();
        byte[] b =content.getBytes(StandardCharsets.UTF_8);
        FileOutputStream fileOutputStream =new FileOutputStream(filename);

        try {

            fileOutputStream.write(b);

        } catch (Exception e) {
            System.out.println("got some exception");
            e.printStackTrace();
        }finally {
            fileOutputStream.close();
            System.out.println("file created and add data");
        }

    }

    // Java nio Package

    public static void JavaNio(String path){
        Path pathLocation=Paths.get(path);
        try {
           Path pathLocal= Files.createFile(pathLocation);
            System.out.println("File created at: "+pathLocal);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
