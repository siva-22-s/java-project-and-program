package abst;

abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}

class SavingAccount extends BankAccount {
    public SavingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("Updated balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Updated balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Cannot withdraw.");
        }
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("Updated balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Amount withdrawn: " + amount);
        System.out.println("Updated balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount savingAccount = new SavingAccount(5000.0);
        BankAccount currentAccount = new CurrentAccount(10000.0);

        savingAccount.deposit(2000.0);
        savingAccount.withdraw(1500.0);

        currentAccount.deposit(3000.0);
        currentAccount.withdraw(5000.0);
    }
}
