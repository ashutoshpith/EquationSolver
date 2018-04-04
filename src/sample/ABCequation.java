package sample;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

public class ABCequation {

    private Pattern p = Pattern.compile("[0-9]+x [\\+\\-] [0-9] = [0-9]+");

    ABCequation() {
    }

    public boolean matchform(String input){
        return input.matches(String.valueOf(p));
    }

    String solve(String input){
        String [] tokken =input.split(" ");
        String op=tokken[1];

        int a=Integer.parseInt(tokken[0].substring(0,tokken[0].length()-1));
        int b=Integer.parseInt(tokken[2]);
        int c=Integer.parseInt(tokken[4]);

        if (op.equals("-"))
            b =-b;
        int result=c-b;
        String output=result+"/"+a;
        if (result % a==0)
            output=String.valueOf(result/a);
return output;

    }
}
