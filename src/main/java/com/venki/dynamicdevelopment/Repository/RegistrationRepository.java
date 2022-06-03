package com.venki.dynamicdevelopment.Repository;

import com.venki.dynamicdevelopment.entity.registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<registration,Long>
{
    public List<registration> findByMailid(String mailid);

}
