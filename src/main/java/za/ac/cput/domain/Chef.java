package za.ac.cput.domain;

/* Chef.java
        entity
        Author: Aristoteles Pascoal (218290276)
        Date: 7 august 2022
        */

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Chef implements Serializable {
    @Id
    @Column(name = "chef_id")

    private String chefId;

    public String chefEmail;
    private Name name;

    protected Chef() {
    }

    private Chef(Builder builder) {
        this.chefId = builder.chefId;
        this.name = builder.name;
        this.chefEmail = builder.chefEmail;
    }

    public String getChefId() {
        return chefId;
    }

    public String getChefEmail() {
        return chefEmail;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Chef{" +
                "id='" + chefId + '\'' +
                ", email='" + chefEmail + '\'' +
                ", name=" + name +
                '}';
    }

    public static class Builder {

        private String chefId;
        private String chefEmail;
        private Name name;

        public Builder setChefId(String chefId) {
            this.chefId = chefId;
            return this;
        }

        public Builder setChefEmail(String chefEmail) {
            this.chefEmail = chefEmail;
            return this;
        }

        public Builder setName(Name name) {
            this.name = name;
            return this;
        }

        public Builder copy(Chef chef) {
            this.chefId = chef.chefId;
            this.chefEmail = chef.chefEmail;
            this.name = chef.name;

        }
        public Chef build(){return new Chef(this);}

    }
}

