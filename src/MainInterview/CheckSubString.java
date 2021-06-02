/*
 * Copyright (c) Vishal
 */

package MainInterview;

public class CheckSubString {

    public static boolean isSubString(String main,String sub){
        return main.matches("(.*)"+sub+"(.*)");
    }

    public static boolean isSubStrin(String main,String sub){
        return main.contains(sub);
    }



    public static void main(String[] args) {
        System.out.println(isSubString("vishal chopra"," "));
    }
}
