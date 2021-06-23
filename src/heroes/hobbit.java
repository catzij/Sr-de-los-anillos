package heroes;

public class hobbit extends heroe{

    private static int contadorInstancias;

    public static int getInstancias(){
        return hobbit.contadorInstancias;
    }

    /** constructor */
    public hobbit(String nombre){
        super(200, 40, nombre);
        hobbit.contadorInstancias++;
    }

    @Override
    public void saludar(){
        System.out.println("Hola soy un Hobbit y me llamo   " + this.nombre);
    }
    
}
