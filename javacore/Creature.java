class Creature {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Puppy extends Creature {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Creature generic = new Creature();
        Puppy doggy = new Puppy();

        generic.makeSound();
        doggy.makeSound();
    }
}
