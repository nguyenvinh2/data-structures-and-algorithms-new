package FIFOAnimalShelter;

import DataStructures.StackAndQueue.Node;
import DataStructures.StackAndQueue.Queue;

import java.time.LocalDateTime;

public class AnimalShelter {
    private Queue catShelter = new Queue();
    private Queue dogShelter = new Queue();
    private Queue catTimestamp = new Queue();
    private Queue dogTimestamp = new Queue();

    public void enqueue(Animal animal) {
        if (animal != null) {
            if (animal instanceof Dog) {
                dogShelter.enqueue(new Node(animal));
                dogTimestamp.enqueue(new Node(LocalDateTime.now()));
            } else if (animal instanceof Cat) {
                catShelter.enqueue((new Node(animal)));
                catTimestamp.enqueue(new Node(LocalDateTime.now()));
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
