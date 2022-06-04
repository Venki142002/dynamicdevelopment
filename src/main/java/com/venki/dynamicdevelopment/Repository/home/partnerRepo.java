package com.venki.dynamicdevelopment.Repository.home;

import com.venki.dynamicdevelopment.entity.home.partner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface partnerRepo extends JpaRepository<partner,Long>
{

}
