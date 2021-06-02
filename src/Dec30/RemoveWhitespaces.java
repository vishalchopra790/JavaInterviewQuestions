package Dec30;

public class RemoveWhitespaces {

    public static void main(String[] args) {

        String s = "Jai         Guru         JI";
        s.trim();
        String s2 = s.replaceAll("\\s", "");
        System.out.println(s2);
        System.out.println(s.lastIndexOf("G"));

        char[] c = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < c.length; i++) {
            if ((c[i] != ' ') && (c[i] != '\t')) {
                sb.append(c[i]);
            }
        }
        System.out.println(sb);
    }
}
