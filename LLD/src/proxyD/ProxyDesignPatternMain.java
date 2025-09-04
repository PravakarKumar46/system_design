package proxyD;

public class ProxyDesignPatternMain {
    public static void main(String[] args) {
        BankAccount account = new ProxyBankAccount("User");
        account.deposit(1000);
        account.withdraw(500); // Access denied
        System.out.println("Balance: " + account.getBalance());

        BankAccount adminAccount = new ProxyBankAccount("Admin");
        adminAccount.withdraw(500); // Successful withdrawal
        System.out.println("Balance: " + adminAccount.getBalance());
    }
}
