package com.balmes.model;

import java.util.List;

public class Estudiant {
    private int estudiantId;

    private List<Curs> curs;
    private String estudiantNom;
    private String estudiantCognom;


    public Estudiant() {
    }

    public Estudiant(int estudiantId, String estudiantNom, String estudiantCognom, List<Curs> curs) {
        super();
        this.estudiantId = estudiantId;
        this.estudiantNom = estudiantNom;
        this.estudiantCognom = estudiantCognom;
        this.curs = curs;
    }
    public int getEstudiantId() {
        return estudiantId;
    }

    public void setEstudiantId(int estudiantId) {
        this.estudiantId = estudiantId;
    }

    public List<Curs> getCurs() {
        return curs;
    }

    public void setCurs(List<Curs> curs) {
        this.curs = curs;
    }

    public String getEstudiantNom() {
        return estudiantNom;
    }

    public void setEstudiantNom(String estudiantNom) {
        this.estudiantNom = estudiantNom;
    }

    public String getEstudiantCognom() {
        return estudiantCognom;
    }

    public void setEstudiantCognom(String estudiantCognom) {
        this.estudiantCognom = estudiantCognom;
    }



    @Override
    public String toString() {
        return "Estudiant [estudiantId=" + estudiantId + ", estudiantNom=" + estudiantNom + ", estudiantCognom="
                + estudiantCognom + ", curs=" + curs + "]";
    }
}
