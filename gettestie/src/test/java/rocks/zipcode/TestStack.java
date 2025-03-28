package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....
    @Test
    public void TestHashSet() {
        HashSet<Object> hashSet = new HashSet<>();
        Person person = new Person("Cherie", 1999);
        Person person2 = new Person("James", 2019);
        Person person3 = new Person("Eddie", 1997);

        hashSet.add(person);
        hashSet.add(person2);
        hashSet.add(person3);
        Assert.assertEquals(3, hashSet.size());

        hashSet.remove(person2);
        Assert.assertEquals(2, hashSet.size());

        hashSet.clear();
        Assert.assertEquals(0, hashSet.size());

        hashSet.add(person);
        hashSet.add(person2);
    }

    @Test
    public void TestArrayList() {
        ArrayList<Person> newPerson = new ArrayList<>();
        Person person = new Person("Sticky", 1999);
        Person person2 = new Person("Wallo", 2019);
        Person person3 = new Person("Dexter", 1997);

        newPerson.add(person);
        newPerson.add(person2);
        Assert.assertEquals(2, newPerson.size());
        newPerson.remove(person2);
        Assert.assertEquals(1, newPerson.size());
        Assert.assertEquals("Sticky", newPerson.get(0).getName());
    }

    @Test
    public void TestHashMaps() {
        HashMap<Person, String> hashMap = new HashMap<>();
        Person person = new Person("Sticky", 1999);
        Person person2 = new Person("Wallo", 2019);
        Person person3 = new Person("Dexter", 1997);
        hashMap.put(person, "1");
        hashMap.put(person2, "2");
        hashMap.put(person3, "3");

        assertEquals(3, hashMap.size());
        assertEquals("2", hashMap.get(person2));
        assertEquals("3", hashMap.get(person3));
        assertTrue(hashMap.containsKey(person3));

    }

    @Test
    public void TestLinkedList() {
        Address address = new Address("217 belly", "bear", "19702", "USA");
        Address address2 = new Address("2127 belly", "bear", "19702", "USA");
        Person person = new Person("Chuck", 1994);
        Person person2 = new Person("Mike", 2004);

        LinkedList<Person> linkedList = new LinkedList<>();
        LinkedList<Address> linkedAddress = new LinkedList<>();
        linkedList.add(person);
        linkedList.add(person);

        linkedList.push(person2);
        Assert.assertEquals(3, linkedList.size());
        Assert.assertEquals(person2, linkedList.getFirst());
        linkedList.addFirst(person);
        Assert.assertEquals(person, linkedList.getFirst());

        linkedAddress.push(address);
        linkedAddress.add(address2);
        Assert.assertEquals(linkedAddress.get(0), linkedAddress.getFirst());
    }

    @Test
    public void TestArrayDeque() {
        Address address = new Address("217 belly", "bear", "19702", "USA");
        Address address2 = new Address("2127 belly", "bear", "19702", "USA");
        Person person = new Person("Chuck", 1994);
        Person person2 = new Person("Mike", 2004);

        ArrayDeque<Person> personArrayDeque = new ArrayDeque<>();
        ArrayDeque<Address> addressArrayDeque = new ArrayDeque<>();

        personArrayDeque.add(person);
        Assert.assertEquals(person, personArrayDeque.getFirst());

        personArrayDeque.addFirst(person2);
        Assert.assertEquals(person2, personArrayDeque.element());
        Assert.assertEquals(2, personArrayDeque.size());
        Assert.assertEquals(person2, personArrayDeque.peek());
        addressArrayDeque.add(address2);
        addressArrayDeque.addFirst(address);
        Assert.assertEquals(address, addressArrayDeque.getFirst());
        Assert.assertFalse(addressArrayDeque.isEmpty());
        Assert.assertEquals(address,addressArrayDeque.peek());
        Assert.assertEquals(person2,personArrayDeque.peek());

    }

    @Test
    public void TestVector(){
        Address address = new Address("217 belly", "bear", "19702", "USA");
        Address address2 = new Address("2127 belly", "bear", "19702", "USA");
        Person person = new Person("Chuck", 1994);
        Person person2 = new Person("Mike", 2004);

        Vector<Person> personVector = new Vector<>();
        Vector<Address> addressVector = new Vector<>();

        addressVector.add(address2);
        addressVector.add(address);
        personVector.add(person);
        personVector.add(person2);

        Assert.assertEquals(address2, addressVector.get(0));
        Assert.assertFalse(addressVector.isEmpty());
        addressVector.remove(address2);
        addressVector.remove(address);
        Assert.assertTrue(addressVector.isEmpty());
        Assert.assertEquals(person2,personVector.get(1));
    }

    @Test
    public void TestTreeMap(){
        Address address = new Address("217 belly", "bear", "19702", "USA");
        Person person = new Person("Chuck", 1994);

        TreeMap<Address, Person> addressTreeMap = new TreeMap<>();

        addressTreeMap.put(address, person);
        Person expectedStreet = addressTreeMap.get(address);

        Assert.assertEquals("Chuck", expectedStreet.getName());

    }

    @Test
    public void TestStack(){
        Address address = new Address("217 belly", "bear", "19702", "USA");
        Address address2 = new Address("2127 belly", "bear", "19702", "USA");
        Person person = new Person("Chuck", 1994);

        Stack<Address> addressStack = new Stack<>();

        addressStack.push(address);
        addressStack.push(address2);

        Assert.assertEquals(address2, addressStack.peek());
        addressStack.pop();
        Assert.assertNotEquals(address2, addressStack.peek());
    }

    @Test
    public void TestTreeSet(){
        Person person = new Person("Chuck", 1994);
        Person person2 = new Person("Eddie", 2004);

        TreeSet<Person> addressTreeSet = new TreeSet<>();

        addressTreeSet.add(person);
        addressTreeSet.add(person2);

        Assert.assertEquals(person, addressTreeSet.first());

    }

    @Test
    public void TestIterator(){
        Person person = new Person("Chuck", 1994);
        Person person2 = new Person("Eddie", 2004);
        Person person3 = new Person("Jonah", 2014);

        TreeSet<Person> addressTreeSet = new TreeSet<>();

        addressTreeSet.add(person);
        addressTreeSet.add(person2);

        Iterator<Person> iterator = addressTreeSet.iterator();

        Assert.assertTrue(iterator.hasNext());

        iterator.next();

        Assert.assertTrue(iterator.hasNext());

        iterator.next();

        Assert.assertFalse(iterator.hasNext());


    }

}
