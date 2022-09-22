package it.euris.ires.teams;

import it.euris.ires.teams.data.model.Person;
import it.euris.ires.teams.data.model.Team;
import it.euris.ires.teams.data.display.DisplayFull;
import it.euris.ires.teams.data.enums.Command;
import it.euris.ires.teams.data.repository.PersonRepository;
import it.euris.ires.teams.data.repository.TeamRepository;
import java.util.List;
import java.util.Optional;
import lombok.Data;

@Data
public class TeamManagementImpl implements TeamManagement {

  private Command commandEnums;
  private Person person;
  private Team team;
  private TeamRepository teamRepository;
  private PersonRepository personRepository;
  private DisplayFull displayFull;

  @Override
  public void sendCommand(String command) {
    Command command1 = Command.valueOf(command);
    switch (command1) {
      case CREATE_PERSON:
        createPerson(person);
        break;
      case CREATE_TEAM:
        createTeam(team);
        break;
      case DISPLAY_PERSON:
        viewDisplayPerson(person);
        break;
      case DISPLAY_TEAM:
        viewDisplayTeam(team);
        break;
      case DISPLAY_FULL:
        viewDisplayFull(displayFull);
        break;
    }
  }

  private void viewDisplayFull(DisplayFull displayFull) {
    List<Team> teamList = displayFull.getDisplayTeam().getTeamList();
    for (Team value : teamList) {
      viewDisplayTeam(value);
    }
  }

  private void viewDisplayTeam(Team team) {
    System.out.print("Squadra: " + team.getName() + "\n Players: \n\t" + team.getPlayer());
  }

  private void viewDisplayPerson(Person person) {
    System.out.print("Player: " + person.getName() + "\n team: " + person.getTeam());
  }

  private void createTeam(Team team) {
    Optional<Team> teamOptional = teamRepository.findById(team.getName());
    if (teamOptional.isPresent()) {
      System.out.println("Team già presente");
    } else {
      Team newTeam = new Team(team.getName(), team.getPlayer());
    }
  }

  private void createPerson(Person person) {
    Optional<Person> personOptional = personRepository.findById(person.getName());
    if (personOptional.isPresent()) {
      if (personOptional.get().getTeam() == person.getTeam()) {
        System.out.println("Giocatore già presente in questa squadra");
      }else {
        Person newPerson = new Person(person.getName(), person.getTeam());
      }
    }
  }
}
