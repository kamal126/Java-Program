/**
 * Prime Number Program in Java
 */
public class Prime {
    public static void main(String[] args) {
        int i,m=0,flag=0;
        int n=4;//it is the number to checked
        m = n/2;
        if (n==0||n==1) {
            System.out.println(n+"is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n%i==0) {
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0){System.out.println(n+" is prime number");}
        }//end of else
    }
}

/**
 * Prime Number Program using Method in Java
 */
class InnerPrime {
    
    static void checkPrime(int n){
        int i,m=0,flag=0;
        m=n/2;
        if (n==0||n==1) {
            System.out.println(n+" is not prime number");
        } else {
            for(i=2;i<=m;i++){
                if(n%i==0){
                    flag=1;
                    break;
                }
            }
            if (flag==0) {
                System.out.println(n+" is prime number");
            }
        }//end of else
    }
    public static void main(String[] args) {
        for (int i = 0; i <=10; i++) {
            checkPrime(i);
        }
    }
}