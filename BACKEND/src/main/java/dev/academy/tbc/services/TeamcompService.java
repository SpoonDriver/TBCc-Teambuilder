package dev.academy.tbc.services;

import dev.academy.tbc.dto.TeamCompResponse;
import dev.academy.tbc.dto.TeamcompRequest;
import dev.academy.tbc.entities.Player;
import dev.academy.tbc.entities.Teamcomp;
import dev.academy.tbc.repository.PlayerRepository;
import dev.academy.tbc.repository.TeamcompRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@AllArgsConstructor
@Transactional
@Slf4j
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


    @Transactional(readOnly = true)
    public Optional<Teamcomp> getTeamCompById(Long id) {
        return teamcompRepository.findById(id);
    }



    private TeamCompResponse mapToTeamCompResponse(Teamcomp teamcomp) {
        return TeamCompResponse.builder().faction(teamcomp.getFaction())
                .groupLeader(teamcomp.getGroupLeader())
                .region(teamcomp.getRegion())
                .server(teamcomp.getServerName())
                .teamcompId(teamcomp.getTeamcompId())
                .build();
    }
}
