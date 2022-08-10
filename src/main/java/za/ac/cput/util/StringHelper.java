package za.ac.cput.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;
/*Warren Jaftha-219005303*/
public class StringHelper {
    public static boolean isValidEmail(String customerEmail){
        EmailValidator ev=EmailValidator.getInstance();
        return ev.isValid(customerEmail);
    }
    public static boolean isValidEmail2(String waiterEmail){
        EmailValidator ev2=EmailValidator.getInstance();
        return ev2.isValid(waiterEmail);
    }
    public static boolean isValidEmail3(String chefEmail){
        EmailValidator ev3=EmailValidator.getInstance();
        return ev3.isValid(chefEmail);
    }

    public static String generateId(){return UUID.randomUUID().toString();}
    public static boolean isEmptyOrNull(String str)
    {return StringUtils.isEmpty(str);
    }
    public static String setEmptyIfNull(String str)
    {
        if(isEmptyOrNull(str)){
            return StringUtils.EMPTY;
        }
        return str;
    }

    public static void checkStringParam(String paramName,String paramValue){
        if (isEmptyOrNull(paramValue))
            throw new IllegalArgumentException(String.format("Invalid value for: %s", paramName));
    }
    public static void checkEmail(String s){
        EmailValidator emailValidator=EmailValidator.getInstance();
        if(!emailValidator.isValid(s))
            throw new IllegalArgumentException("Email is not valid");
    }
    public static void checkIfObjectNull(String objectName,Object object){
        if(object ==null){
            throw new IllegalArgumentException(String.format("%s is null",objectName));
        }


    }
}
