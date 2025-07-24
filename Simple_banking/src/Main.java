import java.util.Scanner;

public class Main {
        static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Java Banking Program

        //Declare Variable
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning){
            //Display Menu
            System.out.println("******************");
            System.out.println("Banking Program...");
            System.out.println("******************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("******************");

            //Get and Process User Choice
            System.out.print("Please select your choice (1-4): ");
            choice = scanner.nextInt();


            switch (choice){
                case 1 ->
                    Show_Balance(balance);
                case 2 ->
                    balance += Deposit();
                case 3 ->
                    balance -= Withdraw(balance);
                case 4 ->
                    isRunning = false;
                default ->
                    System.out.println("Invalid Choice :(");

            }
        //Exit Message
            System.out.println("\nThank you for using our service.\n");
        }
    }
        //Show Balance()
    static void Show_Balance(double balance) {
        System.out.println("-------------------");
        System.out.printf ("₹%.2f\n",balance);
        System.out.println("-------------------\n");

    }

        //Deposit()
    static double Deposit(){
        double amount;
        System.out.print("Enter the amount: ");
        amount = scanner.nextDouble();

        if (amount < 1){
            System.out.println("The amount must be more or equal to 1");
            return 0;
        }
        else {
            return amount;
        }

    }

        //Withdraw()
    static double Withdraw(double balance) {

        double amount;
        System.out.print("Enter amount to be Withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance !!!");
            return 0;
        } else if (amount < 1) {
            System.out.println("Amount is less than 1 !!!");
            return 0;
        } else {
            System.out.println("Amount has been withdrawn");
            return amount;
        }
    }
}
