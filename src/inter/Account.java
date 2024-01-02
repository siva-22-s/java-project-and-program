package inter;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    double getBalance();
}

class SavingAccount implements Account {
    private double balance;

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void calculateInterest() {
        double interestRate = 0.05; // 5%
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest calculated: $" + interest);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    // Additional method specific to SavingAccount
    public void performSavingAccountAction() {
        System.out.println("Performing a specific action for SavingAccount.");
    }
}

class CurrentAccount implements Account {
    private double balance;

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest calculation for CurrentAccount.");
    }

    @Override
    public double getBalance() {
        return balance;
    }

    // Additional method specific to CurrentAccount
    public void performCurrentAccountAction() {
        System.out.println("Performing a specific action for CurrentAccount.");
    }


    public static void main(String[] args) {
       
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.deposit(1000);
        savingAccount.calculateInterest();
        savingAccount.performSavingAccountAction();
       

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.deposit(2000);
        currentAccount.withdraw(500);
        currentAccount.performCurrentAccountAction();
        }
}