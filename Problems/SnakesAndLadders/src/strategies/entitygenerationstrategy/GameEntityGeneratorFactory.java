package strategies.entitygenerationstrategy;

import models.GameEntityDifficultyLevel;

public class GameEntityGeneratorFactory {
    public static GameEntityGenerationStrategy getEntityDifficultyGenerator(GameEntityDifficultyLevel botDifficultyLevel) {
        return switch (botDifficultyLevel) {
            case EASY -> new EasyGameEntityGenerationStrategy();
            case MEDIUM -> new MediumGameEntityGenerationStrategy();
            case HARD -> new HardGameEntityGenerationStrategy();
        };
    }
}
