public class ControleArCondicionadoAgratto extends ControleArCondicionado{

    ControleArCondicionadoAgratto(double temperaturaMinimaAlvo, double temperaturaMaximaAlvo, int potenciaMaximaMotor, int potenciaAtualMotor) {
        super(temperaturaMinimaAlvo, temperaturaMaximaAlvo, potenciaMaximaMotor, potenciaAtualMotor);
    }

    @Override
    public void aplicar(double tempAtual) {
        if (tempAtual < TemperaturaMinimaAlvo) {
            if (PotenciaAtualMotor < PotenciaMaximaMotor) {
                PotenciaAtualMotor++;
            }
        } else if (tempAtual > TemperaturaMaximaAlvo) {
            if (PotenciaAtualMotor > 0) {
                PotenciaAtualMotor--;
            }
        }
    }
}
