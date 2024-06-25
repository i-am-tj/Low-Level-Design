package strategies.entitygenerationstrategy;

import models.Board;
import models.Cell;
import models.GameEntity;
import models.GameEntityType;

import java.util.*;

public class EasyGameEntityGenerationStrategy implements GameEntityGenerationStrategy {
    @Override
    public List<Pair> generateEntities() {
        Set<Integer> set = new HashSet<>();
        //Generate 3 numbers from 3 to 48
        int min1 = 3;
        int max1 = 48;
        while(set.size() != 3) {
            set.add(new Random().nextInt(max1 - min1) + 3);
        }
        //Generate 53 numbers from 95
        int min2 = 53;
        int max2 = 95;
        while(set.size() != 6) {
            set.add(50 + new Random().nextInt(max2 - min2) + 1);
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
