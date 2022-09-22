package com.example.springjwt.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@NoArgsConstructor
@Entity
@Table(name = "authority")
@Getter
@Setter
public class Authority {
    @Id
    @Column(name = "authority_name", length=50)
    private String authorityName;
}
