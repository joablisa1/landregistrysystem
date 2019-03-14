package com.landregistrysystem.app.repository;

import com.landregistrysystem.app.model.Residence;

import java.util.List;

public interface ResidenceRepository  {

    Residence save(Residence residence);
    List<Residence> getAllResidenceByOccupation(String location);
    List<Residence> getAllResidence();
    Residence getResidenceById(int id);
    void update_residence(Residence residence);
    void delete(int id);
}
