    /*
     * 
     * Hecho por: Cruz Méndez José David
     * 
     */

public class Interfaces implements operaciones {

    public static void main (String[] args){

        System.out.println("La suma de " +  " es: " + new Interfaces().suma(new Interfaces().resta(5,10),3 ));

        System.out.println("La resta es: " + new Interfaces().resta(new Interfaces().multiplicacion(7, 9),9 ));

        System.out.println("La multiplicacion es: " + new Interfaces().multiplicacion(7, new Interfaces().division(10, 5) ));

        System.out.println("La division es: " + new Interfaces().division(-8, new Interfaces().resta(9, 5)));

    }

    public int suma (int x, int y){

        return x + y;
    }

    public int resta (int x, int y){

        return x - y;
    }

    
    public int multiplicacion (int x, int y){

        return x * y;
    }
    
    public int division (int x, int y){

        return x / y;
    }

}

interface operaciones {

    public int suma ( int x, int y);

    public int resta (int x, int y);

    public int multiplicacion (int x, int y);

    public int division (int x, int y);


}