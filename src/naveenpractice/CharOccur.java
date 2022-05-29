package naveenpractice;

public class CharOccur {
    public static void main(String[] args) {
        String s="I love india";
        System.out.println(charCheck(s,'i'));
      streamCheck(s,"i");
    }
    public static int charCheck(String s,char c){
        int count=0;
       for(char c1: s.toCharArray()){

           if(c1==c)
               count++;
       }
       return count;
    }
    public static void streamCheck(String s,String c){
        long c1=s.chars().mapToObj(e->String.valueOf((char)e)).filter(e->e.equals(c)).count();
        System.out.println(c1);
    }
}
