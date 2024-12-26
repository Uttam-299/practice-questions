import java.util.*;
public class table_multi {
    public static void table(int n){
        System.out.println("To print a table ");
        for (int i=1 ; i<=10 ; i++){
            int result = n * i ;
            System.out.println( n + " * "+ i+ " = " + result );
        }

    }
    public static void main (String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      table(n);

    }
    
}
