package com.driver;

public  class Main {
    public static void main(String[] args) {
        A objA = new A();
        objA.meth();

        B objB = new B();
        objB.callMethodFromA();

        B objB1 = new B();
        objB1.meth();
    }
}