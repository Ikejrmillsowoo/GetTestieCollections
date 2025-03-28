package rocks.zipcode;

public class Address implements Comparable<Address> {
    private String street;
    private String town;
    private String postCode;
    private String country;

    /**
     * Construct an Address without country
     */
    public Address(String street, String town, String postCode) {
        this(street, town, postCode, "");
    }

    /**
     * Construct an Address with full details
     */
    public Address(String street, String town, String postCode, String country) {
        this.street = street;
        this.town = town;
        this.postCode = postCode;
        this.country = country;
    }

    /**
     * Return a string representation of this object.
     */
    public String toString() {
        return street + "\n" + town + " " + postCode + "\n" + country + "\n";
    }

    @Override
    public int compareTo(Address o) {
        int result = this.street.compareTo(o.street);
        if (result != 0) return result;

        result = this.town.compareTo(o.town);
        if (result != 0) return result;

        result = this.postCode.compareTo(o.postCode);
        if (result != 0) return result;

        return this.country.compareTo(o.country);
    }

}
