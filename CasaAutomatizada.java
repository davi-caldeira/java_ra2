import java.util.Random;

public class CasaAutomatizada {
    public static void main(String[] args) {
        Random random = new Random();

        GerenciadorAmbiente gerenciador = new GerenciadorAmbiente();

        Termometro termometroNexcon1 = new TermometroNexcon(20 + (25 - 20) * random.nextDouble());
        Termometro termometroNexcon2 = new TermometroNexcon(20 + (25 - 20) * random.nextDouble());
        Termometro termometroTuya1 = new TermometroTuya(20 + (25 - 20) * random.nextDouble());

        ControleArCondicionado controleArCondicionadoSpringer1 = new ControleArCondicionadoSpringer(15, 25, 5, 3);
        ControleArCondicionado controleArCondicionadoSpringer2 = new ControleArCondicionadoSpringer(17, 22, 4, 2);
        ControleArCondicionado controleArCondicionadoAgratto1 = new ControleArCondicionadoAgratto(10, 20, 3, 1);

        Par_IoT parIoT1 = new Par_IoT("Escritório", termometroNexcon1, controleArCondicionadoSpringer1);
        Par_IoT parIoT2 = new Par_IoT("Suíte Casal", termometroNexcon2, controleArCondicionadoSpringer2);
        Par_IoT parIoT3 = new Par_IoT("Quarto de Jogos", termometroTuya1, controleArCondicionadoAgratto1);

        gerenciador.incluir(parIoT1);
        gerenciador.incluir(parIoT2);
        gerenciador.incluir(parIoT3);

        gerenciador.monitorar_ambiente();


    }
}