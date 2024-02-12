package strategies.entitygenerationstrategy;

import models.Board;
import models.Cell;
import models.GameEntity;

import java.util.*;

public class MediumGameEntityGenerationStrategy implements GameEntityGenerationStrategy{
    @Override
    public List<Pair> generateEntities() {
        // Generate 8 random number set from 5 to 95
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        int min = 5;
        int max = 95;
        while(set.size() != 8) {
            set.add(new Random().nextInt(max - min) + 1);
        }
        List<Integer> combinations = new ArrayList<>(set);
        Collections.sort(combinations);
        List<Pair> pairs = new ArrayList<>();
        int i = 0;
        int j = 7;
        while(i < j) {
            pairs.add(new Pair(combinations.get(i), combinations.get(j)));
            i++;
            j--;
        }
        return pairs;
    }
}
