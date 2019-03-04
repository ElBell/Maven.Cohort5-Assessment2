package rocks.zipcode.assessment2.objectorientation;

import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    String[] address;
    public Address() {
        address = new String[5];
        Arrays.fill(address, "");
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        address = new String[]{addressLine1, addressLine2, city, state, zipcode};
    }

    public String getAddressLine1() {
        return address[0];
    }

    public void setAddressLine1(String addressLine1) {
        address[0] = addressLine1;
    }

    public String getAddressLine2() {
        return address[1];
    }

    public void setAddressLine2(String addressLine2) {
        address[1] = addressLine2;
    }

    public String getCity() {
        return address[2];
    }

    public void setCity(String city) {
        address[2] = city;
    }

    public String getState() {
        return address[3];
    }

    public void setState(String state) {
        address[3] = state;
    }

    public String getZipcode() {
        return address[4];
    }

    public void setZipcode(String zipcode) {
        address[4] = zipcode;
    }

    @Override
    public String toString() {
        return String.format("Address{addressLine1='%s', addressLine2='%s', city='%s', state='%s', zipcode='%s'}",
                getAddressLine1(), getAddressLine2(), getCity(), getState(), getZipcode());
    }

    @Override
    public boolean equals(Object o) {
        Address otherAddress = (Address) o;
        return otherAddress.getAddressLine1().equals(address[0]) &&
                otherAddress.getAddressLine2().equals(address[1]) &&
                otherAddress.getCity().equals(address[2]) &&
                otherAddress.getState().equals(address[3]) &&
                otherAddress.getZipcode().equals(address[4]);
    }
}
