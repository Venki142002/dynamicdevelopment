package com.venki.dynamicdevelopment.Repository.home;

import com.venki.dynamicdevelopment.entity.home.home_content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface content extends JpaRepository<home_content,Long>
{

}
