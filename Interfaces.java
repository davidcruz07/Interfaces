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

    public float suma (float x, float y){

        return x + y;
    }

    public float resta (float x, float y){

        return x - y;
    }

    
    public float multiplicacion (float x, float y){

        return x * y;
    }
    
    public float division (float x, float y){

        return x / y;
    }

}

interface operaciones {

    public float suma ( float x, float y);

    public float resta (float x, float y);

    public float multiplicacion (float x, float y);

    public float division (float x, float y);


}
