package strings;

public class Strings {

    public static void main(String[] args){

        changeCharacter();

        removeSpace();

        reverseString();

        largestSubString();

    }

    public static void changeCharacter(){

        StringBuilder s = new StringBuilder("ProminentPixel");
        s.setCharAt(5, 'z');
        System.out.println(s);

        StringBuffer sb = new StringBuffer("ProminentPixel");
        sb.setCharAt(5,'x');
        System.out.println(sb);

    }

    public static void removeSpace(){

        StringBuilder s = new StringBuilder("Java is a popular programming language.");
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 32){
                s.deleteCharAt(i);
            }
        }
        System.out.println(s);

        StringBuffer sb = new StringBuffer("Java is a popular programming language.");
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch == 32){
                sb.deleteCharAt(i);
            }
        }
        System.out.println(sb);
    }


    public static void reverseString(){

        String s = "Prominent Pixel";
        String rev = "";

        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);
    }


    public static void largestSubString(){

        String s = "catcowcat";
        String sub = "cat";

        int start = 0;
        int end = s.length()-1;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(sub.charAt(0) == ch){
                boolean match = true;
                for(int j=0;j<sub.length();j++){
                    if(s.charAt(i+j) != sub.charAt(j)){
                        match = false;
                    }
                }
                if(match = true){
                    start = i;
                    break;
                }
            }

        }

        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(sub.charAt(sub.length()-1) == ch){
                boolean match = true;
                int k = 0;
                for(int j=sub.length()-1;j>=0;j--){
                    if(s.charAt(i-j) != sub.charAt(k)){
                        match = false;
                    }
                    k++;
                }
                if(match = true){
                    end = i;
                    break;
                }
            }
        }

        int length = end - start + 1;
        for(int i=start;i<=end;i++){
            System.out.print(s.charAt(i));
        }
        System.out.println(" length : " + length);
    }
}
