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
public class TeamcompRequest {
    private Faction faction;
    private String groupLeader;
    private Region region;
    private String serverName;
    private String raidName;
}
