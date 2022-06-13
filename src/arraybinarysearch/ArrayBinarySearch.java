
package arraybinarysearch;

import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Ayoob Bugti
 */
public class ArrayBinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int array[]={1,3,4,5,17,19,20,35,42,62,87,109};
        
        int first = 0;
        int last = array.length-1;
        
        int mid=(first+last)/2;
         String number = JOptionPane.showInputDialog(null,"Enter a number to search in array",JOptionPane.QUESTION_MESSAGE);
       
       int value = Integer.parseInt(number);
       
        int i =1;
        while(first<=last){
            
            if(value == array[mid])
            {
                JOptionPane.showMessageDialog(null,"NUMBER "+number+" IS FOUND AT POSITION "+mid);
                break;
            }
            else if(value < array[mid])
            {
                last = mid -1;
            }else if(value > array[mid]){
                first = mid+1;
            }
            
            mid=(first+last)/2;
            i++;
        }
        if(first>last){
        JOptionPane.showMessageDialog(null,"YOUR ENTERED NUMBER DOES NOT EXIST IN GIVEN ARRAY!");
        }
    }
    
}
