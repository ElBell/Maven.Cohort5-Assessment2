package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<Object extends Ageable> implements Iterable<Ageable> {
    private List<Ageable> list;
    public Shelter() {
        list = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return list.size();
    }

    public void add(Object object) {
        list.add(object);
    }

    public Boolean contains(Object object) {
        return list.contains(object);
    }

    public void remove(Object object) {
        list.remove(object);
    }

    public Object get(Integer index) {
        return (Object)list.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return list.indexOf(ageable);
    }

    @Override
    public Iterator<Ageable> iterator() {
        return list.iterator();
    }
}