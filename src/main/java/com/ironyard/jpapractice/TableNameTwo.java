package com.ironyard.jpapractice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TableNameTwo {

    @Id
    @GeneratedValue
    int id;

    String name;
}
