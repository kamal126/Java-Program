// Fibonacci Series in Java without using recursion 
public class Fibonacci_Series {
    public static void main(String[] args) {
        int n1=0,n2=1,n3,count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1
        
        for(int i=2;i<count;i++)//loop start from 2 b/c 0 and 1 are already printed
        {
            n3 = n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}

/**
 * Fibonacci Series using recursion in java
 */
class InnerFibonacci_Series {
    static int n1=0,n2=1,n3=0;
    static void printFibonacci(int count){
        if (count>0) {
            n3 = n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            printFibonacci(count-1);
        }
    }
    public static void main(String[] args) {
        System.out.print(n1+" "+n2);
        printFibonacci(10-2);
    }
}
