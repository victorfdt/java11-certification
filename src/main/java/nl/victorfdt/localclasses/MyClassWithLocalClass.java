package nl.victorfdt.localclasses;

import nl.victorfdt.utils.Exercise;

public class MyClassWithLocalClass implements Exercise {

    private final String name = "MyClassWithLocalClass";
    private static int size;

    public MyClassWithLocalClass() {
        System.out.println("MyClassWithLocalClass constructor");
        class LocalClassInsideConstructor {
            {
                System.out.println("LocalClassInsideConstructor initializer");
                System.out.println(name);
                System.out.println(size);
            }
        }
    }

    public void execute() {
        // Create a local class
        class LocalClass {
            {
                System.out.println(name);
            }
        }

        staticMethod();
    }

    public static void staticMethod() {
        class LocalClassInsideStaticMethod {
            {
                // Cannot access instance fields, but the class is inside a static method.
                //System.out.println(name);

                // It can only access static fields, if they are effectively final.
                size = 10;
                System.out.println(size);
            }
        }
    }
}
