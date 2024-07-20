//Abstraction - The process of displaying the things which are required and hiding the things which are not required. 
//Concrete Method - A method which has body logic or implementation. 
//Concrete class - A class which all concrete method. 
//Abstract class - 
//How to create abstract method - Method must be prefix with abstract keyword. Method must ends with semicolon. The method doesnot have body logic or implementation. 
//If any class is having atleast one abstract method than the class must be an abstract. If any class inheritate abstract method than the inherited clss also must be an abstract. If we dont want to make the inherited class as abstract class we have to override the abstract method. We cannot create static method as abstract method as beacuse we cannot override static method. We cannot create obj for abstract class. 

// public class abs{
//     public static void main(String args[]){
//         A ref1 = new B1();
//         ref1.test();
//         A ref2 = new B2();
//         ref2.test();
//     }
// }
// abstract class A {
//     abstract public void test();
// }
// class B1 extends A{
//     public void test(){
//         int a =10 , b=20;
//         System.out.println(a+b);
//     }
// }
// class B2 extends A{
//     public void test(){
//         int a=100, b=200;
//     }
// }

//What are the members we can create in concrete class
//Variables - local,global (static, non-static)
//Method - concrete(static,non-static)
//blocks - SIB, IIB

//What are the members we can create in abstract class
//Variables - local,global 
//Method - concrete(static,non-static) , abstract(non-static)
//Blocks - SIB, IIB


