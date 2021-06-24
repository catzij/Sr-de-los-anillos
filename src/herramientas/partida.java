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
            asterisco(40);
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

        asterisco(50);
        System.out.println("Bienvenido al juego del señor de los anillos: ");
        asterisco(50);
        
        this.inicializarHeroes();
        this.inicializarBestias();
        
        this.presentarPersonajes(ejercitoBestias);
        
        this.presentarPersonajes(ejercitoHeroes);
        
        asterisco(50);
        this.pelea();
        asterisco(50);
    }

    public void pelea(){
        
        for (int j = 0; j < ejercitoBestias.length; j++) {
            do{            
                ejercitoBestias[j].recibirAtaque(ejercitoHeroes[j]);
                ejercitoHeroes[j].recibirAtaque(ejercitoBestias[j]);                           

            }while(ejercitoBestias[j].vida>0 && ejercitoHeroes[j].vida>0);
            ganaPunto(j);
        }
        
        
    }

    public void ganaPunto(int i){        
        int vidaBestia=0;
        int vidaHeroe=0;
    
            vidaBestia = ejercitoBestias[i].vida;                
        
            vidaHeroe = ejercitoHeroes[i].vida;
        
        if (vidaBestia<=0) {             
            asterisco(40);
            System.out.println("el equipo Bestia perdio esta ronda");
            System.out.println("el equipo HEROE GANO esta ronda");
            asterisco(40);
        }
        if (vidaHeroe<=0) {
            asterisco(40);            
            System.out.println("el equipo Heroe perdio esta ronda");            
            System.out.println("el equipo BESTIA GANO esta ronda");
            asterisco(40);
        }        
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
            }
        }
    }

    public void asterisco(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
}
