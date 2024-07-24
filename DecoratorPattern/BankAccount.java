package DecoratorPattern;

public interface BankAccount {
    public Double getInterestRate();
    public Double getBalance();
    public String showAccountType();
    public String showBenefits();
    public String showInfo();
    public Double computeBalanceWithInterest();
}

