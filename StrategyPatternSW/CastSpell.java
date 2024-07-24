package StrategyPatternSW;

public class CastSpell implements AttackStrategy{
    @Override
    public String attack(){
        return "Casts a spell!";
    }
}