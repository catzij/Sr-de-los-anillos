package heroes;

import herramientas.*;
import bestias.*;

public class elfo extends heroe{

    public elfo(String nombre){
        super(250, 60, nombre);
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
    
}
