package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    private Long id;
    private String name;
    private Address address;
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
        this.id = Long.MIN_VALUE;
        this.name = "";
        this.address = new Address();
    }

    public Long getId() {
            return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Person{id=%d, name='%s', address=%s}", id, name, address);
    }

    @Override
    public boolean equals(Object o) {
        Person otherPerson = (Person) o;
        boolean idsEqual = true;
        if(!(otherPerson.getId() == null || id == null)) {
            idsEqual = otherPerson.getId().equals(id);
        }
        boolean addressEqual = true;
        if(!(otherPerson.getAddress() == null || address == null)) {
            addressEqual = otherPerson.getAddress().equals(address);
        }
        boolean nameEqual = true;
        if(!(otherPerson.getName() == null || name == null)) {
            nameEqual = otherPerson.getName().equals(name);
        }
        return nameEqual && idsEqual && addressEqual;
    }

    public static void main(String[] args) {
        Person person = new Person();
        Address address1 = person.getAddress();
        Address address2 = new Address();
        System.out.println(address1.equals(address2));
    }
}