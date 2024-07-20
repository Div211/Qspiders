//Polymorphism - An ability of an object to exhibit more than one form is known as polymorphism. 
//One  name but different behavior is known as polymorphism. 
//Types - Compile time polymorphism  ,  Runtime Polymorphism
//Varaible shadowing - A subclass and super class is having static and non static variable with same name but diff values. Which varaible to be called is decided during compile time based on reference variable type. 
// public class poly {
//     public static void main(String args[]){
//         System.out.println("Father class obj");
//         Father ref1 = new Father();
//         System.out.println(ref1.a);
//         System.out.println(ref1.b);
//         System.out.println("Son class object");
//         Son ref2 = new Son();
//         System.out.println(ref2.a);
//         System.out.println(ref2.b);
//         System.out.println("Upcasting");
//         Father ref3 = new Son();
//         System.out.println(ref3.a);
//         System.out.println(ref3.b);
//         System.out.println("Downcasting");
//         Son ref4 = (Son) ref3;
//         System.out.println(ref4.a);
//         System.out.println(ref4.b);
//     }
    
// }
//     class Father{
//         int a =10;
//         static int b = 20;
//     }
//     class Son extends Father{
//         int a = 100;
//         static int b = 200;
//     }

//Method shadowing - Sub class and super class is having static method with same name same axis specifier same return type and same formal arguments is known as method shadowing. Which method to be called is decided during compile time based on reference variable type. 

// public class poly {
//     public static void main(String args[]){
//         System.out.println("Father class obj");
//         Father ref1 = new Father();
//         ref1.test();
//         System.out.println("Son class object");
//         Son ref2 = new Son();
//         ref2.test();
//         System.out.println("Upcasting");
//         Father ref3 = new Son();
//         ref3.test();
//         System.out.println("Downcasting");
//         Son ref4 = (Son) ref3;
//         ref4.test();
//     }
// }
//     class Father{
//         public static void test(){
//             System.out.println("Father class method");
//         }
//     }
//     class Son extends Father{
//         public static void test(){
//         System.out.println("Son class method");
//        }
//     }

//Method Overriding - A subclass and super class is having non static method with same name, same axis specifier same return type and same formal argument. Which method to be called is decided by object creation. It works on only non-static


// public class poly {
//     public static void main(String args[]){
//         System.out.println("Father class obj");
//         Father ref1 = new Father();
//         ref1.test();
//         System.out.println("Son class object");
//         Son ref2 = new Son();
//         ref2.test();
//         System.out.println("Upcasting");
//         Father ref3 = new Son();
//         ref3.test();
//         System.out.println("Downcasting");
//         Son ref4 = (Son) ref3;
//         ref4.test();
//     }
// }
//     class Father{
//         public void test(){
//             System.out.println("Father class method");
//         }
//     }
//     class Son extends Father{
//         public void test(){
//         System.out.println("Son class method");
//        }
//     }


//Q. Write a java program to create a base class Shape with a method called calculateArea(). Create three subclasses: Circle, Rectangle, Triangle. Override the calculateArea() method in each subclass to calculate and return the shapes area. 
// public class poly{
// public static void main(String args[]){
//     System.out.println("Test start");
//     Shape ref1  = new Shape();
//     Circle ref2 = new Circle(30, 3.14);
//     Rectangle ref3 = new Rectangle(30,14, 4);
//     Triangle ref4 = new Triangle(30, 33);
//     System.out.println(ref2.calculateArea());
//     System.out.println(ref3.calculateArea());
//     System.out.println(ref4.calculateArea());
//     System.out.println("Test end");  
// }
// }
// class Shape{
//     public double calculateArea(){
        
//         return 0.0;
//     }
// }
// class Circle extends Shape{
//     double r;
//     double pie;
//     public Circle(double r, double pie){
//         this.r=r;
//         this.pie = pie;
//     }
//     public double calculateArea(){
//         return pie*r*r;
//     }
// }
// class Rectangle extends Shape{
//     double b;
//     double h;
//     double l;
//     public Rectangle(double l, double h, double b){
//         this.l =l;
//         this.h = h;
//         this.b = b;
//     }
//     public double calculateArea(){
//         return l*b*h;
//     }
// }
// class  Triangle extends Shape{
//     double b ;
//     double h;
//     public Triangle(double h ,double b){
//         this.b = b;
//         this.h =h;
//     }
//     public double calculateArea(){
//         return 0.5* h * b;
//     }
// }

