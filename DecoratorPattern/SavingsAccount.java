package DecoratorPattern;

public class SavingsAccount implements BankAccount{
    private int accountNumber;
    private String accountName;
    private Double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
 
    @Override
    public Double getInterestRate() {
        return 0.01;
    }
    
    @Override
    public Double getBalance() {
        return balance;
    }

    @Override
    public String showAccountType() {
        return "Saving Account";
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }
    
    @Override
    public String showInfo() {
        return "Account number: " + accountNumber +
                "\nAccount name: " + accountName +
                "\nBalance: " + balance;
    }

    @Override
    public Double computeBalanceWithInterest() {
        return (balance * getInterestRate()) + balance ;
    }
}
