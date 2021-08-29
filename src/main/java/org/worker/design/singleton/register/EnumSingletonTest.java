package org.worker.design.singleton.register;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        Class<?> clazz = EnumSingleton.class;
        try {
            Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);
            Object o = declaredConstructor.newInstance();
            System.out.println(o);
            System.out.println(declaredConstructor);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
