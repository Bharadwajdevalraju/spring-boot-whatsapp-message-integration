package com.hi5.laundromat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hi5.laundromat.entity.WashDetails;

@Repository
public interface WashDetailsRepository extends JpaRepository<WashDetails,Long>{

}
