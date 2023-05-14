package com.balmes.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.balmes.model.Curs;
import com.balmes.model.Estudiant;

@Repository
public class estudiantRepository implements crudRepository<Estudiant> {

    private List<Estudiant> cursant = new ArrayList<Estudiant>();


    public estudiantRepository() {
        Curs accesADades = new Curs(1, "Modul 6","Acces a dades",
                "https://ioc.xtec.cat/materials/FP/Recursos/fp_dam_m06_/web/fp_dam_m06_htmlindex/index.html&quot;");

        Curs programacioMultimedia = new Curs(2, "Modul 8","Programacio Multimedia",
                "https://ioc.xtec.cat/materials/FP/Recursos/fp_dam_m08_/web/fp_dam_m08_htmlindex/index.html&quot;");

        List<Curs> curses = new ArrayList<Curs>();

        curses.add(accesADades);
        curses.add(programacioMultimedia);

        Estudiant estudiant1 = new Estudiant(1, "Yassir", "Mahboub", curses);
        curses = new ArrayList<Curs>();

        curses.add(programacioMultimedia);
        Estudiant estudiant2 = new Estudiant(2, "Rissay", "MAH", curses);
        cursant.add(estudiant1);
        cursant.add(estudiant2);
    }

    @Override
    public List<Estudiant> findAll() {
        return cursant;
    }

    @Override
    public List<Estudiant> getEstudiantsperCurs(int CursId) {
        List<Estudiant> estudiants = new ArrayList<Estudiant>();
        for(Estudiant e : cursant) {
            for(Curs curs: e.getCurs()){
                if(curs.getCursId() == CursId) {
                    estudiants.add(e);
                }
            }

        }
        return estudiants;
    }

}
