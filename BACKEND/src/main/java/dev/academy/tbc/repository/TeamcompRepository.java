package dev.academy.tbc.repository;

import dev.academy.tbc.entities.Teamcomp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamcompRepository extends JpaRepository<Teamcomp, Long> {
}
