public abstract class AlarmeIncendio implements Atuador {

    public int VolumeMaximo;
    public int VolumeAtual;

    AlarmeIncendio(int volumeMaximo, int volumeAtual) {
        VolumeMaximo = volumeMaximo;
        VolumeAtual = volumeAtual;
    }

    public abstract void aplicar(double valor);

}
