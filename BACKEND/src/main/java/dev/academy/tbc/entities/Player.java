package dev.academy.tbc.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.security.Identity;

import static javax.persistence.FetchType.LAZY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String characterName;

    private Classes classes;

    private Roles role;


    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "teamcompId", referencedColumnName = "teamcompId")
    private Teamcomp teamcomp;
}
