package dev.academy.tbc.dto;

import dev.academy.tbc.entities.Faction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamcompRequest {
    private Faction faction;
    private String groupLeader;
}
