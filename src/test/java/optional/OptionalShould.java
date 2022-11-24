package optional;

import football.player.Player;
import helper.PlayerTestHelper;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

public class OptionalShould {

    @Test
    void be_able_to_create_stream() {
        List<Player> players = new PlayerTestHelper().getPlayers();

        long count = Optional.ofNullable(players).stream()
                .flatMap(Collection::stream)
                .map(Player::getName)
                .count();

        assertThat(count).isEqualTo(5);
    }
}
