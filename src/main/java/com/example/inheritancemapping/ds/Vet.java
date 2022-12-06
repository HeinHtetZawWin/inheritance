package com.example.inheritancemapping.ds;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "vet_type")
public abstract class Vet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String qualification;

    public Vet() {
    }

    public Vet(String name, String qualification) {
        this.name = name;
        this.qualification = qualification;
    }
}
