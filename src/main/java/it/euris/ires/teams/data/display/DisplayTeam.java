package it.euris.ires.teams.data.display;

import it.euris.ires.teams.data.model.Team;
import java.util.List;
import lombok.Data;

@Data
public class DisplayTeam {

  private List<Team> teamList;

  public DisplayTeam(List<Team> teamList) {
    this.teamList = teamList;
  }
}
