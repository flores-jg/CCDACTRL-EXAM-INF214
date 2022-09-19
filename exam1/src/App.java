
import java.util.Stack;

import javax.print.event.PrintEvent;

import java.io.LineNumberInputStream;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        // ARRAYS (50 points)
        System.out.println("======================================================");
        // 1. Create an array of characters of your SURNAME.
        String sSurname = "FLORES";
        char[] surname = sSurname.toCharArray();
        // 2. Display each character of your SURNAME on each line.
        System.out.println(surname);
        // 3. Display the first character of your SURNAME.
        System.out.println(surname[0]);
        // 4. Display the last character of your SURNAME.
        System.out.println(surname[surname.length - 1]);
        // 5. Display the character of your SURNAME in reverse order.
        int i = surname.length - 1;
        while (i >= 0) {
            System.out.print(surname[i]);
            i--;
        }
        System.out.println("");



        // LINKED LIST (25 points)
        System.out.println("======================================================");
        // 1. Create a Linked list of the last six numbers of your STUDENT NUMBER.
        LinkedList<String> studNumber = new LinkedList<>();
        studNumber.add("1");
        studNumber.add("0");
        studNumber.add("1");
        studNumber.add("2");
        studNumber.add("4");
        studNumber.add("6");

        // 2. Add an asterisk (*) to the head/front of the Linked list.
        studNumber.set(0, "*" + studNumber.getFirst());
        // 3. Add an asterisk (*) to the tail/end of the Linked list.
        studNumber.set(studNumber.size() - 1, studNumber.getLast() + "*");
        // 4. Display the Linked list.
        System.out.println(studNumber);

        // 5. Display the last character of the Linked list.
        System.out.println(studNumber.getLast());
        // 6. Replace the last character of the Linked list with the exclamation symbol
        // (!).
        studNumber.set(studNumber.size() - 1, "!");
        // 7. Remove the first character of the Linked list.
        studNumber.removeFirst();
        // 8. Display the LinkedList.
        System.out.println(studNumber);




        // STACK (25 points)
        System.out.println("======================================================");
        // 1. Create a Stack of characters of your SURNAME.
        Stack<String> surnameStack =  new Stack<>();
        surnameStack.push("F");
        surnameStack.push("L");
        surnameStack.push("O");
        surnameStack.push("R");
        surnameStack.push("E");
        surnameStack.push("S");
        // 2. Print the Stack.
        System.out.println(surnameStack);
        // 3. Add a "INF214" to the stack.
        surnameStack.push("INF214");
        // 4. Print the Stack.
        System.out.println(surnameStack);
        // 5. Remove "INF214".
        surnameStack.pop();
        // 6. Add "CCDATRCL-INF214".
        surnameStack.push("CCDACTRL-INF214");
        // 7. Print the Stack.
        System.out.println(surnameStack);
    } 
}