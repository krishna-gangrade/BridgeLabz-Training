package Day_13.HackerRank_based_codebase.Enums;

public class Main {
    public static void main(String[] args) {

        for (TrafficLight light :TrafficLight.values()) {
            System.out.println(
                    "Light: "+light.name()+ ", Duration: "+light.getDuration()+" seconds");
        }
    }
}
