public class notes {
    
    //-Q- Method Recusion 
    // the method calling itself is known as method recurrsion and it give an eroor of StackOverflowError  --or-- 
    // the process of executing same set of statements repitadely is known as method recurssion.this statement which is responsible for the recurssion is known as recurssive call statement.
// eg 
//     class notes{
//     public static void main (String[]args){
//     sout ("Hi main");
//     test();
//     sout ("Bye main");}
//     public static void test(){
//     System.out.println("Hi test");
//     test();       Recurssive call statement
//     sout ("Bye test");
// }
// }


//OOPS

// Global Members  (A member which is declared inside global area ) - variable, method, block
// it has 2 types
// static member,   non-static

// static member - static variable, static method, static block
// non-static member - non-"" variabel, non-""  method, non-"" block, constructor

// Static member-- a member which is declared inside global area and prefix with static keyword is known as "".
// Static variable- a variable which is declared inside global area and prefix with static keyword.
// it is a type of global variable .they are store inside class static area.
// eg
// static int a =10;
// public static void main(String[]args){
//     System.out.println("hi main");
//     System.out.println(a);
// }

// Global variable - a variable which declared is inside global area.
// they are assigned with default values. we can use global variables without initialization. we cannot create 2 global variable with same name. they can be used inside global area as well as local area. 
// default values
// byte,short,int,long - 0
// float,double - 0.0
// char ________"blank space"
// boolean - false
// string- null
// diff between local and global variable

// static method - a method which is declare in global area with prefix static keyword. 
// static method block is also known as static context. every static context is directly pointing towards class static area.
// Note: every class will have a dedicated memory to store all static members is known as class static area. class static area name is similar to class name. 

// whenever we have static variable and local variable with same name if we use directly inside static context the high priority is given to local variable. if we want to use static varaible then we need to consider class name.

//eg 
// static int a=10;
// public static void main(String[]args){
//     System.out.println("Hi main");
//     test();
//     System.out.println("bye main");
//     }
//     public static void test(){
//         System.out.println("test start");
//         int a = 25;
//         System.out.println(a);
//         System.out.println(notes.a);
//         System.out.println("test end");
//     }

//static block - A block which is declared inside global area and prefix with static keyword.Static block doesn't have access specifier, return type and name. 
// why do we need static block -- to execute some set of statements before the execution of main method. 
//eg 
// static{
//     System.out.println("Welcome div........");
// }
// public static void main (String[]args){
//     System.out.println("Hii main");
//     System.out.println("Bye main");
// }

// static int a;
// static String s;
// static{
//     System.out.println("SIB1");
//     System.out.println(a);
//     s="QSP";
//     System.out.println(notes.s);
//     test(s);

// }
// public static void main(String[]args){
//     System.out.println("Main start");
//     System.out.println(a);
//     System.out.println(notes.s);
//     test(s);
//     System.out.println("Main end");

// }
// public static void test(String s){
//     System.out.println("Test(String) start");
//     s="JSP";
//     notes.s=s;
//     System.out.println(s);
//     a=10;
//     System.out.println(notes.a);
//     System.out.println("Test(String)end");
// }
// static{
//     System.out.println("SIB2");
//     test(a);
//     System.out.println(notes.a);
//     System.out.println(s);
// }
// public static void test (int a){
//     System.out.println("Test(String)start");
//     System.out.println(a);
//     a = notes.a +10;
//     System.out.println(a);
//     System.out.println("Test(String)end");
// }

// non static member - a member declared inside global area but not prefix with static keyword.
//non - static variable- a variable declared inside global area and not prefix with static keyword.
// we cannot use non-static variable inside static context directly as well as class name. 
//eg
// int a =10;
// public static void main (String[]args){
//     System.out.println("Hii main");
//     System.out.println(a);
//     System.out.println(notes.a);
//     System.out.println("Bye main");
// }

// object - a block of memory created inside heap area during run time to store all non-static members. 
// how to create an object - new classname();
// new - new is a keyword. it is a uniray operator. it creates a block of memory inside heap area and returns address of an object. Whemever we use new keyword new object will be created. We can create n number of objects for one class. 
// eg    public static void main(String[]args){
// System.out.println("Hii main");
// System.out.println(new notes());
// System.out.println(new notes());     diff address will be stored
// System.out.println(new notes());
// System.out.println("Bye main");
// }
// // How to store address of object -   ClassName variable = new ClassName();
// eg     public static void main (String[]args){
//     System.out.println("Hii main");
//     notes ref = new notes();
//     System.out.println(ref);
//     System.out.println(ref);       same address will be stored
//     System.out.println(ref);
//     System.out.println("Bye main");
// }

// how to use non-static members inside static context-   with the help of object reference variable 
// int a =10;
// public static void main(String[]args){
//     notes ref = new notes();
//     System.out.println(ref.a);
// }

// how to use static members inside static context -  directly, with the help of class name, with the help object refernce variable. 
// static int a = 10;
// public static void main(String[]args){
//     System.out.println(a);
//     System.out.println(notes.a);
//     notes ref = new notes();
//     System.out.println(ref.a);
// }
//every object is pointing towards class static area. 

// String name;
// public static void main(String[]args){
//     notes obj1 = new notes();
//     obj1.name = "Divyanshu";                   Output - Divyanshu,Riddhi,Dhiraj
//     notes obj2 = new notes();
//     obj2.name= "Riddhi";
//     notes obj3 = new notes();
//     obj3.name = "Dhiraj";
//     System.out.println(obj1.name);
//     System.out.println(obj2.name);
//     System.out.println(obj3.name);
// }

// static String name;
// public static void main(String[]args){
//     notes obj1 = new notes();
//     obj1.name = "Divyanshu";                       output- Dhiraj,Dhiraj,Dhiraj`
//     notes obj2 = new notes();
//     obj2.name= "Riddhi";
//     notes obj3 = new notes();
//     obj3.name = "Dhiraj";
//     System.out.println(obj1.name);
//     System.out.println(obj2.name);
//     System.out.println(obj3.name);
// }


// non-static method - a method which is declared inside global area without static keyword. Address of all non-static methods will stored inside objects. non-static context block is also known as object. 

//Every non-static context is pointing towards object. 
//whenever we have local variable and non-static variable with same name if we use directly inside non-static context the high priority is  given to local variable. to use non-satic variable we need "(this).....keyword hai ek" variable. 

//This    -  Its is a keyword. it is a special non-static reference variabele. this variable can be used only inside non-static context. this variable is use to store address of current object. 

// public void test(){
//     System.out.println("Hi test");
//     System.out.println("Bye test");
// }
// public static void main(String[]args){
//     System.out.println("Hii main");
//     notes ref = new notes();
//     ref.test();
//     System.out.println("Bye main");
// }

// public void test(){
//     System.out.println("Hii test");
//     System.out.println("this :"+this);
//     System.out.println("Byee test");
// }
// public static void main(String[]args){
//     notes ref1= new notes();
//     System.out.println("ref1  :"+ref1);
//     notes ref2 = new notes();
//     System.out.println("ref2 :"+ref2);
//     notes ref3 = new notes();
//     System.out.println("ref3 :"+ref3);
//     ref1.test();
// }

//How to use non-static members inside non-static context. 
//directly , with the help of "this" variable.
// int a =10;
// public void test(){
//     System.out.println(a);
//     System.out.println(this.a);
// }
// public static void main(String[]args){
//     notes ref = new notes();
//     ref.test();
// } 

// How to use static members to use in nons-tatic context. 
//directly, with the help classes , with the help of this. 

//write a program to achieve method overloading using non-static method. 
// public void test(){
//     System.out.println("no arguments");
// }
// public void test(int a){
//     System.out.println("Formal arguments" +a);
// }
// int c=5;
// {System.out.println(c);}
// public static void main(String args[]){
//   System.out.println("Main start");
//     notes ref1 = new notes();
//     ref1.test(10);
// }
//non-static block - a block which is declared inside global area and doesnot prefix without static keyword. / Instant initializer block
// why do we need non-static block - to execute some state of statements manditory after object creation. 

// static{
//     System.out.println("Sib started");
//     notes ref = new notes();
//     System.out.println("bye"); 
// }
// {
//     System.out.println("a/c has been created");
// }
// public static void main(String args[]){
//     System.out.println("main start");
//     notes ref1 = new notes();
//     notes ref2 = new notes();
//     test();
// }
// public static void test(){
//     System.out.println("test start");
//     notes ref3 = new notes();
// }





}
