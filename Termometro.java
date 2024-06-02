public abstract class Termometro implements Sensor {

    double UltimaTemperaturaLida;

    Termometro(double ultimaTemperaturaLida){
        UltimaTemperaturaLida = ultimaTemperaturaLida;
    }

    public abstract double ler_dado();


}
