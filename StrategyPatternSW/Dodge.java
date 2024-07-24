package StrategyPatternSW;

public class Dodge implements DefenseStrategy{
    @Override
    public String defend(){
        return "Dodging to avoid attack!";
    }
}