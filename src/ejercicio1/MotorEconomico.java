package ejercicio1;

public class MotorEconomico implements Motor{
    @Override
    public void arrancar() {
        System.out.println("arrancar motor economico");
    }

    @Override
    public void acelerar() {
        System.out.println("acelerar motor economico");
    }

    @Override
    public void apagar() {
        System.out.println("apagar motor economico");
    }
}
