public abstract class ControleArCondicionado implements Atuador {

    double TemperaturaMinimaAlvo;
    double TemperaturaMaximaAlvo;
    int PotenciaMaximaMotor;
    int PotenciaAtualMotor;

    ControleArCondicionado(double temperaturaMinimaAlvo, double temperaturaMaximaAlvo, int potenciaMaximaMotor, int potenciaAtualMotor) {
        TemperaturaMaximaAlvo = temperaturaMaximaAlvo;
        TemperaturaMinimaAlvo = temperaturaMinimaAlvo;
        PotenciaMaximaMotor = potenciaMaximaMotor;
        PotenciaAtualMotor = potenciaAtualMotor;
    }

    public abstract void aplicar(double valor);
}
