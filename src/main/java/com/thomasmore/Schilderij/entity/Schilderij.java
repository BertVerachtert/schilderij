package com.thomasmore.Schilderij.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="schilderij")
@Data
@NoArgsConstructor
public class Schilderij {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="schilderijID")
    private int schilderijID;

    @Column(name="naam")
    private String naam;

    @Column(name="artiestID")
    private int artiestID;
}
