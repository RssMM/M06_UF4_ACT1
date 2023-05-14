package com.balmes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balmes.model.Curs;
import com.balmes.repository.cursRepository;
import com.balmes.repository.estudiantRepository;

@Service
public class cursService implements crudService<Curs> {

    @Autowired
    private estudiantRepository estudiantRepository;

    @Autowired
    private cursRepository cursRepository;

    public cursService(cursRepository cursRepository) {
        this.cursRepository = cursRepository;
    }

    public List<Curs> list() {
        // TODO Auto-generated method stub
        List<Curs> listaCursos = cursRepository.findAll();
        for (Curs curs : listaCursos) {
            curs.setEstudiants(estudiantRepository.getEstudiantsperCurs(curs.getCursId()));
            System.out.println(curs.toString());
        }
        return listaCursos;
    }

    public Curs create(Curs t) {
        // TODO Auto-generated method stub
        return null;
    }

    public Optional<Curs> get(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    public void update(Curs t, int id) {
        // TODO Auto-generated method stub

    }

    public void delete(int id) {
        // TODO Auto-generated method stub

    }
}