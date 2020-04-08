package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Cacheable
public class Person extends PanacheEntity {
    @Column(unique = true)
    public String name;
    public LocalDate birth;

    // return name as uppercase in the model
    public String getName() {
        return name.toUpperCase();
    }

    // store all names in lowercase in the DB
    public void setName(String name) {
        this.name = name.toLowerCase();
    }
}

