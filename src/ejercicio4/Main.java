package ejercicio4;

public class Main {
    public static void main(String[] args) {

        // Primer pedido
        var comboBasico = new ComboBasico(100, "pizza");
        var conTomate = new ConTomate(comboBasico);
        var conPapasYTomate = new ConPapas(conTomate);

        System.out.println(conPapasYTomate.obtenerDescripcion());
        System.out.println("total:" + conPapasYTomate.calcularCosto());
        System.out.println("----------------------------------------");

        // Segundo pedido

        var comboFamiliar = new ComboFamiliar(200, "2 pizzas + gaseosa");
        var conQueso = new ConQueso(comboFamiliar);
        var conCarneYQueso = new ConCarne(conQueso);

        System.out.println(conCarneYQueso.obtenerDescripcion());
        System.out.println("total:" + conCarneYQueso.calcularCosto());
        System.out.println("----------------------------------------");


        // usando el patron builder

        var combo = new ComboBuilder(new ComboBasico(200, "basico")); // como armo un combo de los 3 que tengo?
        var comboArmado = combo.agregarTomate().agregarCarne().agregarPapas().build();
        System.out.println(comboArmado.obtenerDescripcion());
        System.out.println("total:" + comboArmado.calcularCosto());
        System.out.println("-------------------------------------");

    }
}
