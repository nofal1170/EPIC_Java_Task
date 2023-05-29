package assignment5;

import java.util.LinkedList;

public class Application {

    public static boolean isValid (String data) {
        LinkedList<Character> isBalanced = new LinkedList<>();

        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);

            if (ch == '(') {
                isBalanced.push(ch);
            } else if (ch == ')') {
                if (isBalanced.isEmpty()) {
                    return false;  // Unbalanced parentheses
                }
                isBalanced.poll();
            }
        }

        return isBalanced.isEmpty();
    }

    public static void main(String[] args) {
        String data1 = "((()))";
        String data2 = "(((((((";
        System.out.println("isBalanced(data1) = " + isValid(data1));
        System.out.println("isBalanced(data2) = " + isValid(data2));

    }
}



