package dev.academy.tbc.dto;


import dev.academy.tbc.entities.Classes;
import dev.academy.tbc.entities.Faction;
import dev.academy.tbc.entities.Roles;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerResponse {
    private String characterName;
    private Roles role;
    private Classes classes;
    private Long id;
}
