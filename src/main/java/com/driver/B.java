package com.driver;

 class B extends A{

     String callMethodFromA() {
         return super.meth(); // Calling method from class A
     }
    @Override
    public  String meth() {

        return "Method is overridden in Extendend class B";

    }
}
