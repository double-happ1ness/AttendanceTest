package attendancetest;

import java.text.DecimalFormat;
import java.util.Arrays;

public class AttendanceTest {

    public static void main(String[] args) {
        // values hard-coded to facilitate testing
        final Integer CLASS_SIZE = 15;
        Integer[] attendances = {10, 14, 12, 9, 11, 15, 12, 13, 8, 14};
        double[] doubleArray = new double[attendances.length];
//        String ClassDetails=String.format("%-10s%10s\n","WEEK NO.","ATTENDANCE(%)");
//        double attendancePercentage=0;
        for (int i = 0; i < attendances.length; i++) {
            doubleArray[i] = (double) attendances[i];
        }
        for (int i = 0; i < doubleArray.length; i++) {
//            attendancePercentage=(double)(doubleArray[i]*100)/CLASS_SIZE;
//            ClassDetails+=String.format("%-10s%10.2f\n",i+1,attendancePercentage);
//            DecimalFormat df = new DecimalFormat("0.00");
//            Arrays.stream(doubleArray).forEach(e -> System.out.print(df.format(e) + " "));
            System.out.println((doubleArray[i] / CLASS_SIZE) * 100);
        };

    }

//    public static double[][] formatArray(double[][] doubleArray) {
//
//        double[][] newArray = new double[doubleArray.length][doubleArray[0].length];
//        for (int i = 0; i < doubleArray.length; i++) {
//            for (int y = 0; y < doubleArray[0].length; y++) {
//                newArray[i][y] = (double) Math.round(doubleArray[i][y] * 10000) / 10000;
//            }
//        }
//        return newArray;
//
//    }
}
