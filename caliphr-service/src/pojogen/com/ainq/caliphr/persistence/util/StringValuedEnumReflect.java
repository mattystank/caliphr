
package com.ainq.caliphr.persistence.util;
import java.lang.reflect.InvocationTargetException;

/**
 * Utility class designed to inspect StringValuedEnums.
 * @author autogenerated
 */
public class StringValuedEnumReflect {
    
    /**
     * Don't let anyone instantiate this class.
     * @throws UnsupportedOperationException Always.
     */
    private StringValuedEnumReflect() {
        throw new UnsupportedOperationException("This class must not be instantiated.");
    }
    
    /**
     * All Enum constants (instances) declared in the specified class. 
     * @param enumClass Class to reflect
     * @param <T> Type
     * @return Array of all declared EnumConstants (instances).
     */
    @SuppressWarnings("rawtypes")
    private static <T extends Enum> T[] 
            getValues(Class<T> enumClass) {
        return enumClass.getEnumConstants();
    }
    
    /**
     * All possible string values of the string valued enum.
     * @param enumClass Class to reflect.
     * @param <T> Type
     * @return Available string values.
     */
    @SuppressWarnings("rawtypes")
    public static <T extends Enum & StringValuedEnum> String[]
            getStringValues(Class<T> enumClass) { 
        T[] values = getValues(enumClass);
        String[] result = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = values[i].getValue();
        }
        return result;
    }
    
    /**
     * Name of the enum instance which hold the especified string value.
     * If value has duplicate enum instances than returns the first occurency.
     * @param enumClass Class to inspect.
     * @param value String.
     * @param <T> Type
     * @return name of the enum instance.
     */
    @SuppressWarnings("rawtypes")
    public static <T extends Enum> String
            getNameFromValue(Class<T> enumClass, Object value) {
        T[] values = getValues(enumClass);
        for (int i = 0; i < values.length; i++) {
            if (reflectGetValue(values[i]).equals(value.toString().trim())) {
                return values[i].name();
            }
        }
        return "";
    }
    
    public static String reflectGetValue(Object v){
        try {
            return (String)v.getClass().getMethod("getValue").invoke(v);
        } catch ( InvocationTargetException  | IllegalAccessException  | NoSuchMethodException e4) {
            return "Unable to return a value from String Valued Enum";
        }
    }
}