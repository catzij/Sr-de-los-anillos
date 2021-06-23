package heroes;

public class humano extends heroe {

    private static int contadorInstancias;

    public humano(String nombre){
        super(180,75,nombre);
        humano.contadorInstancias++;
    }

    public static int getInstancias(){
        return contadorInstancias;
    }
    
}
