package dev.academy.tbc.controller;


import dev.academy.tbc.dto.TeamcompRequest;
import dev.academy.tbc.services.TeamcompService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teamcomp")
@AllArgsConstructor
public class TeamcompController {

    private final TeamcompService teamcompService;

    @PostMapping("/createComp")
    public ResponseEntity<String> createComp (@RequestBody TeamcompRequest teamcompRequest) {
        teamcompService.save(teamcompRequest);
        return new ResponseEntity<>("teamcomp created", HttpStatus.OK);

    }

}
