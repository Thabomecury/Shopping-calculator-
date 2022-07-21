import java.util.Scanner;

public class shoppingCalculator {
        public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);

            while(true) {

                System.out.print("Enter the name of the first item you want to buy: ");
                String item1 = scan.next();

                System.out.print("Enter the price of the first item: R");
                double item11 = scan.nextDouble();


                System.out.print("Enter the name of the second item you want to buy:");
                String item2 = scan.next();

                System.out.print("Enter the price of the second item: R");
                double item22 = scan.nextDouble();

                System.out.print("Enter the name of the third item you want to buy: ");
                String item3 = scan.next();

                System.out.print("Enter the price of the third item: R");
                double item33 = scan.nextDouble();

                System.out.print("Enter the name of the fourth item you want to buy: ");
                String item4 = scan.next();

                System.out.print("Enter the price of the fourth item: R");
                double item44 = scan.nextDouble();

                System.out.print("Enter the name of the fifth item you want to buy: ");
                String item5 = scan.next();

                System.out.print("Enter the price of the fifth item: R");
                double item55 = scan.nextDouble();

                System.out.println("==================================================");
                System.out.println("You have selected to buy the following:");
                System.out.println("-----------------------------------------------------\n");

                System.out.println("item: " + item1 + " at R" + item11);
                System.out.println("item: " + item2 + " at R" + item22);
                System.out.println("item: " + item3 + " at R" + item33);
                System.out.println("item: " + item4 + " at R" + item44);
                System.out.println("item: " + item5 + " at R" + item55);

                System.out.println("\n----------------------------------------------------------");
                double totalPrice = (item11 + item22 + item33 + item44 + item55);
                System.out.println("Total for all items: " + totalPrice);
                break;
            }

        }

    }
