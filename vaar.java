public class vaar {
    int a =10;
    // public static void main (String args[]){
    //     System.out.println("Main Start");
    //     vaar obj = new vaar();
    //     System.out.println(obj.a);
    //     test();
    //     demo();                                              //   to print non-static variable in static method
    //     System.out.println("Main end");
    // }
    // public static void test(){
    //     vaar obj = new vaar();
    //     System.out.println(obj.a); 
    // }
    // public static void demo(){
    //     vaar obj1 = new vaar();
    //     System.out.println(obj1.a);
    // }


    // public static void main(String args[]){
    //     System.out.println("Main Start");
    //     vaar obj = new vaar();
    //     System.out.println(obj);
    //     test(obj); 
    //     demo(obj);                                             // to print same address 
    //     System.out.println("Main End");
    // }
    // public static void test(vaar obj){
    //     System.out.println(obj);
    // }
    // public static void demo(vaar obj){
    //     System.out.println(obj);
    // }


    // static vaar obj = new vaar();    

    // public static void main (String args[]){
    //     System.out.println("Main Start");
    //     System.out.println(obj);                          // to print same address same as above but with diff method by creating obj globally.
    //     test();
    //     demo();
    //     System.out.println("Main End");
    // }
    // public static void test(){
    //     System.out.println(obj);
    // }
    // public static void demo(){
    //     System.out.println(obj);
    // }

    //can we create object in global area.   yes as we done above. 
    //can we create multiple classes in one java file.      Yes 
    //can we create object class in another class. yes
    //what is driver class.   A class which has main method is knowm as driver class. 
    public static void main(String args[]){
        System.out.println("India Jai ho");
        Vasai.test();
        // second way to call class
        Delhi ref1 = new Delhi();
        ref1.demo();
        System.out.println("Jai ho");
    }
}
    class Vasai{
        public static void test(){
            System.out.println("Vasai start");
        }
    }
    class Delhi{
        public void demo(){
            System.out.println("Delhi start");
        }
    }

