import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Matías Centeno Pla
 */
public class ArrayAleatorios {

   
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un numero del 1 al 20");
        
        
       int n = sc.nextInt();
       int contadorMedia = 0;
       int media;
       Random rnd = new Random();
       
       int arr[] = new int[n];
       
       for(int i = 0; i < arr.length; i++){
          int nrandom = rnd.nextInt(-5, 40); 
           arr[i] = nrandom; 
           
       }
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            contadorMedia += arr[i] ;
        }
        media = contadorMedia / arr.length;
        System.out.println("La media de los valores es: "+ media);
       
       
       
        
    }
    
}