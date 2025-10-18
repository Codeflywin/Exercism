public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }
    public int remainingMinutesInOven(int MinutesInOven){
        return expectedMinutesInOven() - MinutesInOven;
    }

    public int preparationTimeInMinutes( int layers){
        return layers * 2;
    }
    public int totalTimeInMinutes (int layers, int MinutesInOven){
        return preparationTimeInMinutes(layers) + MinutesInOven;
    }
}
