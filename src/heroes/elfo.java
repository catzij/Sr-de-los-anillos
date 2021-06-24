package heroes;

import herramientas.*;



import bestias.*;

public class elfo extends heroe{

    private static int instanciaElfo;

    public elfo(String nombre){
        super(250, 60, nombre);
        instanciaElfo++;
    }

    @Override
    public void saludar(){
        System.out.println("Hola soy un elfo y me llamo   " + this.nombre);
    }

    @Override
    public int setAtaque(personaje defensor){
        if (defensor instanceof orcos){
            System.out.println(" "+ this.getNombre() + " furia elfica ");
            return this.getAtaque() + 10;

        }
        
        return this.getAtaque();
    }

    public static int getInstancias(){
        return instanciaElfo;
    }
    
}
