package it.euris.ires.teams.data.model;

import lombok.Data;

@Data
public class Person {

  private String name;
  private Team team;

  public Person(String name, Team team) {
    this.name = name;
    this.team = team;
  }
}
