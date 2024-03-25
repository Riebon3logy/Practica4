import java.util.*;

/**
 * 
 * La clase aplicacion modela la piramide de fichas de forma grafica y en terminal
 * 
 * @author (Le Gresley Andres)
 * @version (1.0)
 * 
 */

public class Aplicacion
{
    private ArrayList<FichaGrafica> fichas;
    private FichaLogica ficha;
    
    public Aplicacion () {
        ArrayList fichas = new ArrayList<FichaGrafica>();
    }
    
    public void imprimirFichas() {
        for (int i = 12; i >= 0; i--) {
            for (int j = 0; j < 12 - i; j++) {
            System.out.print("           "); // Imprimir espacios para alinear a la derecha
            }
                for (int j = i; j >= 0; j--) {
                FichaLogica ficha = new FichaLogica(i, j);
                System.out.print(ficha.toString() + ""); // Imprimir la representación de la ficha seguida de un espacio
                }
                    System.out.println(); // Cambiar de línea después de imprimir cada fila
        }
    }
    
    public void dibujarDomino(){
    int x=0;
    int y=0;
    int contador = 0;
        for(int i=12; i>=0; i--){
            for(int j=i; j>=0; j--){
                FichaGrafica ficha = new FichaGrafica(i,j, 65, x,y);
                x += 70;
            }
            contador ++;
            x = contador * 2;
            y += 135;
        }
    }    
}