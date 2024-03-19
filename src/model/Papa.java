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
        if(nombre.isBlank()) throw new NullPointerException();
        else this.nombre = nombre;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        if(especie.isBlank()) throw new NullPointerException();
        else this.especie = especie;
    }

    public String getZonaP() {
        return this.zonaP;
    }

    public void setZonaP(String zonaP) {
        if(zonaP.isBlank()) throw new NullPointerException();
        else this.zonaP = zonaP;
    }

    public String getHabitoC() {
        return this.habitoC;
    }

    public void setHabitoC(String habitoC) {
        if(habitoC.isBlank()) throw new NullPointerException();
        else this.habitoC = habitoC;
    }

    public String getFloracion() {
        return this.floracion;
    }

    public void setFloracion(String floracion) {
        if(floracion.isBlank()) throw new NullPointerException();
        else this.floracion = floracion;
    }

    public String getBayas() {
        return this.bayas;
    }

    public void setBayas(String bayas) {
        if(bayas.isBlank())throw new NullPointerException();
        else this.bayas = bayas;
    }

    public String getTuberculos() {
        return this.tuberculos;
    }

    public void setTuberculos(String tuberculos) {
        if(tuberculos.isBlank()) throw new NullPointerException();
        else this.tuberculos = tuberculos;
    }
    
    public Papa(){}

    public Papa(String nombre, String especie, String zonaP, String habitoC, String floracion, String bayas, String tuberculos) {
        this.nombre = nombre;
        this.especie = especie;
        this.zonaP = zonaP;
        this.habitoC = habitoC;
        this.floracion = floracion;
        this.bayas = bayas;
        this.tuberculos = tuberculos;
    }
    
    

    public Papa(String nombre, String especie, String zonaP) {
        this.nombre = nombre;
        this.especie = especie;
        this.zonaP = zonaP;
        this.habitoC = "";
        this.floracion = "";
        this.bayas = "";
        this.tuberculos = "";
    }

    @Override
    public String toString() {
        return "Papa [nombre=" + nombre + ", especie=" + especie + ", zonaP=" + zonaP + "]";
    }


}
