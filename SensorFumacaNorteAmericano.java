public class SensorFumacaNorteAmericano extends SensorFumaca{
    SensorFumacaNorteAmericano(int contador) {
        super(contador);
    }

    public double ler_dado() {
        if (Contador >= 10) {
            Contador = 0;
        } else {
            Contador++;
            if (Contador <= 5) {
                return 1;
            }
            else {
                return 0;
            }


        }

        return 0;
    }
}
