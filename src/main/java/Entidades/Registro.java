package Entidades;

import javax.persistence.*;

import java.io.Serializable;

/**
 * Created by darle on 9/10/2017.
 */

@Entity

public class Registro implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String nombre;
    private String sector;
    private String nivelEscolar;
    private String ubicacion;

    public Registro() {
    }

    public Registro(String nombre, String sector, String nivelEscolar, String ubicacion) {
        this.nombre = nombre;
        this.sector = sector;
        this.nivelEscolar = nivelEscolar;
        this.ubicacion = ubicacion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getNivelEscolar() {
        return nivelEscolar;
    }

    public void setNivelEscolar(String nivelEscolar) {
        this.nivelEscolar = nivelEscolar;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

}
