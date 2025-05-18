package ejercicio1;

public class AdapterMotor implements Motor{
    private MotorElectrico motorElectrico;

    @Override
    public void arrancar() {
        System.out.println("arrancar motor electrico desde adapter");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("acelerar motor electrico desde adapter");
        this.motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("apagar motor electrico desde adapter");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }
}
