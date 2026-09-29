public class OrderUtils {

    public double calculateAverage(int[] scores) {
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        return (double) total / scores.length;
    }

    public double calculateAverageSafe(int[] scores) {
        if (scores == null || scores.length == 0) {
            return 0.0;
        }
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        return (double) total / scores.length;
    }

}
