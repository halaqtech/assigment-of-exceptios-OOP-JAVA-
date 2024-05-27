/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vuprogram.arrayelementaccessor;
import java.util.Scanner;
public class ArrayElementAccessor {

    public static void main(String[] args) {
     Scanner save=new Scanner(System.in);  
     
      int[] array = {10, 20, 30, 40, 50};
        
        System.out.println("Enter the index you want to access:");
        int index = save.nextInt();
        
        try {
            int element = array[index];
                    System.out.println("elemnts at index   "+index+"  is  "+element);

        }catch (ArrayIndexOutOfBoundsException e){
         System.out.println("Error: Index    "  +index+"    is out of bounds.");  
            
        }

    }
}
