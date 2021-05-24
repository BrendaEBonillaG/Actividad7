
import static java.lang.Math.*;
import java.util.Scanner;

public class Numeros {

    private static int getPrimo;

    public int getPrimo(){
      int i=0, j=0, div=0, raiz=0, n=0;
        for (i=1; i<n; i++) { //Ciclo para correr los números.
            div= 0;
            raiz=(int) sqrt(i);
        }

        for (j=1; j<=raiz; j++)
        if (1%j==0){
            div++;
        }
        if (div<=1){
            System.out.println (i + " es numero primo" ); //Salida de datos.
            return div;
        }
    }

}
//Fin de métodopara calcular números primos.

//Métodos con características de entrada de números.
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    public int getTamaño(){
    return tamaño;
}
public void setTamaño(int tamaño){
    this.tamaño = tamaño;
}
//Método para sucesión de Fibonacci.
    public int getFibonacci (int fibo) {
        if (fibo > 1) {
            return fibonacci(fibo - 1) + fibonacci(fibo - 2); //Es la función recursiva.
        } else if (fibo == 1) { //Es un caso base.
            return 1;
        } else if (fibo == 0) { //Es un caso base.
            return 0;

        } else { //Si hay un error en la entrada de datos.
            System.out.println("Debes ingresar un número mayor o igual a 1");
            return -1;
        }
    }
    public int tamaño;
    public String nombre;

    public int Fibonacci() {

        public int getFibonacci (String nombre,int tamaño){
            this.nombre = nombre;
            this.tamaño = tamaño;
        }

        public void mostrarSerie (){
            System.out.println(this.nombre + "de tamaño" + this.tamaño + ":");
            for (int i = 0; i < tamaño; i++) {
                System.out.print(fibonacci(i) + " ");
            }
            System.out.println();
        }
        Fibonacci f1 = new Fibonacci("fibonacci 1", fibo);
        f1.mostrarSerie();

    }

//Cuerpo del programa.
public static void main (String[] args) {
       int num =0;
       int fibo = 0;
    Scanner n = new Scanner(System.in);
    Scanner N = new Scanner(System.in);
        System.out.println("agrega un número:");
    num = n.nextInt();
    fibo = N.nextInt();

    int[] numeros new int[num];
    for (int i=0;i<num;i++){
        num++;
        n = num.nextInt().charAt(0);
    }
    int[] sucesion new int[fibo];
    for (int i=0;i<fibo;i++){
        fibo++;
        n = fibo.nextInt().charAt(0);
    }

        System.out.println("Números primos:");
        System.out.println(Numeros.getPrimo, n(i));


    System.out.println("Sucesión de Fibonacci:");
    System.out.println(Fibonacci.getFibonacci, N(i));
}
