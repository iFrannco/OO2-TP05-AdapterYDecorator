package ejercicio1;

public class MotorComun implements Motor{
    @Override
    public void arrancar() {
        System.out.println("arrancar motor comun");
    }

    @Override
    public void acelerar() {
        System.out.println("acelerar motor comun");
    }

    @Override
    public void apagar() {
        System.out.println("apagar motor comun");
    }
}
