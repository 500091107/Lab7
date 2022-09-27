package pkg1;

import java.net.SocketTimeoutException;

public class MyClass {
    int a, b;

   public void mul ( int x , int y )
   {
       a = x ;
       b - y ;
        int c = a * b ;
       System.out.println ( " Multiplication is : " + c ) ;
   }

    public static void sum(int x, int y) {
        a = x;
        b = y;
        int c = a * b;
        System.out.println("sum is" + c);
    }

   public static void main ( String [ ] args ) {
       MyClass ob = new MyClass ( ); I
       ob.mul ( 5 , 10 );
   }
}