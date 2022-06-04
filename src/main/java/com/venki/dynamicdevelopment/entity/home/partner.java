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
public class partner
{
    @Id
    @SequenceGenerator(name = "partner",sequenceName = "partner",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "partner")
    private long Id;
    @Column(length = 100000)
    private String content;

}
