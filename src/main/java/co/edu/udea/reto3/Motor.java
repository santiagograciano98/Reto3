package co.edu.udea.reto3;

/**
 *
 * @author Santiago Graciano
 */
public class Motor {
    private double cilindraje;
    private String marca;
    private String referencia;
    private float peso;
    private String descripcion;

    public Motor() {
    }

    public Motor(double cilindraje, String marca, String referencia, float peso, String descripcion) {
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.referencia = referencia;
        this.peso = peso;
        this.descripcion = descripcion;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
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

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
