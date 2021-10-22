package holidayLightsPortal;

import java.util.Scanner;

public class
Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        while (true) {
            int length = menu.displayMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your Option: ");
            String input = scanner.nextLine();
            if(( input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") ) ||
                    (length>4 && (input.equals("5") || input.equals("6")))){
                 Boolean flag = Menu.orderSelection(input);
                if (flag) {
                    break;
                }
            }else{
                System.out.print("Incorrect option selected. Enter your Option from Below \n ");
            }
        }
    }

}
