package StrategyPatternSW;

public class Wizard implements SkillsType {

    @Override
    public String attack(){
        String output = new String();
        CastSpell castSpell = new CastSpell();
        output += "Wizard: \n" + castSpell.attack();
        return output;
    }

    @Override
    public String defend(){
        String output = new String();
        CreateMagic barrier = new CreateMagic();
        output += barrier.defend() +"\n";
        return output;
    }
}