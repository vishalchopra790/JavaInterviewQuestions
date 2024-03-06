package naveenpractice;

public class StringToNumber {

    public static int stringToNumber(String s){
        int zeroASCII=(int)'0';
        int num=0;
        for(int i=0;i<s.length();i++){
            num=num*10+((int)s.charAt(i)-zeroASCII);
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(stringToNumber("123")+10);
    }
}
