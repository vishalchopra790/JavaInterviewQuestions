package naveen2;

import static com.sun.deploy.uitoolkit.impl.awt.AWTClientPrintHelper.print;

public class PrintHelloWorld {
    public static boolean print(){
        System.out.println("hello");
        return true;
    }
    static boolean p=print();
    public static void main(String[] args) {

    }
}
