package strategies.entitygenerationstrategy;

import models.Board;
import models.Cell;
import models.GameEntity;
import models.GameEntityType;

import java.util.*;

public class EasyGameEntityGenerationStrategy implements GameEntityGenerationStrategy {
    @Override
    public List<Pair> generateEntities() {
        // Generate 6 random number set from 5 to 95
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        int min = 5;
        int max = 95;
        while(set.size() != 6) {
            set.add(new Random().nextInt(max - min) + 1);
        }
        List<Integer> combinations = new ArrayList<>(set);
        Collections.sort(combinations);
        List<Pair> pairs = new ArrayList<>();
        int i = 0;
        int j = 3;
        while(j < 6) {
            pairs.add(new Pair(combinations.get(i), combinations.get(j)));
            i++;
            j++;
        }
        return pairs;
    }
}
