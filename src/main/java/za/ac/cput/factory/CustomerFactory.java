package za.ac.cput.factory;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Name;
import za.ac.cput.util.StringHelper;

/*Warren Jaftha-219005303*/
public class CustomerFactory {
    public static Customer createCustomer(String customerId,String customerEmail,String firstName,String middleName,String lastName)
    {
        if(StringHelper.isEmptyOrNull(customerId)  || StringHelper.isEmptyOrNull(customerEmail))
            throw new IllegalArgumentException("values are missing");
        if(!StringHelper.isValidEmail(customerEmail))
            throw new IllegalArgumentException();
        Name name=NameFactory.createName(firstName,middleName,lastName);
        if(name==null)
            throw new IllegalArgumentException();

        return new Customer.Builder().customerId(customerId).customerEmail(customerEmail).name(name).build();
    }
    public static Customer.CustomerIdentity buildId(Customer customer)
    {
        return new Customer.CustomerIdentity(customer.getCustomerId());
    }

}
