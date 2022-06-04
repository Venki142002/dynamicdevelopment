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
public class home_content
{
    @Id
    @SequenceGenerator(name = "samples",sequenceName = "samples",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "samples")
    private long Id;
    @Column(length = 100000)
    private String content;

}
