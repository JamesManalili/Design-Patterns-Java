package StrategyPatternSW;

public class Knight implements SkillsType {

    @Override
    public String attack(){
        String output = new String();
        SwingSword swingSword = new SwingSword();
        output += "Knight: \n" + swingSword.attack();
        return output;
    }

    @Override
    public String defend(){
        String output = new String();
        Shield shield = new Shield();
        Dodge dodge = new Dodge();
        CreateMagic barrier = new CreateMagic();
        output +=  shield.defend() + "\n" +
                   dodge.defend() + "\n" +
                   barrier.defend() +"\n";
        return output;
    }
}
