package com.venki.dynamicdevelopment.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(schema = "DWD")
public class registration {
    @Id
    @SequenceGenerator(name = "sample",sequenceName = "sample",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sample")
    private long id;
    private String username;
    private String fullname;
    private String mailid;
    private String password;
    private String conpassword;
    private String gender;
    private String dob;
    private String phno;
    private String bld;
    private String city;
}

