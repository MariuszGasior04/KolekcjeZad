package pl.altkom.collections.zadStack;
import java.util.*;

class zadStac{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        Stack<String> word = new Stack<String>();

        while (sc.hasNext()) {
            String input=sc.next();
            word.push(input);
        }

    }
}
