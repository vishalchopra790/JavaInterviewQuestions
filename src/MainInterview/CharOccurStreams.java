package MainInterview;

public class CharOccurStreams {
    public static void main(String[] args) {
        String s = "Testing Bytes";


        System.out.println(getCharCount(s, 'y', 's'));
    }

    public static long getCharCount(String g, char c1, char c2) {
        return g
                .chars()
                .filter(e -> (char) e == c1 || (char) e == c2)
                .count();
    }
}
