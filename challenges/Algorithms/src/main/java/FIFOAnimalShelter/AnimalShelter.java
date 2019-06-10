package FIFOAnimalShelter;

import DataStructures.StackAndQueue.Queue;

import java.time.LocalDateTime;

public class AnimalShelter {
    private Queue<Animal> catShelter = new Queue<Animal>();
    private Queue<Animal> dogShelter = new Queue<Animal>();
    private Queue<LocalDateTime> catTimestamp = new Queue<LocalDateTime>();
    private Queue<LocalDateTime> dogTimestamp = new Queue<LocalDateTime>();

    public void enqueue(Animal animal) {
        if (animal != null) {
            if (animal instanceof Dog) {
                dogShelter.enqueue(animal);
                dogTimestamp.enqueue(LocalDateTime.now());
            } else if (animal instanceof Cat) {
                catShelter.enqueue(animal);
                catTimestamp.enqueue(LocalDateTime.now());
            }
        }
    }

    public Animal dequeue(String animal) {
        switch (animal.toLowerCase()) {
            case "dog":
                dogTimestamp.dequeue();
                return (Animal)dogShelter.dequeue();
            case "cat":
                break;
            default:
                System.out.println("Other animal not supported at this time");
                break;
        }
        return null;
    }

    public void test() {
        Dog happy = new Dog("happy");
        enqueue(happy);
    }
}
