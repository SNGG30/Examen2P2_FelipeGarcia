/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class adminEmpleados {
    
    private ArrayList<Empleados> listaEmpleados = new ArrayList();
    private File archivo = null;

    public adminEmpleados(String path) {
        archivo = new File(path);
    }

    public ArrayList<Empleados> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaPersonas(ArrayList<Empleados> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaEmpleados=" + listaEmpleados;
    }

    //extra mutador
    public void setPersona(Empleados e) {
        this.listaEmpleados.add(e);
    }

    public void cargarArchivo() {
        try {            
            listaEmpleados = new ArrayList();
            Empleados temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Empleados) objeto.readObject()) != null) {
                        listaEmpleados.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Empleados t : listaEmpleados) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
