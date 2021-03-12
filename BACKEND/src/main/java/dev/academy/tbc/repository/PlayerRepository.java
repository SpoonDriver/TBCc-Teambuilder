package dev.academy.tbc.repository;

import dev.academy.tbc.entities.Player;
import dev.academy.tbc.entities.Teamcomp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    List<Player> findAllByTeamcomp(Teamcomp teamcomp);
}
