import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.CustInput();
// In this method I have created an arraylist for the purpose of indicating the products that are available,
// the cost of each product and whether the product is genuine or not.
        ArrayList<Parts> listOfParts = new ArrayList<>();


        Parts motor = new Parts("Motor", 3000.78, true, 1);
        Parts fanbelt = new Parts("Fan Belt", 235.80, true, 2);
        Parts radiator = new Parts("Radiator", 1206.99, false, 3);
        Parts tyre = new Parts("Tyre", 12.50, false, 4);
        Parts windscreen = new Parts("WindScreen Wiper", 15.73, true, 5);
        Parts battery = new Parts("Battery", 296.81, false, 6);
        Parts ignition = new Parts("Ignition Coil", 52.43, false, 7);
        Parts steering = new Parts("Steering Wheel", 74.72, true, 8);
        Parts breakPad = new Parts("Break Pad", 120.00, false, 9);
        Parts transmission = new Parts("Transmission", 5120.46, true, 10);

        listOfParts.add(motor);
        listOfParts.add(fanbelt);
        listOfParts.add(radiator);
        listOfParts.add(tyre);
        listOfParts.add(windscreen);
        listOfParts.add(battery);
        listOfParts.add(ignition);
        listOfParts.add(breakPad);
        listOfParts.add(steering);
        listOfParts.add(transmission);

        Parts selectedItem = new Parts();
        ArrayList<Parts> selectedItemsList = new ArrayList<>();
        Scanner scanner1 = new Scanner(System.in); 

        while (true) {
            int i = 1;
            int itemSelect = -1;
            for (Parts Parts : listOfParts) {
                System.out.println(i + ": " + Parts.getName() + " ----- $" + Parts.getPrice());
                i++;
                System.out.println("____________________________________");
            }

            System.out.println("Welcome " + customer.getCustFirstName() + ", please select from the following menu items by typing in the index number and pressing enter, '0' to finish:");
            while(scanner1.hasNextInt())

            itemSelect = scanner1.nextInt();

            if (itemSelect >= 1 && itemSelect <= listOfParts.size()) {
                selectedItem = listOfParts.get(itemSelect - 1);
                System.out.println("selected: " + selectedItem.getName() + " valued at $" + selectedItem.getPrice());

                try {
                    FileWriter custWriter = new FileWriter("Customer Data.txt", true);
                    BufferedWriter myWriter = new BufferedWriter(custWriter);
                    myWriter.write(selectedItem.getName() + ", " + selectedItem.getPrice() + "\n");
                    myWriter.close();
                    System.out.println("Successfully added to the order.");
                    selectedItemsList.add(selectedItem);

                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

                //genuine part code
            }
            if (itemSelect == 0) {
                
                break;
            } else if (itemSelect < 0 || itemSelect > 10) {
                System.out.println("Invalid selection, please try again");
            } 
        }

        scanner1.close();
        System.out.println("Thankyou " + customer.getCustFirstName() + " please wait while we generate your Service I.D. number and remember it for when it is called out");

        boolean hasGenuineParts = false;
         Order.randNumGen(hasGenuineParts);

        //hasGenuineParts = false;
//        for (Parts part : selectedItemsList) {
//            if (part.getIsGenuine()) {
//                hasGenuineParts = true;
//                System.out.println(" There are 1 or more items in your order that are genuine");
//
//
//        } else {
//                System.out.println("the Item(s) you have ordered are third-party");
//            }
//
//        }

//        if (hasGenuineParts) {
//            System.out.println(" There are 1 or more items in your order that are genuine");
//        } else {
//            System.out.println("the Item(s) you have ordered are third-party");
//
//        }

    }
}
