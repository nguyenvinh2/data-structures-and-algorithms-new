package FIFOAnimalShelter;

import static org.junit.Assert.*;
import org.junit.Test;

public class AnimalShelterTest {

    @Test
    public void nullEnqueueAnimalShelterTest() {
        AnimalShelter test = new AnimalShelter();
        test.enqueue(null);
        assertNull(test.dequeue());
    }

    @Test
    public void nullEnqueueCatShelterTest() {
        AnimalShelter test = new AnimalShelter();
        test.enqueue(null);
        assertNull(test.dequeue("cat"));
    }

    @Test
    public void nullEnqueueDogShelterTest() {
        AnimalShelter test = new AnimalShelter();
        test.enqueue(null);
        assertNull(test.dequeue("dog"));
    }

    @Test
    public void addDogTestNoPreference() {
        AnimalShelter test = new AnimalShelter();
        test.enqueue(new Dog("Mitzy"));
        assertEquals("Mitzy", test.dequeue().name);
    }

    @Test
    public void addDogTestDogPreference() {
        AnimalShelter test = new AnimalShelter();
        test.enqueue(new Dog("Mitzy"));
        assertEquals("Mitzy", test.dequeue("dog").name);
    }

    @Test
    public void addDogTestCatPreference() {
        AnimalShelter test = new AnimalShelter();
        test.enqueue(new Dog("Mitzy"));
        assertNull(test.dequeue("cat"));
    }

    @Test
    public void addCatTestNoPreference() {
        AnimalShelter test = new AnimalShelter();
        test.enqueue(new Cat("Mitzy"));
        assertEquals("Mitzy", test.dequeue().name);
    }

    @Test
    public void addCatTestCatPreference() {
        AnimalShelter test = new AnimalShelter();
        test.enqueue(new Cat("Mitzy"));
        assertEquals("Mitzy", test.dequeue("cat").name);
    }

    @Test
    public void addCatTestDogPreference() {
        AnimalShelter test = new AnimalShelter();
        test.enqueue(new Cat("Mitzy"));
        assertNull(test.dequeue("dog"));
    }

    @Test
    public void addCatDogTestNoPreference() {
        AnimalShelter test = new AnimalShelter();
        test.enqueue(new Cat("Mitzy"));
        test.enqueue(new Dog("doge3"));
        test.enqueue(new Dog("dog23e"));
        test.enqueue(new Cat("doge"));
        test.enqueue(new Dog("do32ge"));
        assertEquals("Mitzy", test.dequeue().name);
        assertEquals("doge3", test.dequeue().name);
        assertEquals("dog23e", test.dequeue().name);
        assertEquals("doge", test.dequeue().name);
        assertEquals("do32ge", test.dequeue().name);
        assertNull(test.dequeue());
    }

    @Test
    public void addCatDogTestCatPreference() {
        AnimalShelter test = new AnimalShelter();
        test.enqueue(new Cat("Mitzy"));
        test.enqueue(new Dog("doge3"));
        test.enqueue(new Dog("dog23e"));
        test.enqueue(new Cat("doge"));
        test.enqueue(new Dog("do32ge"));
        assertEquals("Mitzy", test.dequeue("cat").name);
        assertEquals("doge", test.dequeue("cat").name);
        assertNull(test.dequeue("cat"));
    }

    @Test
    public void addCatDogTestDogPreference() {
        AnimalShelter test = new AnimalShelter();
        test.enqueue(new Cat("Mitzy"));
        test.enqueue(new Dog("doge3"));
        test.enqueue(new Dog("dog23e"));
        test.enqueue(new Cat("doge"));
        test.enqueue(new Dog("do32ge"));
        assertEquals("doge3", test.dequeue("dog").name);
        assertEquals("dog23e", test.dequeue("dog").name);
        assertEquals("do32ge", test.dequeue("dog").name);
        assertNull(test.dequeue("dog"));
    }

    @Test
    public void AnimalEnqueueNoPreferenceTest() {
        AnimalShelter test = new AnimalShelter();
        test.enqueue(new Animal("Mitzy"));
        assertNull(test.dequeue());
    }

    @Test
    public void AnimalEnqueueDogPreferenceTest() {
        AnimalShelter test = new AnimalShelter();
        test.enqueue(new Animal("Mitzy"));
        assertNull(test.dequeue("dog"));
    }

    @Test
    public void AnimalEnqueueCatPreferenceTest() {
        AnimalShelter test = new AnimalShelter();
        test.enqueue(new Animal("Mitzy"));
        assertNull(test.dequeue("cat"));
    }
}