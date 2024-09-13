package com.springboot.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.banking.entity.Records;

@Repository
public interface RecordRepo extends JpaRepository<Records,Long>{

}
