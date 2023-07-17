package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVerification {

    public static void main(String[] args){

        String s = "name@gmAIl.com";

        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);

        if(m.matches()){
            System.out.println("email is Valid");
        }
        else{
            System.out.println("Invalid Email");
        }

    }
}
