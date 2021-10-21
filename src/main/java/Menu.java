

import java.util.List;
import java.util.Scanner;

public class Menu {
    String[] arr = new String[]{"ShortRound", "Globe", "Tube", "Cone", "Place your Order", "Edit Cart"};

    public void displayMenu() {
        System.out.println("Choose Light Shape ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ") " + arr[i]);
        }
    }

    List<lightslist> list;
    Scanner s1 = new Scanner(System.in);
    Cart cart = new Cart();
    SummaryIterator si = new SummaryIterator();
    public Boolean orderSelection(String inp) {
        if (Integer.parseInt(inp) < 5)
            System.out.println("Choose Light Model ");
        switch (inp) {
            case "1": {
                ShortRound shortRound = new ShortRound();
                list = shortRound.shortroundlist;
                int count = 1;
                for (lightslist item : list) {
                    System.out.println(count + ") " + item.lightType());
                    count++;
                }
                int option;
                System.out.print("Enter your Option: ");
                option = s1.nextInt();

                while (option < 1 || option > list.size()) {
                    System.out.print("Incorrect option - Enter your Option: ");
                    option = s1.nextInt();
                }

                System.out.print("Enter Quantity: ");
                int quantity = s1.nextInt();
                if (quantity <= 0) {
                    quantity = 1;
                }
                cart.addItem(list.get(option - 1).lightType(),
                        list.get(option - 1).lightPrice(),
                        quantity);
                System.out.println("Item Added to Cart");
                System.out.println("-----------------------------" + "\n");
                return false;
            }
            case "2": {
                Globe globe = new Globe();
                list = globe.globelist;
                int count = 1;
                for (lightslist item : list) {
                    System.out.println(count + ") " + item.lightType());
                    count++;
                }
                System.out.print("Enter your Option: ");
                int option;
                option = s1.nextInt();

                while (option < 1 || option > list.size()) {
                    System.out.print("Incorrect option - Enter your Option: ");
                    option = s1.nextInt();
                }
                System.out.print("Enter Quantity: ");
                int quantity = s1.nextInt();
                if (quantity <= 0) {
                    quantity = 1;
                }
                cart.addItem(list.get(option - 1).lightType(), list.get(option - 1).lightPrice(), quantity);
                System.out.println("Item Added to Cart");
                System.out.println("-----------------------------" + "\n");
                return false;
            }
            case "3": {
                Tube tube = new Tube();
                list = tube.tubelist;
                int count = 1;
                for (lightslist item : list) {
                    System.out.println(count + ") " + item.lightType());
                    count++;
                }
                System.out.print("Enter your Option:");
                int option;
                option = s1.nextInt();

                while (option < 1 || option > list.size()) {
                    System.out.print("Incorrect option - Enter your Option: ");
                    option = s1.nextInt();
                }
                System.out.print("Enter Quantity: ");
                int quantity = s1.nextInt();
                if (quantity <= 0) {
                    quantity = 1;
                }
                cart.addItem(list.get(option - 1).lightType(), list.get(option - 1).lightPrice(), quantity);
                System.out.println("Item Added to Cart");
                System.out.println("-----------------------------" + "\n");
                return false;
            }
            case "4": {
                Cone cone = new Cone();
                list = cone.conelist;
                int count = 1;
                for (lightslist item : list) {
                    System.out.println(count + ") " + item.lightType());
                    count++;
                }
                System.out.print("Enter your Option: ");
                int option; //defaults to 0
                option = s1.nextInt();

                while (option < 1 || option > list.size()) {
                    System.out.print("Incorrect option - Enter your Option: ");
                    option = s1.nextInt();
                }
                System.out.print("Enter Quantity: ");
                int quantity = s1.nextInt();
                if (quantity <= 0) {
                    quantity = 1;
                }
                cart.addItem(list.get(option - 1).lightType(), list.get(option - 1).lightPrice(), quantity);
                System.out.println("Item Added to Cart");
                System.out.println("-----------------------------" + "\n");
                return false;
            }
            case "5":
                System.out.println("\n\n" + "Order Placed!!!");
                System.out.println("-----------------------------" + "\n" + "Order Summary" + "\n" + "-----------------------------");
                si.orderSummary(cart);
                System.out.println("-----------------------------" + "\n");
                return true;
            case "6":
                cart.editOrder(cart);
                System.out.println("-----------------------------" + "\n");
                return false;
            default:
                System.out.println("Wrong option");
                System.out.println("-----------------------------" + "\n");
                return false;
        }
    }

}