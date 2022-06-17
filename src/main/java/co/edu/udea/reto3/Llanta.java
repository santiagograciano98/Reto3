package co.edu.udea.reto3;

/**
 *
 * @author Santiago Graciano
 */
public class Llanta {
    private String marca;
    private String referencia;
    private double peso;

    public Llanta() {
    }

    public Llanta(String marca, String referencia, double peso) {
        this.marca = marca;
        this.referencia = referencia;
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
