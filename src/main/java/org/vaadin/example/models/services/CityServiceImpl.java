package org.vaadin.example.models.services;

import org.springframework.stereotype.Service;
import org.vaadin.example.models.City;
import org.vaadin.example.models.DAO.CityDao;

@Service
public class CityServiceImpl implements CityService{

    private CityDao cityDao;

    @Override
    public void addCity(String name) {
        City city = new City(name);
        cityDao.save(city);
    }
}
