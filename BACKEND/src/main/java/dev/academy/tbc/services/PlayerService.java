package dev.academy.tbc.services;

import dev.academy.tbc.dto.PlayerRequest;
import dev.academy.tbc.entities.Player;
import dev.academy.tbc.repository.PlayerRepository;
import dev.academy.tbc.repository.TeamcompRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayerService {

    private final PlayerRepository playerRepository;
    private final TeamcompRepository teamcompRepository;

    public void save(PlayerRequest playerRequest) {
        Player player = new Player();
        player.setCharacterName(playerRequest.getCharacterName());
        player.setClasses(playerRequest.getClasses());
        player.setRole(playerRequest.getRoles());
        player.setTeamcomp(teamcompRepository.getOne(playerRequest.getTeamcompId()));
        playerRepository.save(player);
    }
}
