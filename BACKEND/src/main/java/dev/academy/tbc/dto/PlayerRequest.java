package dev.academy.tbc.dto;


import dev.academy.tbc.entities.Classes;
import dev.academy.tbc.entities.Roles;
import dev.academy.tbc.entities.Teamcomp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerRequest {
    private String characterName;
    private Roles roles;
    private Classes classes;
    private Long teamcompId;
}
