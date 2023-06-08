package array;

import java.util.function.Function;

public class reverseString {

    public static String reverseString(String str){

        if(! (str instanceof String) && str.equals(null)){
            return "not a String";
        }

        char[] strA = str.toCharArray();
        StringBuilder sb = new StringBuilder("");
        for(int i = strA.length-1;i>=0;i--){
            sb.append(strA[i]);
        }

        return sb.toString();


    }

    //Built in method
    public static String reverseStringUsingBuiltInMethod(String str){
        if(! (str instanceof String) && str.equals(null)){
            return "not a String";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    //java8 way
    public static String reverseStringUsingJava8(String str){
        Function<String, String > stringFunction = s -> new StringBuilder(str).reverse().toString();
        String apply = stringFunction.apply(str);
        return apply;
    }

    public static void main(String[] args) {

        String str = "My Name Is Kunal";
        String reveresedStr;
        //reveresedStr = reverseString(str);

        //System.out.println(reveresedStr);
      //  reveresedStr = reverseStringUsingBuiltInMethod(str);

        //System.out.println(reveresedStr);

        reveresedStr = reverseStringUsingJava8(str);
        System.out.println(reveresedStr);

    }

}
