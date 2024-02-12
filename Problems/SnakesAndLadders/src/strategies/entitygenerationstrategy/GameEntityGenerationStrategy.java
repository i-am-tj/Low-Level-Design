package strategies.entitygenerationstrategy;

import models.Board;
import models.Cell;
import models.GameEntity;

import java.util.List;
import java.util.Map;

public interface GameEntityGenerationStrategy {
    List<Map<GameEntity, Cell>> generateEntities(Board board);
}
