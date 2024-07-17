package Basics.Comparisons.v1;

import java.util.Comparator;

public class ESportsPlayer {
    private String name;
    private int age;
    private int globalRanking;

    public ESportsPlayer(String name, int age, int globalRanking) {
        this.name = name;
        this.age = age;
        this.globalRanking = globalRanking;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGlobalRanking() {
        return globalRanking;
    }

    // Comparators
    public static final Comparator<ESportsPlayer> COMPARE_BY_NAME = Comparator.comparing(ESportsPlayer::getName);
    public static final Comparator<ESportsPlayer> COMPARE_BY_NAME_DESC = Comparator.comparing(ESportsPlayer::getName).reversed();
    public static final Comparator<ESportsPlayer> COMPARE_BY_AGE = Comparator.comparing(ESportsPlayer::getAge);
    public static final Comparator<ESportsPlayer> COMPARE_BY_AGE_DESC = Comparator.comparing(ESportsPlayer::getAge).reversed();
    public static final Comparator<ESportsPlayer> COMPARE_BY_GLOBAL_RANKING = Comparator.comparing(ESportsPlayer::getGlobalRanking);
    public static final Comparator<ESportsPlayer> COMPARE_BY_GLOBAL_RANKING_DESC = Comparator.comparing(ESportsPlayer::getGlobalRanking).reversed();

    //Comparator chaining [IMPORTANT NOTE: USE REVERSED INSIDE THEN BLOCK TO AVOID BUGS]
    public static final Comparator<ESportsPlayer> COMPARE_BY_RANK_THEN_NAME = Comparator.comparing(ESportsPlayer::getGlobalRanking).thenComparing(ESportsPlayer::getName);
    public static final Comparator<ESportsPlayer> COMPARE_BY_RANK_THEN_NAME_DESC = Comparator.comparing(ESportsPlayer::getGlobalRanking).thenComparing(Comparator.comparing(ESportsPlayer::getName).reversed());
    public static final Comparator<ESportsPlayer> COMPARE_BY_RANK_THEN_AGE = Comparator.comparing(ESportsPlayer::getGlobalRanking).thenComparing(ESportsPlayer::getAge);
    public static final Comparator<ESportsPlayer> COMPARE_BY_RANK_THEN_AGE_DESC = Comparator.comparing(ESportsPlayer::getGlobalRanking).thenComparing(Comparator.comparingInt(ESportsPlayer::getAge).reversed());

    // Comparator chaining of more than 1 [ANOTHER IMPORTANT NOTE: THE FIRST CHAIN REVERSED SHOULD BE OUTSIDE THE BLOCK]
    public static final Comparator<ESportsPlayer> COMPARE_BY_RANK_THEN_NAME_THEN_AGE =
            Comparator.comparing(ESportsPlayer::getGlobalRanking).thenComparing(ESportsPlayer::getName).thenComparing(ESportsPlayer::getAge);
    public static final Comparator<ESportsPlayer> COMPARE_BY_RANK_THEN_NAME_THEN_AGE_DESC =
            Comparator.comparing(ESportsPlayer::getGlobalRanking).thenComparing(ESportsPlayer::getName).thenComparing(Comparator.comparingInt(ESportsPlayer::getAge).reversed());
    public static final Comparator<ESportsPlayer> COMPARE_BY_RANK_THEN_NAME_DESC_THEN_AGE =
            Comparator.comparing(ESportsPlayer::getGlobalRanking).thenComparing(Comparator.comparing(ESportsPlayer::getName).reversed()).thenComparing(ESportsPlayer::getAge);
    public static final Comparator<ESportsPlayer> COMPARE_BY_RANK_THEN_NAME_DESC_THEN_AGE_DESC =
            Comparator.comparing(ESportsPlayer::getGlobalRanking).thenComparing(Comparator.comparing(ESportsPlayer::getName).reversed()).thenComparing(Comparator.comparingInt(ESportsPlayer::getAge).reversed());
    public static final Comparator<ESportsPlayer> COMPARE_BY_RANK_DESC_THEN_NAME_DESC_THEN_AGE_DESC =
            Comparator.comparingInt(ESportsPlayer::getGlobalRanking).reversed().thenComparing(Comparator.comparing(ESportsPlayer::getName).reversed()).thenComparing(Comparator.comparingInt(ESportsPlayer::getAge).reversed());
}
