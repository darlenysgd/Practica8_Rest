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
    private String educacion;
    private String lugar;

    public Registro() {
    }

    public Registro(String nombre, String sector, String educacion, String lugar) {
        this.nombre = nombre;
        this.sector = sector;
        this.educacion = educacion;
        this.lugar = lugar;


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

    public String geteducacion() {
        return educacion;
    }

    public void seteducacion(String educacion) {
        this.educacion = educacion;
    }

    public String getlugar() {
        return lugar;
    }

    public void setlugar(String lugar) {
        this.lugar = lugar;
    }

}
