package StrategyPatternSW;

public class Character {
    private SkillsType type;

    public Character(SkillsType type) {
        this.type = type;
    }

    public String attack(){
      return type.attack();
    }

    public String defend(){
        return type.defend();
    }
}