package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String[] args){


        String s1 = "abcdefg";
        String s2 = "abcde";
        String s3 = "abc";

        Pattern p = Pattern.compile("[a-z]{7}");
        Matcher m = p.matcher(s1);
        boolean b1 = m.matches();

        p = Pattern.compile("[a-z]{5}");
        m = p.matcher(s2);
        boolean b2 = m.matches();

        p = Pattern.compile("[a-z]{3}");
        m = p.matcher(s3);
        boolean b3 = m.matches();

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

    }
}
