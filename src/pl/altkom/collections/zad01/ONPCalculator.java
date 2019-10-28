package pl.altkom.collections.zad01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ONPCalculator {

    /**
     * Uzupełnij ciało poniższej funkcji, tak aby obliczało właściwą wartość wyrażenia ONP
     * Algorytm do obliczania tego wyrażenia można znaleźć pod adresem:
     * https://pl.wikipedia.org/wiki/Odwrotna_notacja_polska
     * W zadaniu chodzi o praktyczne użycie struktury danych stosu.
     */
    private static boolean isInteger(String s){
        try{
            Integer i = Integer.parseInt(s);
        } catch (NumberFormatException | NullPointerException e){
            return false;
        }
        return true;
    }

    private static int ONPValue(List<String> onp) {
        Stack <Integer> stackONP = new Stack<Integer>();
        List<String> operatory = Arrays.asList("-","+","*","/","^");
        for(String object : onp){
            if(isInteger(object)) {
                stackONP.push(Integer.parseInt(object));
            }else if(operatory.contains(object)){
                Integer b = stackONP.pop();
                Integer a = stackONP.pop();
                if (object == "-"){
                    stackONP.push(a-b);
                }
                if (object == "+"){
                    stackONP.push(a+b);
                }
                if (object == "*"){
                    stackONP.push(a*b);
                }
                if (object == "/"){
                    stackONP.push(a/b);
                }
                if (object == "^"){
                    stackONP.push(a^b);
                }
            }
        }
        return stackONP.peek();
    }

    public static void main(String[] args) {
        List<String> onp = Arrays.asList("12", "2", "3", "4", "*", "10", "5", "/", "+", "*", "+");
        System.out.println(ONPValue(onp));
    }
}
