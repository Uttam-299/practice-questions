import java.util.*;
public class sortings {
    public static void bublesort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;;
                }
            }
        }
        System.out.println("bubble sort is");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = { 87,93,65,23,9,50,20,30,10,5};
        bublesort(arr);
    }
    
}
