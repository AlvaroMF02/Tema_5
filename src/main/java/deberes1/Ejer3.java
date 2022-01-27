package deberes1;

/**
 *
 * @author Álvaro
 */
public class Ejer3 {
    public static void main(String[] args) {
        double[] arr = new double[20]; 
        
        for (int i = 0; i < arr.length; i++) {  //rellena el array con 7,5
            arr[i]=7.5;
        }
        
        for (double i :arr) {
            System.out.println(i);
        }
        
    }
}
