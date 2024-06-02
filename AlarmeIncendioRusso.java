public class AlarmeIncendioRusso extends AlarmeIncendio{

    AlarmeIncendioRusso(int volumeMaximo, int volumeAtual) {
        super(volumeMaximo, volumeAtual);
    }

    public void aplicar(double valor) {
        if (valor == 1111001) {
            if (!((VolumeAtual + 2 ) > VolumeMaximo)) {
                VolumeAtual+=2;
            }
        }
        else if (valor == 1101110){
            if (!((VolumeAtual - 2) <= 0)) {
                VolumeAtual-=2;
            }
        }
    }
}
