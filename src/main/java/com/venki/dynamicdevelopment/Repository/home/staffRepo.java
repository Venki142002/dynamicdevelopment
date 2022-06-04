package com.venki.dynamicdevelopment.Repository.home;

import com.venki.dynamicdevelopment.entity.home.home_content;
import com.venki.dynamicdevelopment.entity.home.staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface staffRepo extends JpaRepository<staff,Long>
{

}
