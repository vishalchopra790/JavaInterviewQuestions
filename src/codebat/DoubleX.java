package codebat;

public class DoubleX {
    public static void main(String[] args) {
       // System.out.println(doubleX("axxaxxa"));
       // System.out.println(stringSplosion("code"));

       // System.out.println(stringX("xxaaaafffffx"));
        //System.out.println(has271(new int[]{ 2, 7, 1}));
        System.out.println(last2("hixxhi"));
    }

    static boolean doubleX(String str) {
  /*int i=str.indexOf("x");
  if(i==-1)
    return false;

  if(i+1>=str.length())
    return false;

  return str.substring(i+1,i+2).equals("x");*/
        int i = str.indexOf("x");
        if (i == -1)
            return false;
        String x = str.substring(i);
        return x.startsWith("xx");

    }

    public static String stringSplosion(String str) {
        String result="";
        for(int i=0;i<str.length();i++){
            result=result+str.substring(0,i+1);
        }
        return result;
    }

    public static String stringX(String str) {
        String result="";
        for(int i=0;i<str.length();i++){
            if(!(i>0 && i<str.length()-1 &&str.substring(i,i+1).equals("x")))
                result=result+str.substring(i,i+1);
        }
        return result;
    }
    public String stringYak(String str) {
        String result="";
        if(str.contains("yak")){
            result=str.replace("yak","");
            return result;
        }

        return str;
    }

    /**
     * Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
     *
     *
     * has271([1, 2, 7, 1]) → true
     * has271([1, 2, 8, 1]) → false
     * has271([2, 7, 1]) → true
     * @param nums
     * @return
     */
    public static boolean has271(int[] nums) {
        for(int i=0;i<nums.length-2;i++){
            int val=nums[i];
            if(nums[i+1]==(val+5) && Math.abs(nums[i+2]-(val-1)) <=2){
                return true;
            }
        }
        return false;
    }


    /**
     * Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
     *
     *
     * last2("hixxhi") → 1
     * last2("xaxxaxaxx") → 1
     * last2("axxxaaxx") → 2
     * @author Vishal Singh
     * @param str
     * @return
     */
    public static  int last2(String str) {
        if(str.length()<2)
            return 0;

        String end=str.substring(str.length()-2);
        int count=0;

        for(int i=0;i<str.length()-2;i++){
            String sub=str.substring(i,i+2);
            if(sub.equals(end)){
                count++;
            }
        }
        return count;
    }


}
