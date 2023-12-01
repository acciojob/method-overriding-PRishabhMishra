package com.driver;

public  class Main {
    public static void main(String[] args) {
        A objA = new A();
        System.out.println(objA.meth());

        B objB = new B();
        System.out.println(objB.callMethodFromA());

        B objB1 = new B();
        System.out.println(objB1.meth());
    }
}