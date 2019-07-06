package ladder.model;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Players {

  private final List<Player> players;

  public Players(List<Player> players) {
    this.players = Collections.unmodifiableList(players);
  }


  public static Players of(List<String> names) {
    int count = names.size();
    List<Player> players = IntStream.range(0, count)
            .mapToObj(index -> new Player(names.get(index), index))
            .collect(toList());

    return new Players(players);
  }

  public int size() {
    return this.players.size();
  }
}
