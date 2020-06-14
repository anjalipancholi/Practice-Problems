package array;

public class DistanceBetweenBusStops {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        int sum = 0;
        int sums = 0;

        int i = start;
        while (i != destination) {


            sum += distance[i];
            i = (i + 1) % (distance.length);

        }


        int j = start;
        while (j != destination) {
            if (j == 0)
                j = distance.length - 1;
            else
                j = (j - 1) % distance.length;


            sums += distance[j];

        }


        return (Math.min(sum, sums));
    }
}
