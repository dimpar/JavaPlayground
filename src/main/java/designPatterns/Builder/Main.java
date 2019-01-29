package designPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.Builder(112233445, "Joe Doe").atRate(1.5).build();
    }
}
