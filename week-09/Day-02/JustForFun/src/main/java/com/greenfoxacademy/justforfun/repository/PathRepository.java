package com.greenfoxacademy.justforfun.repository;

import com.greenfoxacademy.justforfun.model.Path;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PathRepository extends CrudRepository <Path, Long> {

    @Query(value = "SELECT path FROM path ORDER BY RAND() LIMIT 1", nativeQuery = true)
    public String getRandomPath();
}
