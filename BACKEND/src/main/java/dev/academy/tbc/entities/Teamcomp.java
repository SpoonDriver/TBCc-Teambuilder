package dev.academy.tbc.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Teamcomp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamcompId;

    private Faction faction;

    private String groupLeader;


}
