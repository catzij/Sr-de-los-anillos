package bestias;

public class orcos extends bestia {

    private static int contadorInstancias;

    public static int getInstancias(){
        return orcos.contadorInstancias;
    }

    public orcos(String nombre){
        super(300,45,nombre);
        contadorInstancias++;
    }
}
