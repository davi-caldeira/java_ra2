public class SensorFumacaRusso extends SensorFumaca{
    SensorFumacaRusso(int contador) {
        super(contador);
    }

    public double ler_dado() {
        if (Contador >= 10) {
            Contador = 0;
        } else {
            Contador++;
            if (Contador <= 5) {
                return 1111001;
            }
            else {
                return 1101110;
            }


        }

        return 1101110;
    }
}
