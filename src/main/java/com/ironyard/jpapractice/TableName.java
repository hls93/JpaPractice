package com.ironyard.jpapractice;

import javax.persistence.*;

import java.util.HashSet;

import java.util.Set;

@Entity
@Table(name = "table_name")
public class TableName {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<TableNameTwo> twos = new HashSet<>();




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<TableNameTwo> getTwos() {
        return twos;
    }

    public void setTwos(Set<TableNameTwo> twos) {
        this.twos = twos;
    }
}
