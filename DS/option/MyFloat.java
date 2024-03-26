public class MyFloat {
    public static float tryParse(String x) {
        try {
            return Float.parseFloat(x);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
