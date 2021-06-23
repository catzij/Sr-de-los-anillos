package heroes;
import herramientas.*;

public class heroe extends personaje {

    private static int ataqueMaximo = 100;

    private static int instanciasHeroes;

    public heroe(int vida, int armadura, String nombre){
        super(vida, armadura, ataqueMaximo, nombre,true);
        heroe.instanciasHeroes++;
    }

    public static int getInstancias(){
        return heroe.instanciasHeroes;
    }

    @Override
    public int getAtaque(){
        return dado.tirarDado(0, heroe.ataqueMaximo, 2, true);
    }
    
}
