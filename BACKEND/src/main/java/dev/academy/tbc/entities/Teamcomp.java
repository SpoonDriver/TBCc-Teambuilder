package dev.academy.tbc.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Teamcomp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamcompId;

    @NotNull(message = "Faction is needed")
    private Faction faction;

    @NotNull(message = "Groupleader is needed")
    private String groupLeader;

    @NotNull(message = "Region is needed")
    private Region region;

    @NotNull(message = "Servername is needed")
    private String serverName;
}
