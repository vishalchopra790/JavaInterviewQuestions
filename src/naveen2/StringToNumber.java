package naveen2;

public class StringToNumber {
    public static int stringtoNumber(String s){

     if(s.length()==1){
         return (int)s.charAt(0)-48;
     }

     int num=0;
     int zeroAsc=   (int)'0';
     int len=s.length();
     for(int i=0;i<len;i++){
         num =num*10 + ((int)s.charAt(i)-zeroAsc);
     }
     return num;
    }

    public static void main(String[] args) {
        System.out.println(stringtoNumber("")+78);
    }
}
