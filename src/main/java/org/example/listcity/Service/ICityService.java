package org.example.listcity.Service;

import org.example.listcity.model.City;

import java.util.List;
import java.util.Optional;

public interface ICityService {
    Iterable<City> findAll();

    Optional<City> findById(Long id);

    void save(City city);

    void remove(Long id);

    void edit(City city, Long id);
}