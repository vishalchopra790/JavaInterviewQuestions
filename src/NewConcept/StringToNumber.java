package NewConcept;

public class StringToNumber {

    static int stringNumber(String str) {
        if (str.length() == 1)
            return (int) str.charAt(0) - 48;
        int num = 0;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            num = num * 10 + ((int) str.charAt(i) - 48);
        }

        return num;
    }

    static int convertToNumber(String str) {
        if (str.length() == 1)
            return (int) str.charAt(0) - 48;

        char ch[]=str.toCharArray();
        int sum=0;
        int zeroASsc=(int)'0';
        for(int i=0;i<ch.length;i++) {
            int asc=(int)ch[i];
            sum=sum*10+(asc-zeroASsc);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(stringNumber("1") + 20);
        System.out.println(convertToNumber("4586") + 20);
    }
}
