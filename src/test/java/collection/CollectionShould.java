package collection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

public class CollectionShould {

    @Test
    void should_be_created_easily_and_be_immutable() {
        Set<Integer> newSet = Set.of(1, 2, 3); // From Java 9 (Immutable) (Not null acceptable)
        // newSet.add(5); // Doesn't work because of Immutability
        Set<Integer> oldSet = new HashSet<>(); // Until Java 8
        oldSet.add(1);
        oldSet.add(2);
        oldSet.add(3);

        assertThat(newSet).isEqualTo(oldSet);

        Map<String, Integer> newMap = Map.of("Key 1", 1, "Key 2", 2); // (Not duplicated key acceptable)

        List<Integer> newList = List.of(1, 2, 3);
    }
}
