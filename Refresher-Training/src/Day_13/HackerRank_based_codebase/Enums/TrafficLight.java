package Day_13.HackerRank_based_codebase.Enums;

public enum TrafficLight {
    RED(30),
    YELLOW(5),
    GREEN(25);

    private int duration;

    TrafficLight(int duration){
        this.duration = duration;
    }

    public int getDuration(){
        return duration;
    }
}
