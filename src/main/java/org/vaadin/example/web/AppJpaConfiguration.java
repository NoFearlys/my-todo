package org.vaadin.example.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Configuration
@EnableJpaRepositories(basePackages = "org.vaadin.example.models")
@EnableTransactionManagement
public class AppJpaConfiguration {
    public EntityManagerFactory entityManagerFactory() {
        return Persistence.createEntityManagerFactory("MainPersistenceUnit");
    }
}
