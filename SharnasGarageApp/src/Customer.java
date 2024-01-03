import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Customer
    {
//assigned variables for cust. details to be input
        String CustFirstName;
        String CustLastName;
        String CustEmail;
        String CustPhone;

        public void setCustFirstName(String firstName) {
            this.CustFirstName = firstName;
        }
    
        public String getCustFirstName() {
            return this.CustFirstName;
        }

// Customer inputs their data
        public void CustInput()
        {
            Scanner scanner = new Scanner(System.in);

            Customer newCust = new Customer();

            System.out.println("Please Enter your details.");
            System.out.println("First Name: ");
            this.CustFirstName = scanner.next();
            System.out.println("Last Name: ");
            newCust.CustLastName = scanner.next();
            System.out.println("Email: ");
            newCust.CustEmail = scanner.next();
            System.out.println("Phone Number: ");
            newCust.CustPhone = scanner.next();
            scanner.close();

// Data is recorded to text file

            try
            {
                FileWriter custWriter = new FileWriter("Customer Data.txt", true);
                BufferedWriter myWriter = new BufferedWriter(custWriter);
                myWriter.write(newCust.CustFirstName + ", " + newCust.CustLastName + ", " +  newCust.CustEmail + ", " + newCust.CustPhone + "\n");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            }
                catch (IOException e)
            {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

    }

