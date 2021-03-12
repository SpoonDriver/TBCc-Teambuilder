package dev.academy.tbc.controller;


import dev.academy.tbc.dto.PlayerResponse;
import dev.academy.tbc.dto.TeamcompRequest;
import dev.academy.tbc.services.PlayerService;
import dev.academy.tbc.services.TeamcompService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/api/teamcomp")
@AllArgsConstructor
public class TeamcompController {

    private final TeamcompService teamcompService;
    private final PlayerService playerService;

    @PostMapping("/createComp")
    public ResponseEntity<String> createComp(@RequestBody TeamcompRequest teamcompRequest) {
        teamcompService.save(teamcompRequest);
        return new ResponseEntity<>("teamcomp created", HttpStatus.OK);

    }

    @GetMapping("/getComp/{teamcompid}")
    public ResponseEntity getComp(@PathVariable Long teamcompid) {
        return status(OK).body(teamcompService.getTeamCompById(teamcompid));
    }

    @GetMapping("/getPlayersInComp/{teamcompid}")
    public ResponseEntity<List<PlayerResponse>> getCompWithPlayers(@PathVariable Long teamcompid) {
        return status(OK).body(playerService.getTeamCompWithPlayersById(teamcompid));
    }


}
