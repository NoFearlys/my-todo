package org.vaadin.example.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.vaadin.example.models.Client;
import org.vaadin.example.models.DAO.ClientDao;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/client")
public class RestClientController {

    @Autowired
    private ClientDao clientDao;

    @GetMapping(value = "/{id}", produces = "application/json")
    public Client getClient (@PathVariable int id){
        try{
            return clientDao.findById(id).get();
        }
        catch (NoSuchElementException e){
            return null;
        }
    }

    @DeleteMapping(value = "/{id}", produces = "application/json")
    public void deleteClient(@PathVariable int id){
        try{
            clientDao.deleteById(id);
        }
        catch (NoSuchElementException e){
            throw new NoSuchElementException();
        }
    }

    @PutMapping(produces = "application/json")
    public void createClient(@RequestBody Client client){
        try{
            clientDao.save(client);
        }
        catch (NoSuchElementException e){
            throw new NoSuchElementException();
        }
    }
}
