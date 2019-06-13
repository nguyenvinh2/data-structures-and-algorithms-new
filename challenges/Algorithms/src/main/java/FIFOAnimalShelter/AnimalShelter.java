package FIFOAnimalShelter;

import DataStructures.StackAndQueue.Queue;

import java.time.LocalDateTime;

public class AnimalShelter {
    private Queue<Animal> catShelter = new Queue<Animal>();
    private Queue<Animal> dogShelter = new Queue<Animal>();
    private Queue catTimeStamp = new Queue();
    private Queue dogTimeStamp = new Queue();
    private int line = 0;

    public void enqueue(Animal animal) {
        if (animal != null) {
            if (animal instanceof Dog) {
                dogShelter.enqueue(animal);
                dogTimeStamp.enqueue(line++);
            } else if (animal instanceof Cat) {
                catShelter.enqueue(animal);
                catTimeStamp.enqueue(line++);
            } else {
                System.out.println("Cannot add " + animal.getClass());
            }
        } else {
            System.out.println("Cannot add null");
        }
    }

    public Animal dequeue(String animal) {
        switch (animal.toLowerCase()) {
            case "dog":
                dogTimeStamp.dequeue();
                return dogShelter.dequeue();
            case "cat":
                catTimeStamp.dequeue();
                return catShelter.dequeue();
            default:
                System.out.println("Other animal not supported at this time");
                break;
        }
        return null;
    }

    public Animal dequeue() {
        if (catTimeStamp.peek() == null && dogTimeStamp.peek() !=null ) {
            dogTimeStamp.dequeue();
            return dogShelter.dequeue();
        } else if (catTimeStamp.peek() != null && dogTimeStamp.peek() == null) {
            catTimeStamp.dequeue();
            return catShelter.dequeue();
        } else if(catTimeStamp.peek() !=null && dogTimeStamp.peek() != null) {
            if ((int)catTimeStamp.peek() > (int)dogTimeStamp.peek()) {
                dogTimeStamp.dequeue();
                return dogShelter.dequeue();
            } else {
                catTimeStamp.dequeue();
                return catShelter.dequeue();
            }
        }
        return null;
    }
}
