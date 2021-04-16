package dev.academy.tbc.dto;


import dev.academy.tbc.entities.Faction;
import dev.academy.tbc.entities.Region;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamCompResponse {
    private Long teamcompId;
    private String groupLeader;
    private Faction faction;
    private Region region;
    private String server;
    private String raidName;
}
