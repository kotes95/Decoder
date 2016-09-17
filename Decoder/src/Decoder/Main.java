package Decoder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        Decoder decoder = new Decoder();
        String mode;

        System.out.println("ENTER INITIALIZATION MODE:");
        System.out.println("1: FULL STRING");
        System.out.println("2: STRAIGHT KEY");

        mode = user_input.next();
        user_input.nextLine(); // skip to a new line

        if (mode.equals("1")){
            // full string mode
            System.out.println("Please enter in a morse input: ");
            decoder.setInput(user_input.nextLine());

            System.out.print("Your string translation is: " + decoder.decode());
        } else if (mode.equals("2")){
            // straight key mode
        } else {
            System.out.print("INVALID KEYPRESS, PLEASE RUN AGAIN");
        }



    }
}
