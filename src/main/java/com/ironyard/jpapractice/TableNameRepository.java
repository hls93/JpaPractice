package com.ironyard.jpapractice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TableNameRepository extends JpaRepository<TableName, Integer> {
}
