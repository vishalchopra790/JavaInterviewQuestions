package hackerrank;

public class LongWord_EXA {
    public static String LongestEvenLengthWord(String input) {
        String noSuccess = "00";

        if (input.equals("") || input.length() == 0) {
            return noSuccess;
        }

        int count = 0, max = 0, lastIndex = 0;
        for (int i = 0; i < input.length(); i++) {
            //System.out.print(input.charAt(i) );
            if (input.charAt(i) == ' ') {
                if (count % 2 == 0) {
                    if (count > max) {
                        max = count;
                        lastIndex = i;
                    }

                    count = 0;
                } else {
                    count = 0;
                }
            } else {
                count++;
            }
        }

        if (max == 0) {
            return count % 2 == 0 ? input.substring(input.length() - count, count) : noSuccess;
        }

        return input.substring(lastIndex - max, lastIndex);
    }

    public static void main(String[] args) {
        String s="Write code for a simple great";
        System.out.println(LongestEvenLengthWord(s));
    }
}
