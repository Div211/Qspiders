public class constructor {

    // constructor - it is a special non-static member becuase constructor name is
    // as same as class name and constructor is similar to method but it does not
    // have return type. Every class will have at least one constructor. If
    // programmer has not return any constructor then by default compiler will add
    // no argument constructor during compile time is known as default constructor.
    // Every constructor consists of -- PLI Pre loading instruction, IIB instant
    // initializer block, UWS User written statements.

    // {
    // System.out.println("IIB");
    // }
    // public constructor(){
    // System.out.println("I am constructor.....");
    // }
    // public static void main(String args[]){
    // System.out.println("Main start");
    // constructor ref1 = new constructor();
    // System.out.println("Main end");
    // }

    // int a ;
    // int b ;
    // int c ;
    // public static void main(String args[]){
    // System.out.println("Main start");
    // System.out.println("Main end");
    // constructor ref1 = new constructor();
    // ref1.a = 1;
    // ref1.b=1;
    // ref1.c=1;
    // System.out.println(ref1.a+ " " + ref1.b + " " + ref1.c);
    // // System.out.println(ref1.b);
    // // System.out.println(ref1.c);

    // constructor ref2 = new constructor();
    // ref2.a=2;
    // ref2.b=2;
    // ref2.c=2;
    // System.out.println(ref2.a);
    // System.out.println(ref2.b);
    // System.out.println(ref2.c);

    // constructor ref3 = new constructor();
    // ref3.a=3;
    // ref3.b=3;
    // ref3.c=3;
    // System.out.println(ref3.a);
    // System.out.println(ref3.b);
    // System.out.println(ref3.c);

    // Types of constructor-
    // No argument - A constructor which does not have formal arguments
    // parameterized - A constructor which has formal arguments
    // Why do we need parameterized constructor- To initialize non-static varaiable
    // during object creation
    // eg -
    // int a;
    // int b;
    // int c;

    // public constructor(int a, int b, int c){
    // this.a=a;
    // this.b=b;
    // this.c=c;
    // }
    // public static void main(String args[]){
    // constructor ref1 = new constructor(1, 1, 1);
    // System.out.println(ref1.a+" "+ref1.b+" "+ref1.c);
    // constructor ref2 = new constructor(2, 2, 2);
    // System.out.println(ref2.a+" "+ref2.b+" "+ref2.c);
    // constructor ref3 = new constructor(3, 3, 3);
    // System.out.println(ref3.a+" "+ref3.b+" "+ref3.c);

    // }

    // int rollno;
    // String name;
    // double percentage;

    // public static void display(constructor s) {
    //     System.out.println(s.rollno + " " + s.name + " " + s.percentage);
    // }

    // public constructor(int rollno, String name, double percentage) {
    //     this.rollno = rollno;
    //     this.name = name;
    //     this.percentage = percentage;
    // }

    // public static void main(String args[]) {
    //     constructor ref1 = new constructor(21, "Divyanshu", 87);
    //     constructor ref2 = new constructor(12, "Vineet", 78);
    //     constructor ref3 = new constructor(51, "Durgesh", 98);
    //     constructor ref4 = new constructor(50, "Nitish", 32.56);
    //     display(ref1);
    //     display(ref2);
    //     display(ref3);
    //     display(ref4);

    // }

    //constructor overloading--  A class having multiple constructor with same name but differnt formal arguments either diifer in length or in data type. 

    // public constructor(){
    //     System.out.println("no arguments");
    // }
    // public constructor(int a){
    //     System.out.println("1 formal argument with int");
    // }
    // public constructor(int a, int b){
    //     System.out.println("2 formal argument");
    // }
    // public constructor(String s){
    //     System.out.println("1 formal argument with string");
    // }
    // public static void main(String args[]){
    //     constructor ref1 = new constructor();
    //     constructor ref2 = new constructor(12);
    //     constructor ref3 = new constructor(12,4);
    //     constructor ref4 = new constructor("Divyanshu");
    // }

    //create employee class consist of 3 data such as employee id, name and salary. 
    //create no argument constructor , create 1 formal argument constructor to initialize employee id, create 1 formal argument constructor to initialize name, create 1 formal argument constructor to initialize salary, create 2  formal argument constructor to initialize employee id and name, create 2 formal argument constructor to initialize employee id and salary, create 2 formal argument constructor to initialize name and salary, create 3 formal argument constructor to initialize id name salary, achieve constructor overloading, create non-static method to display atleast 5 employee details, create object in main method.

    int employeeid;
    String name;
    double salary;

    public constructor(){
        System.out.println("Employee details");
    }
    public constructor(int a){
        System.out.println("Employee id");
    }
    public constructor(String s){
        System.out.println("Employee name");
    }
    public constructor(double sal){
        System.out.println("Employee salary");
    }
    public constructor(int a, String s){
        System.out.println("Employee id and employee name");
    }
    public constructor(int a, double sal){
        System.out.println("Employee id and salary");
    }
    public constructor(String s, double sal){
        System.out.println("Employee name and salary");
    }
    public constructor(int employeeid, String name, double salary){
        this.employeeid = employeeid;
        this.name = name;
        this.salary = salary;
    }
    public static void display(constructor b){
        System.out.println(b.employeeid+" "+b.name+" "+b.salary);
    }
    public static void main (String args[]){
        constructor ref1 = new constructor();
        constructor ref2 = new constructor(12);
        constructor ref3 = new constructor("Div");
        constructor ref4 = new constructor(48000.98);
        constructor ref5 = new constructor(12,"Div");
        constructor ref6 = new constructor("Div",48000.98);
        constructor ref7 = new constructor(12,48000.98);
        constructor ref8 = new constructor(11,"Vineet", 560976);
        constructor ref9 = new constructor(12,"Divyanshu", 700967);
        constructor ref10 = new constructor(13,"Durgesh", 600767);
        constructor ref11= new constructor(14,"Nitish", 699767);
        constructor ref12 = new constructor(15,"Yash",458908);
        display(ref8);
        display(ref9);
        display(ref10);
        display(ref11);
        display(ref12);
    }
    




}