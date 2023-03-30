package project.bakery;

public class PastelBoda extends Pastel {
    private int niveles;

    public PastelBoda() {
        this.setSabor("Almendra");
    }

    public int getNiveles() {
        return niveles;
    }

    public void setNiveles(int niveles) {
        this.niveles = niveles;
    }
}
