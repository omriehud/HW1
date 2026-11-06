public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        boolean isPositive = false;
        double series = 1;
        double num;
        for (int i = 1; i < Integer.parseInt(args[0]); i++) {
            if (isPositive) 
                num = (double) 1 / (1 + 2 * i);
            else 
                num = (double) -1 / (1 + 2 * i);
            //System.out.println("series: " + series + " + " + num);
            series += num;
            //System.out.println(series);
            isPositive = !isPositive;
        }
        approxPi = 4 * series;
        System.out.println(approxPi + " " + actualPi);
    }
}
