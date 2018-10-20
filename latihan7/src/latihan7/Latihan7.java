/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan7;

/**
 *
 * @author Andy Sampurno
 */
public class Latihan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] data;
        data = new double[4][6];

        int i = 45, j = 45, x, y;
        for (x = 0; x < 4; x++) {
            data[x][0] = i;
            data[x][1] = j;

            data[x][2] = (Math.sin(Math.toRadians(data[x][0])) * Math.cos(Math.toRadians(data[x][1])));
            data[x][3] = (Math.cos(Math.toRadians(data[x][0])) * Math.sin(Math.toRadians(data[x][1])));
            data[x][4] = (Math.sin(Math.toRadians(data[x][0])) * Math.sin(Math.toRadians(data[x][0])));
            data[x][5] = (Math.cos(Math.toRadians(data[x][0])) * Math.cos(Math.toRadians(data[x][1])));

            i += 90;
            j += 90;
        }
        System.out.println();

        System.out.println("X \t" + "Y \t" + " Sin(x)*Cos(y) \t" + "Cos(x)*Sin(y)\t" + "Sin(x)*Sin(x)\t" + "Cos(x)*Cos(y)");
        System.out.println("=============================================================================");

        for (x = 0; x < 4; x++) {
            for (y = 0; y < 6; y++) {
                if (y < 2) {
                    System.out.print(Math.round(data[x][y]) + "\t");
                } else {
                    double hasil = Math.floor(data[x][y] * 100) / 100;
                    System.out.print(hasil+"\t\t");
                }
            }
            System.out.println();
        }
    }

}
