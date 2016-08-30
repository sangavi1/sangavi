import java.util.*;
public class subset{
 
    public static void main(String a[]){
    int flag=0;
        int[] arr1 = {4,7,3,9,2};
        int[] arr2 = {3,2,12,9,40,32,4};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    flag=1;
                    break;
                }
            }
        if(flag==0)
        {
        System.out.println("true");
        }
        else
        {
           System.out.println("true");
          }
    }
}
