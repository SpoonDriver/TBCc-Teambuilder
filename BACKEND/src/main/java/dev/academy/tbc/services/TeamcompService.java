package dev.academy.tbc.services;

import dev.academy.tbc.dto.TeamcompRequest;
import dev.academy.tbc.entities.Teamcomp;
import dev.academy.tbc.repository.PlayerRepository;
import dev.academy.tbc.repository.TeamcompRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TeamcompService {

    private final PlayerRepository playerRepository;
    private final TeamcompRepository teamcompRepository;


    public void save(TeamcompRequest teamcompRequest) {
        Teamcomp teamcomp = new Teamcomp();
        teamcomp.setFaction(teamcompRequest.getFaction());
        teamcomp.setGroupLeader(teamcompRequest.getGroupLeader());
        teamcomp.setRegion(teamcompRequest.getRegion());
        teamcomp.setServerName(teamcompRequest.getServerName());
        teamcompRepository.save(teamcomp);
    }
}
