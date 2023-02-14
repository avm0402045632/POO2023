import org.vmtz.metodos.Argumentos01;
import org.vmtz.metodos.Clase01;
import org.vmtz.metodos.Clase02;

public class Main {
    public static void main(String[] args) {
        //traerMetododeClase02();
       /*
        Clase01 clase01 = new Clase01();
        clase01.saludar();

        for (int i = 1; i < 100; i++){
            clase01.saludar();

        }
        */

    }

    public static void traerMetododeClase02(){
        Clase02 clase02 = new Clase02();
        clase02.ejecutar();

    }
    public static void traerMetodoArgumentos01(){
        Argumentos01 argumentos01 = new Argumentos01();
        argumentos01.registraTuDispositivo();

    }
}