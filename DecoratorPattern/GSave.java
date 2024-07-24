package DecoratorPattern;

public class GSave implements BankAccountDecorator{

    private BankAccount bankAccount;

    public GSave(BankAccount bankAccount){
        this.bankAccount = bankAccount;
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

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
