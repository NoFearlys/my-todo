package org.vaadin.example.models.DAO;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vaadin.example.models.City;

import java.util.List;


@Repository
public interface CityDao extends JpaRepository<City, Integer> {

    public List<City> findByName(String name);

}