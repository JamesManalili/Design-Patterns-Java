package StrategyPatternSW;

public class SwingSword implements AttackStrategy{
    @Override
    public String attack(){
        return "Attacks with a sword!";
    }
}