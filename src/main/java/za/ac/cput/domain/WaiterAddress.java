package za.ac.cput.domain;

/**
 * WaiterAddress.java;
 * @Author: Nawaaz Amien - 219099839
 */

import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

public class WaiterAddress implements Serializable {

    @Id
    private String waiterId;

    @OneToOne
    @JoinColumn(name = "waiter_Id", referencedColumnName = "waiter_Id")
    //private Waiter waiter;

    @Embedded
    private Address address;

    protected WaiterAddress() {}

    private WaiterAddress(Builder builder) {
        this.waiterId = builder.waiterId;
        this.address = builder.address;
    }

    public String getWaiterId() {
        return waiterId;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "WaiterAddress{" +
                "waiterId='" + waiterId + '\'' +
                ", address=" + address +
                '}';
    }

    public static class Builder {

        private String waiterId;

        private Address address;


        public Builder setWaiterId(String waiterId) {
            this.waiterId = waiterId;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder copy(WaiterAddress waiterAddress) {
            this.waiterId = waiterAddress.waiterId;
            this.address = waiterAddress.address;
            return this;
        }
        public WaiterAddress build() {return new WaiterAddress(this);}

    }
}
