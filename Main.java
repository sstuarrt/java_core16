package com.company.java_core.homework16.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class doc = Doctor.class;

        String className = doc.getSimpleName();
        System.out.println("The name of the class is: ");
        System.out.println(className);
        System.out.println("\n");

        int modifier = doc.getModifiers();
        String classModifier = Modifier.toString(modifier);
        System.out.println("The modifier of the class is: ");
        System.out.println(classModifier);
        System.out.println("\n");

        String classPackage = doc.getPackageName();
        System.out.println("The name of the class package is: ");
        System.out.println(classPackage);
        System.out.println("\n");

        Class classSuper = doc.getSuperclass();
        System.out.println("The Super Class of the current class is: ");
        System.out.println(classSuper);
        System.out.println("\n");

        Class[] interfaces = doc.getInterfaces();
        String classInterfaces = Arrays.toString(interfaces);
        System.out.println("The implemented interfaces to the current class are: ");
        System.out.println(classInterfaces);
        System.out.println("\n");

        Constructor<Doctor>[] constructors = doc.getConstructors();
        String classConstructors = Arrays.toString(constructors);
        System.out.println("The constructors of the current class: ");
        System.out.println(classConstructors);
        System.out.println("\n");

        Constructor<Doctor> constructorType1 = constructors[0];
        TypeVariable<Constructor<Doctor>>[] typeParameter1 = constructorType1.getTypeParameters();
        String classParameters1 = Arrays.toString(typeParameter1);
        System.out.println("The types of first constructor parameters are: ");
        System.out.println(classParameters1);
        System.out.println("\n");

        Constructor<Doctor> constructorType2 = constructors[1];
        TypeVariable<Constructor<Doctor>>[] typeParameter2 = constructorType2.getTypeParameters();
        String classParameters2 = Arrays.toString(typeParameter2);
        System.out.println("The types of second constructor parameters are: ");
        System.out.println(classParameters2);
        System.out.println("\n");

        Constructor<Doctor> constructorType3 = constructors[2];
        TypeVariable<Constructor<Doctor>>[] typeParameter3 = constructorType3.getTypeParameters();
        String classParameters3 = Arrays.toString(typeParameter3);
        System.out.println("The types of third constructor parameters are: ");
        System.out.println(classParameters3);
        System.out.println("\n");
    }
}
