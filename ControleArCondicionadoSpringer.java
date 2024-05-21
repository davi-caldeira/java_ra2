public class ControleArCondicionadoSpringer extends ControleArCondicionado{

    ControleArCondicionadoSpringer(double temperaturaMinimaAlvo, double temperaturaMaximaAlvo, int potenciaMaximaMotor, int potenciaAtualMotor) {
        super(temperaturaMinimaAlvo, temperaturaMaximaAlvo, potenciaMaximaMotor, potenciaAtualMotor);
    }

    @Override
    public void aplicar(double tempAtual) {
        if (tempAtual < TemperaturaMinimaAlvo) {
            if (PotenciaAtualMotor + 2 <= PotenciaMaximaMotor) {
                PotenciaAtualMotor += 2;
            } else {
                PotenciaMaximaMotor = PotenciaAtualMotor;
            }
        } else if (tempAtual > TemperaturaMaximaAlvo) {
            if (PotenciaAtualMotor - 2 >= 0) {
                PotenciaAtualMotor -= 2;
            } else {
                PotenciaAtualMotor = 0;
            }
        }
    }
}
