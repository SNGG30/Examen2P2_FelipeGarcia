
import java.io.Serializable;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Carros implements Serializable{
    
    private String Marca;
    private String Modelo;
    private int id;
    private Date fabricacion;
    private String Estado;
    private int CostoRep;
    
    private static final long SerialVersionUID=777L;

    public Carros() {
    }
    public Carros(String Marca, String Modelo, int id, Date fabricacion, String Estado, int CostoRep) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.id = id;
        this.fabricacion = fabricacion;
        this.Estado = Estado;
        this.CostoRep = CostoRep;
    }
    

    public String getMarca() {
        return Marca;
    }
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public Date getFabricacion() {
        return fabricacion;
    }
    public void setFabricacion(Date fabricacion) {
        this.fabricacion = fabricacion;
    }

    public String getEstado() {
        return Estado;
    }
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getCostoRep() {
        return CostoRep;
    }
    public void setCostoRep(int CostoRep) {
        this.CostoRep = CostoRep;
    }

    @Override
    public String toString() {
        return "Carros{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", id=" + id + ", fabricacion=" + fabricacion + ", Estado=" + Estado + ", CostoRep=" + CostoRep + '}';
    }
    
    
}
