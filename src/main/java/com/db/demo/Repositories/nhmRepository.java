package com.db.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.demo.northernhemispheremonthly;

@Repository
public interface nhmRepository extends JpaRepository<northernhemispheremonthly, String>{
    
}
