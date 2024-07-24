package StrategyPatternSW;

public class MainApp {
    public static void main(String[] args) {
        Character archer = new Character(new Archer());
        Character knight = new Character(new Knight());
        Character wizard = new Character(new Wizard());


        System.out.println(archer.attack());
        System.out.println(archer.defend());
        System.out.println(knight.attack());
        System.out.println(knight.defend());
        System.out.println(wizard.attack());
        System.out.println(wizard.defend());
    }
}
