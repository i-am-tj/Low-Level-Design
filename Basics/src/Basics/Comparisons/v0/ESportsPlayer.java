package Basics.Comparisons.v0;

public class ESportsPlayer implements Comparable<ESportsPlayer> {
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


    @Override
    public int compareTo(ESportsPlayer o) {
        int rankComparison = Integer.compare(this.getGlobalRanking(), o.getGlobalRanking());
        // Basically it can return -ve, 0 or +ve at this point
        // With -ve denoting o1 less than o2, 0 meaning equal, +ve denoting o1 greater than o2
        if(rankComparison != 0) return rankComparison;
        int nameComparison = this.getName().compareTo(o.getName());
        if(nameComparison != 0) return nameComparison;
        return Integer.compare(o.getAge(), this.getAge());
    }
}
