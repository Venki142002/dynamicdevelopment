package com.venki.dynamicdevelopment.entity.home;


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
public class staff
{
    @Id
    @SequenceGenerator(name = "gov",sequenceName = "gov",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gov")
    private long Id;
    private String content;
    private String position;
    private String contact;

}
