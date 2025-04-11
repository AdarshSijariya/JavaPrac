class Address {
    String city;
    String state;
}

class TaxPayer implements Cloneable {
    String name;
    int age;
    Address address;

    public TaxPayer clone() {
        TaxPayer x = null;

        try {
            x = (TaxPayer)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return x;
    }
}

class H {
    public static void main(String[] args) {
        Address addr = new Address();
        addr.city = "yampuri";
        addr.state = "yamlok";

        TaxPayer tp = new TaxPayer();
        tp.name = "Yamraj";
        tp.age = 1000;
        tp.address = addr;

        TaxPayer y = tp.clone();

        System.out.println(y.name);
        System.out.println(y.age);
        System.out.println(y.address.city);
        System.out.println(y.address.state);
    }    
}
