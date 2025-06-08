package ejercicio1;

public class Main {
    public static void main(String[] args) {
        var motorElectrico = new AdapterMotor(new MotorElectrico());
        motorElectrico.arrancar();
        motorElectrico.acelerar();
        motorElectrico.apagar();
    }
}
