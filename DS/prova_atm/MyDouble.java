class MyDouble {
    public static boolean tryParse(String num) {
        try {
            Double.valueOf(num);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}