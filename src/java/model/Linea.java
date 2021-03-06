package model;
// Generated Jun 24, 2016 2:20:20 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Linea generated by hbm2java
 */
public class Linea  implements java.io.Serializable {


     private Integer lineaId;
     private String nombre;
     private double costoDiseno;
     private double costoDesfile;
     private Set articuloRopas = new HashSet(0);

    public Linea() {
    }

	
    public Linea(String nombre, double costoDiseno, double costoDesfile) {
        this.nombre = nombre;
        this.costoDiseno = costoDiseno;
        this.costoDesfile = costoDesfile;
    }
    public Linea(String nombre, double costoDiseno, double costoDesfile, Set articuloRopas) {
       this.nombre = nombre;
       this.costoDiseno = costoDiseno;
       this.costoDesfile = costoDesfile;
       this.articuloRopas = articuloRopas;
    }
   
    public Integer getLineaId() {
        return this.lineaId;
    }
    
    public void setLineaId(Integer lineaId) {
        this.lineaId = lineaId;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getCostoDiseno() {
        return this.costoDiseno;
    }
    
    public void setCostoDiseno(double costoDiseno) {
        this.costoDiseno = costoDiseno;
    }
    public double getCostoDesfile() {
        return this.costoDesfile;
    }
    
    public void setCostoDesfile(double costoDesfile) {
        this.costoDesfile = costoDesfile;
    }
    public Set getArticuloRopas() {
        return this.articuloRopas;
    }
    
    public void setArticuloRopas(Set articuloRopas) {
        this.articuloRopas = articuloRopas;
    }




}


