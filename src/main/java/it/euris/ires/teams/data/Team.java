package it.euris.ires.teams.data;

import lombok.Data;

@Data
public class Team {

  private String name;

  public Team(String name) {
    this.name = name;
  }
}
