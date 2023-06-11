package services;

import java.util.Scanner;

public class StopOrCont {
    private Scanner scanner = new Scanner(System.in);

    public String continueUse () {
        System.out.print("\nПродолжить? (y/n)\n");
        while (true) {
            String answer = scanner.nextLine().trim().toLowerCase();
            if (answer.equals("y")){
                return "cont";
            } else if (answer.equals("n")){
                return "end";
            }
            System.out.println("Type y/n\n>");
        }
    }

}
