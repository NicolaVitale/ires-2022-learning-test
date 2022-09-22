package it.euris.ires.teams.data.repository;

import it.euris.ires.teams.data.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, String> {

}
