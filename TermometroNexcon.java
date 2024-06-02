import java.util.Random;

public class TermometroNexcon extends Termometro{

    TermometroNexcon(double ultimaTemperaturaLida) {
        super(ultimaTemperaturaLida);
    }

    @Override
    public double ler_dado() {
        // Esse IF só é chamado caso a variável não tenha nenhum valor inicializado.
        if (UltimaTemperaturaLida == 0.0) {
            Random random = new Random();
            double min = 20.0;
            double max = 30.0;
            double randomDouble; // Gera uma temperatura entre 20.0 e 30.0
            /* EXEMPLO:
            * min = 10.0
            * max = 20.0
            * random.nextDouble() gera um valor aleatório entre 0.0 e 1.0
            * max - min = 20.0 - 10.0 = 10.0
            * (max - min) * random.nextDouble() = 10.0 * 0.5 = 5.0
            * min + (max - min) * random.nextDouble() = 10.0 + 5.0 = 15.0
            */
            randomDouble = min + (max - min) * random.nextDouble();
            UltimaTemperaturaLida = randomDouble;
            return randomDouble;
        } else {
            Random random = new Random();
            double min = UltimaTemperaturaLida - 2;
            double max = UltimaTemperaturaLida + 2;
            double randomDouble; // Gera uma temperatura entre UltimaTemperaturaLida - 2 e UltimaTemperaturaLida + 2
            randomDouble = min + (max - min) * random.nextDouble();
            UltimaTemperaturaLida = randomDouble;
            return randomDouble;
        }

    }
}
