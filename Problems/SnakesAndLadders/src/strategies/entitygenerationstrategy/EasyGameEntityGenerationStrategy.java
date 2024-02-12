package strategies.entitygenerationstrategy;

import models.Board;
import models.Cell;
import models.GameEntity;
import models.GameEntityType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EasyGameEntityGenerationStrategy implements GameEntityGenerationStrategy {
    static List<Map<GameEntity, Cell>> entityCellMap;
    @Override
    public List<Map<GameEntity, Cell>> generateEntities(Board board) {
        //1. Consider 2 entities - Snake and Ladder and generate for each
        //1.1. For ladder

        //1.2. For snake
        return entityCellMap;
    }
}
