package it.euris.ires.teams.data.repository;

import it.euris.ires.teams.data.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, String> {

}
