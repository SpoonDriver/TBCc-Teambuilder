package dev.academy.tbc.controller;


import dev.academy.tbc.dto.PlayerRequest;
import dev.academy.tbc.services.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/player")
@AllArgsConstructor
public class PlayerController {

    private final PlayerService playerService;

    @PostMapping("/createPlayer")
    public ResponseEntity<String> createPlater(@RequestBody PlayerRequest playerRequest) {
        playerService.save(playerRequest);
        return new ResponseEntity<>("Player added", HttpStatus.OK);
    }
}
