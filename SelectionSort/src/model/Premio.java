package model;

public class Premio {

    private String nombrePremio;
    private int precioPremio;

    public Premio(String nombrePremio, int precioPremio) {
        this.nombrePremio = nombrePremio;
        this.precioPremio = precioPremio;
    }

    public void setNombrePremio(String nombrePremio) {
        this.nombrePremio = nombrePremio;
    }

    public void setPrecioPremio(int precioPremio) {
        this.precioPremio = precioPremio;
    }

    public String getNombrePremio() {
        return nombrePremio;
    }

    public int getPrecioPremio() {
        return precioPremio;
    }

}
