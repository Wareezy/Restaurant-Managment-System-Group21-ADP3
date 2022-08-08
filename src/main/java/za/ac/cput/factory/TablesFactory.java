package za.ac.cput.factory;

import org.hibernate.validator.internal.util.StringHelper;
import za.ac.cput.domain.Tables;

public class TablesFactory {
    public static Tables createTables(String tableID, String numberOfGuest){
        if(StringHelper.isNullOrEmptyString(tableID) || StringHelper.isNullOrEmptyString(numberOfGuest))
            throw new IllegalArgumentException();
        return new Tables.Builder().setTableID(tableID)
                .setNumberOfGuest(numberOfGuest)
                .build();
    }
}


