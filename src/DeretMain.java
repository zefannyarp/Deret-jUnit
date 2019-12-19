import java.util.Scanner;

/**
 *
 * @author ZEFANNYA RP
 */
public class DeretMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan jumlah deret: ");
        n = input.nextInt();
        
        Deret deret = new Deret();
        deret.fibonacci(n);
             
    }
    
}
