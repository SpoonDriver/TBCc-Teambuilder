package dev.academy.tbc.services;

import dev.academy.tbc.dto.PlayerRequest;
import dev.academy.tbc.dto.PlayerResponse;
import dev.academy.tbc.entities.Player;
import dev.academy.tbc.entities.Teamcomp;
import dev.academy.tbc.repository.PlayerRepository;
import dev.academy.tbc.repository.TeamcompRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional
@Slf4j
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

    @Transactional(readOnly = true)
    public List<PlayerResponse> getTeamCompWithPlayersById(Long teamcompid) {
        Teamcomp teamcomp = teamcompRepository.findTeamcompByTeamcompId(teamcompid);
        List<Player> players = playerRepository.findAllByTeamcomp(teamcomp);


        return players.stream()
                .map(this::mapToPlayerResponse)
                .collect(Collectors.toList());
    }

    private PlayerResponse mapToPlayerResponse(Player player) {
        return PlayerResponse.builder().characterName(player.getCharacterName())
                .classes(player.getClasses())
                .id(player.getId())
                .role(player.getRole())
                .build();
    }
}

