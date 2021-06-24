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

    @Override
    public void saludar(){
        System.out.println("Hola soy un Humano y me llamo   " + this.nombre);
    }
    
}
