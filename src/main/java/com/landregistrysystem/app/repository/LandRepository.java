package com.landregistrysystem.app.repository;

import com.landregistrysystem.app.model.Land;

import java.util.List;

public interface LandRepository {
    Land save(Land land);
    List<Land> getAllLandByLocations(String location);
    List<Land> getFullListLandByLocations();
    Land getAllLandByID(int id);
    void updateLand(Land land);
    void delete(int id);
}
