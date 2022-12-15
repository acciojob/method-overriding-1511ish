package com.driver;


 class A{
    public String meth()
    {
        return "Invoking method from class A";
    }
}
 class B extends A{
     public String meth()
     {
         return "Invoking method from class B";
     }
}
public class Main {
    public static void main(String args[])
   {
     B b = new B();
     System.out.print(b.meth());
     B b1=new B();
     System.out.print(b.meth());
   }
}