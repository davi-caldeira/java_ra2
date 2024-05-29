public class AlarmeIncendioNorteAmericano extends AlarmeIncendio{

    AlarmeIncendioNorteAmericano(int volumeMaximo, int volumeAtual) {
        super(volumeMaximo, volumeAtual);
    }

    public void aplicar(double valor) {
        if (valor == 1) {
            if (!((VolumeAtual + 1 ) > VolumeMaximo)) {
                VolumeAtual++;
            }
        }
        else {
            if (!((VolumeAtual - 1) <= 0)) {
                VolumeAtual--;
            }
        }
    }
}
