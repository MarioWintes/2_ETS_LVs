package lv1_interfaces;

public class HighScore implements Comparable<HighScore>{

    private String name;
    private double score;

    public HighScore(String name, double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(HighScore o) {
        if (this.score < o.score){
            return -1;
        }
        if (this.score > o.score){
            return 1;
        }else {
            return 0;
        }
        //return this.name.compareTo(o.name); // Bei String!
        //return o.name.compareTo(this.name); // Bei String, absteigend!
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "HighScore{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
