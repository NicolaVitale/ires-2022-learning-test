package it.euris.ires.teams.data.repository;

import it.euris.ires.teams.data.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, String> {

}
