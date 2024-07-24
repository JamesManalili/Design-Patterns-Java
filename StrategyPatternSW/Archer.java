package StrategyPatternSW;

public class Archer implements SkillsType {

    @Override
    public String attack(){
        String output = new String();
        ShootArrow shootArrow = new ShootArrow();
        output += "Archer:\n" + shootArrow.attack();
        return output;
    }

    @Override
    public String defend(){
        String output = new String();
        Shield shield = new Shield();
        output += shield.defend() + "\n";
        return output;
    }
}