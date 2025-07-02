package proxyD;

public class ProxyBankAccount implements BankAccount {

    private final RealBankAccount realAccount;
    private final String userRole;

    public ProxyBankAccount(String userRole) {
        this.userRole = userRole;
        this.realAccount = new RealBankAccount();
    }

    public void deposit(double amount) {
        realAccount.deposit(amount);
    }

    public void withdraw(double amount) {
        if ("Admin".equals(userRole)) {
            realAccount.withdraw(amount);
        } else {
            System.out.println("Access denied. Only Admin can withdraw.");
        }
    }

    public double getBalance() {
        return realAccount.getBalance();
    }
}
