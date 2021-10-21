

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
    public Boolean orderSelection(String inp) {
        if (Integer.valueOf(inp) < 5)
            System.out.println("Choose Light Model ");
        if (inp.equals("1")) {
            ShortRound shortRound = new ShortRound();
            list = shortRound.shortroundlist;
            int count = 1;
            for (lightslist item : list) {
                System.out.println(count + ") " + item.lightType());
                count++;
            }
            int option = 0;
            System.out.print("Enter your Option: ");
            option = s1.nextInt();

            while (option < 1 || option > list.size())
            {
                System.out.print("Incorrect option - Enter your Option: ") ;
                option = s1.nextInt();
            }

            System.out.print("Enter Quantity: ");
            int quantity = s1.nextInt();
            if (quantity <= 0) {
                quantity = 1;
            }
            cart.addItem(list.get(option-1).lightType(),
                    list.get(option-1).lightPrice(),
                    quantity);
            System.out.println("Item Added to Cart");
            System.out.println("-----------------------------" + "\n");
            return false;
        } else if (inp.equals("2")) {
            Globe globe = new Globe();
            list = globe.globelist;
            int count = 1;
            for (lightslist item : list) {
                System.out.println(count + ") " + item.lightType());
                count++;
            }
            System.out.print("Enter your Option: ");
            int option = 0;
            option = s1.nextInt();

            while (option < 1 || option > list.size())
            {
                System.out.print("Incorrect option - Enter your Option: ") ;
                option = s1.nextInt();
            }
            System.out.print("Enter Quantity: ");
            int quantity = s1.nextInt();
            if (quantity <= 0) {
                quantity = 1;
            }
            cart.addItem(list.get(option-1).lightType(), list.get(option-1).lightPrice(), quantity);
            System.out.println("Item Added to Cart");
            System.out.println("-----------------------------" + "\n");
            return false;
        } else if (inp.equals("3")) {
            Tube tube = new Tube();
            list = tube.tubelist;
            int count = 1;
            for (lightslist item : list) {
                System.out.println(count + ") " + item.lightType());
                count++;
            }
            System.out.print("Enter your Option:");
            int option = 0;
            option = s1.nextInt();

            while (option < 1 || option > list.size())
            {
                System.out.print("Incorrect option - Enter your Option: ") ;
                option = s1.nextInt();
            }
            System.out.print("Enter Quantity: ");
            int quantity = s1.nextInt();
            if (quantity <= 0) {
                quantity = 1;
            }
            cart.addItem(list.get(option-1).lightType(), list.get(option-1).lightPrice(), quantity);
            System.out.println("Item Added to Cart");
            System.out.println("-----------------------------" + "\n");
            return false;
        } else if (inp.equals("4")) {
            Cone cone = new Cone();
            list = cone.conelist;
            int count = 1;
            for (lightslist item : list) {
                System.out.println(count + ") " + item.lightType());
                count++;
            }
            System.out.print("Enter your Option: ");
            int option = 0;
            option = s1.nextInt();

            while (option < 1 || option > list.size())
            {
                System.out.print("Incorrect option - Enter your Option: ") ;
                option = s1.nextInt();
            }
            System.out.print("Enter Quantity: ");
            int quantity = s1.nextInt();
            if (quantity <= 0) {
                quantity = 1;
            }
            cart.addItem(list.get(option-1).lightType(), list.get(option-1).lightPrice(), quantity);
            System.out.println("Item Added to Cart");
            System.out.println("-----------------------------" + "\n");
            return false;
        }
        else if (inp.equals("5")) {
            System.out.println("\n\n"+"Order Placed!!!");
            System.out.println("-----------------------------" + "\n"+"Order Summary"+ "\n" + "-----------------------------");
            cart.getPlacedOrder();
            System.out.println("-----------------------------" + "\n");
            return true;
        } else if (inp.equals("6")) {
            cart.editOrder();
            System.out.println("-----------------------------" + "\n");
            return false;
        } else {
            System.out.println("Wrong option");
            System.out.println("-----------------------------" + "\n");
            return false;
        }
    }

}
