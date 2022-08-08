package za.ac.cput.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Name implements Serializable {


    private String firstName;
    private String middleName;
    private String lastName;

    protected Name () {}

    private Name(Builder builder) {
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        Name name=(Name) o;
        return Objects.equals(firstName, name.firstName) && Objects.equals(middleName, name.middleName)
                && Objects.equals(lastName, name.lastName);
    }

    @Override
    public int hashCode(){return Objects.hash(firstName, middleName, lastName);}

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }

    public static class Builder
    {
        public String firstName;
        public String middleName;
        public String lastName;

        public Builder setFirstName(String firstName)
        {
            this.firstName=firstName;
            return this;
        }
        public Builder setMiddleName(String middleName)
        {
            this.middleName=middleName;
            return this;
        }
        public Builder setLastName(String lastName)
        {
            this.lastName=lastName;
            return this;
        }

        public Builder copy(Name name)
        {
            this.firstName=name.firstName;
            this.middleName=name.middleName;
            this.lastName=name.lastName;
            return this;
        }
        public Name build(){return new Name(this);}
    }
}
