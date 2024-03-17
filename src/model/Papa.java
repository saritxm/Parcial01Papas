package model;

public class Papa {
    private String nombre;
    private String especie;
    private String zonaP;
    private String habitoC;
    private String floracion;
    private String bayas;
    private String tuberculos;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getZonaP() {
        return this.zonaP;
    }

    public void setZonaP(String zonaP) {
        this.zonaP = zonaP;
    }

    public String getHabitoC() {
        return this.habitoC;
    }

    public void setHabitoC(String habitoC) {
        this.habitoC = habitoC;
    }

    public String getFloracion() {
        return this.floracion;
    }

    public void setFloracion(String floracion) {
        this.floracion = floracion;
    }

    public String getBayas() {
        return this.bayas;
    }

    public void setBayas(String bayas) {
        this.bayas = bayas;
    }

    public String getTuberculos() {
        return this.tuberculos;
    }

    public void setTuberculos(String tuberculos) {
        this.tuberculos = tuberculos;
    }
    
    public Papa(){}

    public Papa(String nombre, String especie, String zonaP) {
        this.nombre = nombre;
        this.especie = especie;
        this.zonaP = zonaP;
    }

    @Override
    public String toString() {
        return "Papa [nombre=" + nombre + ", especie=" + especie + ", zonaP=" + zonaP + "]";
    }


}
