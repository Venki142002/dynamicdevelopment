package com.venki.dynamicdevelopment.Repository.home;


import com.venki.dynamicdevelopment.entity.home.governing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface governingRepo extends JpaRepository<governing,Long>
{

}
