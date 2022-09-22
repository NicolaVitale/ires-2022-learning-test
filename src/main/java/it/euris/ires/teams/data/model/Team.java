package it.euris.ires.teams.data.model;

import it.euris.ires.teams.data.model.Person;
import java.util.List;
import lombok.Data;

@Data
public class Team {

  private String name;
  private List<Person> player;

  public Team(String name, List<Person> player) {
    this.name = name;
    this.player = player;
  }

}
