package org.example.chapter1.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StudentReflect {
    public static void setNameStudent(Object object, String name) {
        Class clazz = object.getClass();
        try {
            Method method = clazz.getMethod( "setName", new Class[] {String.class});
            method.invoke(object, new Object[] { name });
        } catch (NoSuchMethodException exception) {
            exception.printStackTrace();
        } catch (IllegalAccessException exception) {
            exception.printStackTrace();
        } catch (IllegalArgumentException exception) {
            exception.printStackTrace();
        } catch (InvocationTargetException exception) {
            exception.printStackTrace();
        }
    }

    public static Method[] getAllPublicMethod(Object object) {
        return object.getClass().getMethods();
    }

    public static Method[] getAllDeclaredMethodsStudent(Object object) {
        return object.getClass().getDeclaredMethods();
    }

    public static Method getDeclareMethodStudent(Object object, String name, Class[] classes) throws NoSuchMethodException {
        return object.getClass().getDeclaredMethod(name, classes);
    }



}
