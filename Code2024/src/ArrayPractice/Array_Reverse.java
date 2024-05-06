
package ArrayPractice;

import java.util.Arrays;


public class Array_Reverse {
    public static void main(String[] args) {
       
        int[] numberList = {1, 2, 3, 4, 5, 6};
        
        System.out.println(Arrays.toString(numberList));
        
        System.out.println("\nReverse \n");
        
        reverseArr(numberList); 
        
        
        for (int i = 0; i < numberList.length; i++) {
            System.out.print(numberList[i]);
            if (i < numberList.length - 1) {
                System.out.print(", ");
            }
            
        } 
        System.out.println("");
    }
      
    public static void reverseArr(int[] arr) {
        int arrLen = arr.length;
        for (int i = 0; i < arrLen / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arrLen - 1 - i];
            arr[arrLen - 1 - i] = temp;
        }
    }
    }
  
    
    
    
    
