package ejercicio4;

public class Main {
    public static void main(String[] args){

        // Primer pedido
        var comboBasico = new ComboBasico(100, "pizza");
        var conTomate = new ConTomate(comboBasico);
        var conPapasYTomate = new ConPapas(conTomate);

        System.out.println(conPapasYTomate.calcularCosto());

        // Segundo pedido

        var comboFamiliar = new ComboFamiliar(200, "2 pizzas + gaseosa");
        var conQueso = new ConQueso(comboFamiliar);
        var conCarneYQueso = new ConCarne(conQueso);

        System.out.println(conCarneYQueso.calcularCosto());

        // usando el patron builder

        var combo = new ComboBuilder(300, "combo especial");
        var comboArmado = combo.agregarTomate().agregarCarne().agregarPapas().build();
        System.out.println(comboArmado.calcularCosto());
    }
}
