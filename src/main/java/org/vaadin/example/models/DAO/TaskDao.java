package org.vaadin.example.models.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.vaadin.example.models.Status;
import org.vaadin.example.models.Task;

import java.util.List;


public interface TaskDao extends JpaRepository<Task, Integer> {


    public List<Task> findByStatus(Status status);

    @Query("from Task t where t.client.phone= :clientPhone")
    public List<Task> findByClientPhone(@Param("clientPhone")String clientPhone);

    public List<Task> findByTrackNumber(String trackNumber);
}
