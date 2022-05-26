package NewConcept;

public class Anagram {


    static boolean ana(String s1, String s2) {
        String s3 = s1.replaceAll("\\s", "").toLowerCase();
        String s4 = s2.replaceAll("\\s", "").toLowerCase();

        boolean flag = true;
        if (s3.length() == 1 && s4.length() == 1) {
            if(s3.equals(s4)){
                return true;
            }else{
                return false;
            }
        }
        if (s3.length() != s4.length())
            return false;
        else {
            char[] c1 = s3.toCharArray();
            StringBuilder sb = new StringBuilder(s4);
            for (char c : c1) {
                int index = sb.indexOf("" + c);
                if (index != -1)
                    sb.deleteCharAt(index);
                else {
                    flag = false;
                    break;
                }
            }
        }


        return flag;
    }

    public static void main(String[] args) {
        System.out.println(ana("act","cat"));
        System.out.println(ana("T","t  "));
        System.out.println(ana("Ta","t"));
    }

}