import java.util.*;
public class practicejava{
    public static void main(String args[]){
    System.out.println("plaindrom of a number" );
    Scanner sc = new Scanner(System.in);
    int plaindrom = sc.nextInt();
    int number=plaindrom;
    int rev=0;
    while(plaindrom !=0){
        int lastdigit = plaindrom%10;
        rev = (rev*10) + lastdigit ;
        plaindrom/=10;

    }
    
    if(number == rev){
        System.out.println("the number <" +number + "> is a palindrom");
    } 
    else {
        System.out.println("the number <" +number + "> is not a palindrom");
    }

    }
}