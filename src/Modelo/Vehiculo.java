package Modelo;

public class Vehiculo {

    String patente;
    String marca;
    String modelo;
    int anno;
    String numero_motor;
    String numero_chasis;
    int estado;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getNumero_motor() {
        return numero_motor;
    }

    public void setNumero_motor(String numero_motor) {
        this.numero_motor = numero_motor;
    }

    public String getNumero_chasis() {
        return numero_chasis;
    }

    public void setNumero_chasis(String numero_chasis) {
        this.numero_chasis = numero_chasis;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", anno=" + anno + ", numero_motor=" + numero_motor + ", numero_chasis=" + numero_chasis + ", estado=" + estado + '}';
    }
}
