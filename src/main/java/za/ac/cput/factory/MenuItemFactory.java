package za.ac.cput.factory;

import za.ac.cput.domain.MenuItem;

public class MenuItemFactory {

    public static MenuItem createMenu( String title){
        if( StringHelper.isStringHelper.isNullorEmpty(title))
            throw new IllegalArgumentException();
        return new MenuItem.Builder().setTitle(title).build();
    }
}
