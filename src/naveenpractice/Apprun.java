package naveenpractice;

import java.io.IOException;

public class Apprun {
    public static void main(String[] args) throws IOException, InterruptedException {
      Runtime run=  Runtime.getRuntime();
      Process pr=run.exec("notepad.exe");
      Thread.sleep(4000);
      pr.destroy();

    }
}
