public class ATM {
    public ATM(){
        System.out.println("Enter your pin: ");
    }

    public void menu(){
        System.out.println("\n1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Balance Inquiry");
        System.out.println("4. Exit");
    }

    public void withdrawMenu() {System.out.println("Enter an amount to withdraw: ");}
    public void depositMenu() {System.out.println("Enter an amount to deposit: ");}
    public void balanceMenu(double balance) {System.out.printf("Balance: $%.2f ", balance);}
    public void invalidMessageMenu() {System.out.println("Invalid option. Try again. ");}
    public void exitMenu() {System.out.println("See you again soon. ");}


}
