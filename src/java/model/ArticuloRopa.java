package model;
// Generated Jun 24, 2016 2:20:20 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * ArticuloRopa generated by hbm2java
 */
public class ArticuloRopa  implements java.io.Serializable {


     private Integer articuloRopaId;
     private Linea linea;
     private String nombre;
     private double precioVenta;
     private double precioCosto;
     private double demanda;
     private Set articuloRopaHasMaterials = new HashSet(0);

    public ArticuloRopa() {
    }

	
    public ArticuloRopa(Linea linea, String nombre, double precioVenta, double precioCosto, double demanda) {
        this.linea = linea;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.precioCosto = precioCosto;
        this.demanda = demanda;
    }
    public ArticuloRopa(Linea linea, String nombre, double precioVenta, double precioCosto, double demanda, Set articuloRopaHasMaterials) {
       this.linea = linea;
       this.nombre = nombre;
       this.precioVenta = precioVenta;
       this.precioCosto = precioCosto;
       this.demanda = demanda;
       this.articuloRopaHasMaterials = articuloRopaHasMaterials;
    }
   
    public Integer getArticuloRopaId() {
        return this.articuloRopaId;
    }
    
    public void setArticuloRopaId(Integer articuloRopaId) {
        this.articuloRopaId = articuloRopaId;
    }
    public Linea getLinea() {
        return this.linea;
    }
    
    public void setLinea(Linea linea) {
        this.linea = linea;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecioVenta() {
        return this.precioVenta;
    }
    
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    public double getPrecioCosto() {
        return this.precioCosto;
    }
    
    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }
    public double getDemanda() {
        return this.demanda;
    }
    
    public void setDemanda(double demanda) {
        this.demanda = demanda;
    }
    public Set getArticuloRopaHasMaterials() {
        return this.articuloRopaHasMaterials;
    }
    
    public void setArticuloRopaHasMaterials(Set articuloRopaHasMaterials) {
        this.articuloRopaHasMaterials = articuloRopaHasMaterials;
    }




}


