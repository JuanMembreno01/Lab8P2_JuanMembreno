/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_juanmembreno;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class admiistrautos {

    private ArrayList<autosm> autosm = new ArrayList();
    private File archivo = null;

    public admiistrautos() {
    }
    
    public admiistrautos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<autosm> getListaautosm() {
        return autosm;
    }

    public void setListaautosm(ArrayList<autosm> listaautosm) {
        this.autosm = listaautosm;
    }

    @Override
    public String toString() {
        return "autosm=" + autosm;
    }

    //extra mutador
    public void setPersona(autosm p) {
        this.autosm.add(p);
    }

    //metodos de administracion
    
     public void cargarArchivo() {
        try {            
            autosm = new ArrayList();
            autosm temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (autosm) objeto.readObject()) != null) {
                        autosm.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
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
            for (autosm t : autosm) {
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
