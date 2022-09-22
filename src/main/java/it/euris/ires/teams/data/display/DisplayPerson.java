package it.euris.ires.teams.data.display;

import it.euris.ires.teams.data.model.Person;
import java.util.List;
import lombok.Data;

@Data
public class DisplayPerson {

  private List<Person> personList;

  public DisplayPerson(List<Person> personList) {
    this.personList = personList;
  }

}
