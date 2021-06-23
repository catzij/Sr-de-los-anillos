package bestias;

public class trasgos extends bestia {

    private static int contadorInstancias;

    public static int getInstancias(){
        return trasgos.contadorInstancias;
    }

    public trasgos(String nombre){
        super(325,46,nombre);
    }
    
}
