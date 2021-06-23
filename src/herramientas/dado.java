package herramientas;

public class dado {
    
    public static int tirarDado(int valorMinimo, int valorMaximo, int cantDados, boolean mostrarMensaje){
        int dado = valorMinimo;
        int resultado = valorMinimo;
        for (int i = 1; i <= cantDados; i++) {
            dado =(int) Math.floor(Math.random()*(valorMaximo-valorMinimo+1)+valorMinimo);
            if (mostrarMensaje)
                System.out.println("Se lanzó el "+i+" dado y su resultado fue: "+ dado);
            if (resultado < dado)
                resultado = dado;
        }
        if (cantDados > 1)
            if (mostrarMensaje)
                System.out.println("El resultado mayor de los "+cantDados + " lanzados es: "+resultado);
        return resultado;
    }
    
}
