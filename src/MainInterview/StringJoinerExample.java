package MainInterview;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(",", "(", ")");
        joiner.add("Tom")
                .add("Jerry");

        System.out.println(joiner.toString());
    }
}
