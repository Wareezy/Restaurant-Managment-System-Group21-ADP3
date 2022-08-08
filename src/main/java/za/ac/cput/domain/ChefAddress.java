package za.ac.cput.domain;

import org.apache.commons.lang3.builder.Builder;

import javax.persistence.*;
import java.io.Serializable;
@Entity

public class ChefAddress implements Serializable {


    @Id
    private String chefId;

    @ManyToOne
    @JoinColumn(name = "chef_Id",referencedColumnName = "chef_Id")
    private Chef chef;



    Private  Address address;
    protected ChefAddress(){

    }
    private ChefAddress (Builder builder){
        this.chefId = builder.id;
        this.Address = builder.address;


    }

    public String getChefId() {
        return chefId;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "ChefAddress{" +
                "chefId='" + chefId + '\'' +
                ", Address=" + Address +
                '}';
    }

    public static class Builder{

        private String chefId;
        private Address address;

        public Builder setChefId(String chefId) {
            this.chefId = chefId;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }
        public Builder copy(ChefAddress chefAddress){
            this.chefId = chefAddress.chefId;
            this.address = chefAddress.Address;
            return this;

        }

        public ChefAddress build(){return  (new ChefAddress(this));}

    }

}
