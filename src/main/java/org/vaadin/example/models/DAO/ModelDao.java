package org.vaadin.example.models.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vaadin.example.models.Model;

import java.util.List;

@Repository
public interface ModelDao  extends JpaRepository<Model, Integer> {

    List<Model> findByVersion(String version);

    List<Model> findByName(String name);

}

