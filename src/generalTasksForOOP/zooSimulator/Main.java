package generalTasksForOOP.zooSimulator;


public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Elephant(),
                new Lion(),
                new Monkey()
        };
        for (Animal animal : animals) {
            simulateSound(animal);
        }

    }

    public static void simulateSound(Animal animal) {
        animal.makeSound();
    }
}
