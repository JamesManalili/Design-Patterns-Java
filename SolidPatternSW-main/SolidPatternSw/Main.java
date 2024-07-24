public class Main {
    public static void main(String[] args) {
        Pet cat = new Pet("Bruce", "James");
        PetFood petEat = new PetFood();
        PetSound petSound=  new PetSound();

        petEat.eat(cat, "chicken");
        petSound.makeSound(cat, "Meow Meow Sarap");
    }
}
