package org.vmtz.metodos;

public class Argumentos01 {
    public static void Dispositivo(String tipo, String RAMinstalada, String TipoDeSistema, String Procesador, int RendimientoBateria){
        System.out.println(
                "Tu dispositivo es de" + tipo
                        + ", tiene una capacidad de" + RAMinstalada
                        + " de RAM, su tipo de sitema es" + TipoDeSistema
                        + " Con un procesador" + Procesador
                        + " y su rendimiento de bateria es del " + RendimientoBateria
        );

    }
    public void registraTuDispositivo(){
        Dispositivo("Laptop", " 4.00GB"," Sistema operativo de 64 bits, procesador x64"," Intel(R) Core(TM) i3-10110U CPU @ 2.10GHz   2.59 GHz", Integer.parseInt("87"));
    }
}
