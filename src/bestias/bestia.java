package bestias;

import herramientas.*;

public class bestia extends personaje {

    private static int ataqueMaximo = 90;

    public bestia(int vida, int armadura, String nombre){
        super(vida, armadura, bestia.ataqueMaximo ,nombre,false);
    }

    @Override
    public int getAtaque(){
        return dado.tirarDado(0, bestia.ataqueMaximo , 1, true);
    }    
}
