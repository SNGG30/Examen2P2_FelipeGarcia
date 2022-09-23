
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Empleados implements Serializable{
    
    private String Nombre;
    private int Edad;
    private long id;
    private int exito;
    
    private static final long SerialVersionUID=777L;

    public Empleados() {
    }
    public Empleados(String Nombre, int Edad, long id, int exito) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.id = id;
        this.exito = exito;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public int getExito() {
        return exito;
    }
    public void setExito(int exito) {
        this.exito = exito;
    }
    
    
}
