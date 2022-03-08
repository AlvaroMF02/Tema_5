package recursividad;

/**
 *
 * @author alvaro
 */
public class CuentaAtras {
    
    public static void main(String[] args) {
        cuentAtras(3);
        
    }
    
    public static void cuentAtras(int numero){
        System.out.println(numero);
        if(numero>0){
            cuentAtras(numero-1);
        }
        System.out.println("7w7 " +numero);
    }
}
