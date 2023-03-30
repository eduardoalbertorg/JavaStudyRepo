package project.bakery;

public class Pastel {
    private String sabor;
    private double precio;

    public Pastel() {
        this.setSabor("Vainilla");
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
