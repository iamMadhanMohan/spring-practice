package auto.wire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AutoWireAnnotation {
    @Autowired
    @Qualifier("address2") // it is used when more than one bean found with same class
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "AutoWireAnnotation{" +
                "address=" + address +
                '}';
    }
}
