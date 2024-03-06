package naveenpractice;

public class HackerRankXA {
    public static void main(String[] args) {
        String s="Write codex for a great time";
        System.out.println(LongestEvenLengthWord(s));
    }
    public static String LongestEvenLengthWord(String s){
        String noSuccess="00";
        if(s.length()==0||s.equals(""))
            return noSuccess;
        int max=0;
        int count=0;
        int lastIndex=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(count%2==0){
                    if(count>max){
                        max=count;
                        lastIndex=i;
                    }
                    count=0;

                }else{
                    count=0;
                }

            }else{
                count++;
            }
        }
        if(max==0)
            return count%2==0?s.substring(s.length()-count,count):noSuccess;

        return s.substring(lastIndex-max,lastIndex);

    }
}
