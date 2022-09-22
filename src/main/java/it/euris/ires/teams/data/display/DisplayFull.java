package it.euris.ires.teams.data.display;

import lombok.Data;

@Data
public class DisplayFull {

  private DisplayTeam displayTeam;
  private DisplayPerson displayPerson;

  public DisplayFull(DisplayTeam displayTeam, DisplayPerson displayPerson) {
    this.displayTeam = displayTeam;
    this.displayPerson = displayPerson;
  }
}
