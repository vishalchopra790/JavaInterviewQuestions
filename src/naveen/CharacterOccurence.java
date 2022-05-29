package naveen;

public class CharacterOccurence {
    public static void main(String[] args) {
        String s="I love india";
        ///getCharOccurence(s,'o');
        streamCgar(s,"i");
        streamCgarSimple(s,'i');

    }

    public static void streamCgar(String s,String c){
        long count=s.chars().mapToObj(e->String.valueOf((char)e)).filter(e->e.equals(c)).count();
        System.out.println(count);
    }

    public static void streamCgarSimple(String s,char c){
        long count=s.chars().filter(e->(char)e==c).count();
        System.out.println(count);
    }
    public static void getCharOccurence(String s,char c){
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch== c){
                count++;
            }
        }
        System.out.println(count);
    }
}
