package ru.netology.vodolazhsky;

public class ClassLoader {

    public static void main(String[] args) {
        String staticStrA = A.staticStrA;
        String staticStrA1 = A.staticStrA;
    }

}

class A {
    String strA;
    int intA;

    {
        System.out.println("Анонимный блок A");
        System.out.println(strA);
        System.out.println(intA);
        strA = "123";
        intA = 1;
        System.out.println(strA);
        System.out.println(intA);
    }

    static String staticStrA;
    static {
        System.out.println("Статический блок А");
        staticStrA = "some value";
    }

    A() {
        System.out.println("Конструктор A");
    }
}

class B extends A {
    String strB;
    int intB;

    {
        System.out.println("Анонимный блок B");
        strB = "123";
        intB = 123;
    }

    static String staticStrB = "value";
    static {
        System.out.println("Статический блок B");
        staticStrB = "some value";
    }

    B() {
        System.out.println("Конструктор B");
    }
}
