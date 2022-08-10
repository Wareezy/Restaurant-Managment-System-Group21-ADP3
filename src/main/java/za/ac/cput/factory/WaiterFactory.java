package za.ac.cput.factory;

import za.ac.cput.domain.Name;
import za.ac.cput.domain.Waiter;
import za.ac.cput.util.StringHelper;

/*Warren Jaftha-219005303*/
public class WaiterFactory {
    public static Waiter createWaiter(String waiterId,String waiterEmail,String firstName,String middleName,String lastName)
    {
        if(StringHelper.isEmptyOrNull(waiterId) || StringHelper.isEmptyOrNull(waiterEmail))
            throw new IllegalArgumentException("values are missing");
        if(!StringHelper.isValidEmail2(waiterEmail))
            throw new IllegalArgumentException();
        Name name=NameFactory.createName(firstName,middleName,lastName);
        if(name==null)
            throw new IllegalArgumentException();

        return new Waiter.Builder().waiterId(waiterId).waiterEmail(waiterEmail).name(name).build();
    }
    public static Waiter.WaiterIdentity buildId(Waiter waiter)
    {
        return new Waiter.WaiterIdentity(waiter.getWaiterId());
    }

}
