package project.bakery;

public class PastelFiestaCumple extends Pastel {
    private int velas;

    public PastelFiestaCumple() {
        this.setSabor("chocolate");
    }

    public int getVelas() {
        return velas;
    }

    public void setVelas(int velas) {
        this.velas = velas;
    }
}
