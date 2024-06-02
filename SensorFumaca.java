public abstract class SensorFumaca implements Sensor {

    int Contador;

    SensorFumaca(int contador){

        Contador = contador;

    }
    public abstract double ler_dado();

}
