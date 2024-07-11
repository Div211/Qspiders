// import java.util.*;
public class first{
    public static void main(String[]args){
        // q1 write a program to separate digits from the given number.
        // int n = 385;
        // while(n!=0){
        //     int d = n%10;
        //     System.out.println(d);
        //     n=n/10;
        // }

        // q2 write a program to print even digits from the given number
            // int n = 435628;
            // while(n!=0){
            //     int d = n%10;
            //     if (d%2==0) {
            //         System.out.println(d);
            //     }
            //     n=n/10;
            // }
            // q3 find the max number for the integer
                // int n = 32387634;
                // int max=0;
                // while(n!=0){
                //     int d = n%10;
                //     if(d>max){
                //         max=d;
                //     }
                //     n=n/10;
                // }
                // System.out.println(max);

            // q4 write a program to print sum of all digits from the given no.

            // int n = 32387634;
            // int num = 0;
            // while(n!=0){
            //     int d = n%10;
            //     d= d+num;
            //     num=d;
            //     n=n/10;
            // }
            // System.out.println(num);

            // q4 write a program to check the given no. is special no. or not
                // special no. mean for ef n = 19 then 1 +9 = 10, 1*9=9, 10+9=19 which is special as n 

                // int n =19;
                // int temp =n;
                // int num = 0;
                // int pro = 1;
                // while (n!=0){
                //     int d = n%10;
                //     num = num+d;
                //     pro = pro*d;
                //     n=n/10;
                // }
                // int total = num+pro;
                // if(total==temp){
                //     System.out.println("Is a special number:");
                // }else{
                //     System.out.println("Not a special number");
                // }

                // q5 write a program to print first 10 no. from fibonacci series.

                    // int a = 0, b = 1;
                    // System.out.print(a+" " +b+" ");
                    // for (int i = 1; i<=8; i++) {
                    //     int c = a+b;
                    //     System.out.print(c+" ");
                    //     a = b;
                    //     b = c;
                    // }

                // q6 write a program to check the given number is niven number or not
                // int n = 18;
                // int num = 0;
                // int temp = n;
                //         while(n!=0){
                //             int d = n%10;
                //             num = num + d;
                //             n=n/10;
                           
                //         }
                        
                //             if(temp%num==0){
                //                 System.out.println("The no is niven");
                //             }else{
                //                 System.out.println("Not niven");
                //             }

                // q7 write a program to add repeatedly all its digit until the digit becomes to single digit

                // int n = 38;
                // int num = 0;
                // while(n!=0){
                //    int d = n%10;
                //     num = num+d;
                //     n  = n/10;
                // }
                // if(num<10){
                //     System.out.println(num);
                // }
                // else{
                //     int s =0;
                //     while(num!=0){
                //         int d = num%10;
                //         s = s+d;
                //         num = num/10;
                //     }
                //     System.out.println(s);
                // }

                // q8 write a program to print factorial of all digits of given number

                // int n = 236;
                // while(n!=0){
                //     int d = n%10;
                //     int prod =1;
                //     for(int i = 1; i<=d; i++){
                //         prod = prod*i;
                //     }
                //      System.out.println(d+"! "+prod);   
                //     n = n/10;
                // }

                // q9 write a program to check the given no. is strong no. or not

                // int n = 145;
                // int sum = 0;
                // int temp=n;
                // while(n!=0){
                //     int d = n%10;
                //     int prod = 1;
                //     for(int i =1; i<=d;i++){
                //         prod = prod*i;
                //     }
                //     System.out.println(d+"! "+prod);
                //     sum = sum+prod;
                //     n=n/10;
                // }
                // if(temp==sum){
                //     System.out.println("storng number");
                // }else{
                //     System.out.println("not storng");
                // }

                // q10 break the number and add only the prime no.

                // int n = 578;
                // int sum = 0;
                // while (n!=0){
                //    int d = n%10;
                //    int count  = 0;
                //    for(int i = 2; i <=d/2; i++){
                //     if(d%i==0){
                //         count++;
                //     }
                //    }
                //    if(count==0){
                //     sum = sum+d;
                //    }
                //    n = n/10;

                // }
                // System.out.println(sum);
            
            

                    

    }
}