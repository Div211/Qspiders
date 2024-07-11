public class sbi {
    // object oriented programming laguage---  It is a design model or paradigm which helps the programmer to correlate real world scenarios into programming world scenario in the form of object. 
    // object oriented programming principles-- 1.Encapsulation , 2.Inheritance, 3.Polymorphism, 4.Abstraction
    //if any language follows object oriented programming principles then the language is known as object oriented programming language. 
    
    
    //Encapsulation ****
    //The process of binding states and behavior of an object together. 
    public static void main(String args[]){
        oops ref = new oops();
        System.out.println(ref.getPaisa());
        ref.setpaisa(78756.45);
        ref.withdraw();
        System.out.println(ref.getPaisa());
    }
}
    // class oops {
    
    //     double paisa = 98753.38;
    //     public static void deposit(){
    //         System.out.println("Deposited.....");
    //     }
        // public void withdraw(){
        //     System.out.println("Withdraw.....");
        // }
    // }

    //Why do we need encapsulation -- To achieve data hiding
    //Data Hiding -- The procees of avoiding direct access but providing controlled access. 
    //To avoid direct access we use private access specifier. Private is keyword. To give controlled access we use getter and setter method.
    //Getter method is use to get private data and setter method is used to set or modify the private data. 
      
    class oops{
        private double paisa = 98756.45;
        public double getPaisa(){
            return paisa;
        }
        public void withdraw(){
            System.out.println("Withdraw 20000.....");
        }
        public void setpaisa(double paisa){
            this.paisa = paisa;
        }
    }
