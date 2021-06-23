package herramientas;

import heroes.*;
import bestias.*;

public class partida {

    private bestia ejercitoBestias[];
    private heroe ejercitoHeroes[];

    private final int CANTIDAD = 5;

    //private int contadorHumanos;
    
    public partida(){
        ejercitoBestias = new bestia[CANTIDAD];
        ejercitoHeroes = new heroe[CANTIDAD];
    }

    public void presentarPersonajes(personaje ejercito[]){

        if (ejercito.length> 0 ){
            String tempo = "";
            if (ejercito[0] instanceof bestia){
                tempo = "Bestia";
            }
            else{
                tempo = "Heroe";
            }

            System.out.println("\nPresentando ejercito de "+tempo);
            //ejemplo con operador ternario
            /**System.out.println("\nPresentando ejercito de "+
                            (ejercito[0] instanceof Bestias?"Bestias":"Herores")
                            );**/

            for (int i = 0; i < ejercito.length; i++) {
                ejercito[i].saludar();
            }

        }
        else {
            System.out.println("No hay un ejercito ");
        }
    }

    public void jugar(){
        System.out.println("Bienvenido al juego del señor de los anillos: \n\n");
        
        this.inicializarHeroes();
        this.inicializarBestias();

        this.presentarPersonajes(ejercitoBestias);
        this.presentarPersonajes(ejercitoHeroes);

        System.out.println("\n\n\n");
        this.pelea();
        
    }

    public void pelea(){
        ejercitoBestias[0].recibirAtaque(ejercitoHeroes[0]);
        ejercitoHeroes[0].recibirAtaque(ejercitoBestias[0]);
    }

    public void inicializarHeroes(){
        int random = 0;
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = dado.tirarDado(0, 2, 1, false);
            switch (random) {
                case 0:
                    ejercitoHeroes[i] = new humano("Humano "+humano.getInstancias());
                    break;
                case 1:
                    ejercitoHeroes[i] = new elfo("Elfo "+elfo.getInstancias());
                    break;
                case 2:
                    ejercitoHeroes[i] = new hobbit("Hobbit "+hobbit.getInstancias());
                    break;
                default:
                    ejercitoHeroes[i] = new elfo("Elfo "+elfo.getInstancias());
                    break;
            }
        }
    }

    public void inicializarBestias(){
        int random = 0;
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = dado.tirarDado(0, 1, 1, false);
            switch (random) {
                case 0:
                    ejercitoBestias[i] = new trasgos("Trasgo "+trasgos.getInstancias());
                    break;
                case 1:
                    ejercitoBestias[i] = new orcos("Orco "+orcos.getInstancias());
                    break;
                default:
                    ejercitoBestias[i] = new orcos("Orco "+orcos.getInstancias());
                    break;
            }
        }
    }
    
}
