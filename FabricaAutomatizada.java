import java.util.Random;

public class FabricaAutomatizada {

    public static void main(String[] args) {
        Random random = new Random();

        GerenciadorAmbiente gerenciador = new GerenciadorAmbiente();

        SensorFumaca SensorFumacaUS1 = new SensorFumacaNorteAmericano(1);
        SensorFumaca SensorFumacaUS2 = new SensorFumacaNorteAmericano(1);
        SensorFumaca SensorFumacaRU1 = new SensorFumacaRusso(1);

        AlarmeIncendio AlarmeIncendioUS1 = new AlarmeIncendioNorteAmericano(55, 25);
        AlarmeIncendio AlarmeIncendioUS2 = new AlarmeIncendioNorteAmericano(47, 22);
        AlarmeIncendio AlarmeIncendioRU1 = new AlarmeIncendioRusso(50, 10);

        Par_IoT parIoT1 = new Par_IoT("Produção de Tanks", SensorFumacaUS1, AlarmeIncendioUS1);
        Par_IoT parIoT2 = new Par_IoT("Produção de Aviões", SensorFumacaUS2, AlarmeIncendioUS2);
        Par_IoT parIoT3 = new Par_IoT("Produção de Bombas Nucleares", SensorFumacaRU1, AlarmeIncendioRU1);

        gerenciador.incluir(parIoT1);
        gerenciador.incluir(parIoT2);
        gerenciador.incluir(parIoT3);

        gerenciador.monitorar_ambiente();
    }
}
