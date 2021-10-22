package holidayLightsPortal;

import java.util.Scanner;

public class
Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        while (true) {
            menu.displayMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your Option: ");
            String input = scanner.nextLine();
            Boolean flag = menu.orderSelection(input);
            if(flag) {
                break;
            }

        }
    }

}
