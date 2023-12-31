package week_04.assignments;

import java.util.Scanner;

public class Question_04_03 {
    public static void main(String[] args) {

        final double AVERAGE_EARTH_RADIUS = 6371.01;


        Scanner input = new Scanner(System.in);
        //Atlanta, Georgia x :   33.7489954
        //Atlanta, Georgia y :  -84.3879824
        //Orlando, Florida x :   28.5383355
        //Orlando, Florida y : -81.3792364999
        //Savannah, Georgia x :  32.0835407
        //Savannah, Georgia y : -81.09983419999998
        //Charlotte, North Carolina x :   35.2270869
        //Charlotte, North Carolina y : -80.84312669999997


        double xOfAtlantaGeorgiaAsRadians = Math.toRadians(33.7489954);

        double yOfAtlantaGeorgiaAsRadians = Math.toRadians(-84.3879824);

        double xOfOrlandoFloridaAsRadians = Math.toRadians(28.5383355);

        double yOfOrlandoFloridaAsRadians = Math.toRadians(-81.3792364999);

        double xOfSavannahGeorgiaAsRadians = Math.toRadians(32.0835407);

        double yOfSavannahGeorgiaAsRadians = Math.toRadians(-81.09983419999998);

        double xOfCharlotteNorthCarolinaAsRadians = Math.toRadians(35.2270869);

        double yOfCharlotteNorthCarolinaAsRadians = Math.toRadians(-80.84312669999997);


        double distanceBetweenSavannahCharlotte = AVERAGE_EARTH_RADIUS * Math.acos(Math.sin(xOfSavannahGeorgiaAsRadians)
                * Math.sin(xOfCharlotteNorthCarolinaAsRadians)
                + Math.cos(xOfSavannahGeorgiaAsRadians)
                * Math.cos(xOfCharlotteNorthCarolinaAsRadians)
                * Math.cos(yOfSavannahGeorgiaAsRadians - yOfCharlotteNorthCarolinaAsRadians));

        double distanceBetweenCharlotteAtlanta = AVERAGE_EARTH_RADIUS * Math.acos(Math.sin(xOfCharlotteNorthCarolinaAsRadians)
                * Math.sin(xOfAtlantaGeorgiaAsRadians)
                + Math.cos(xOfCharlotteNorthCarolinaAsRadians)
                * Math.cos(xOfAtlantaGeorgiaAsRadians)
                * Math.cos(yOfCharlotteNorthCarolinaAsRadians - yOfAtlantaGeorgiaAsRadians));

        double distanceBetweenAtlantaOrlando = AVERAGE_EARTH_RADIUS * Math.acos(Math.sin(xOfAtlantaGeorgiaAsRadians)
                * Math.sin(xOfOrlandoFloridaAsRadians)
                + Math.cos(xOfAtlantaGeorgiaAsRadians)
                * Math.cos(xOfOrlandoFloridaAsRadians)
                * Math.cos(yOfAtlantaGeorgiaAsRadians - yOfOrlandoFloridaAsRadians));

        double distanceBetweenOrlandoSavannah = AVERAGE_EARTH_RADIUS * Math.acos(Math.sin(xOfOrlandoFloridaAsRadians)
                * Math.sin(xOfSavannahGeorgiaAsRadians)
                + Math.cos(xOfOrlandoFloridaAsRadians)
                * Math.cos(xOfSavannahGeorgiaAsRadians)
                * Math.cos(yOfOrlandoFloridaAsRadians - yOfSavannahGeorgiaAsRadians));

        double distanaceBetweenSavannahAtlanta = AVERAGE_EARTH_RADIUS * Math.acos(Math.sin(xOfSavannahGeorgiaAsRadians)
                * Math.sin(xOfAtlantaGeorgiaAsRadians)
                + Math.cos(xOfSavannahGeorgiaAsRadians)
                * Math.cos(xOfAtlantaGeorgiaAsRadians)
                * Math.cos(yOfSavannahGeorgiaAsRadians - yOfAtlantaGeorgiaAsRadians));


        double sOfSavannahCharlotteAtlantaTriangle = (distanceBetweenSavannahCharlotte + distanceBetweenCharlotteAtlanta + distanaceBetweenSavannahAtlanta) / 2;
        double sOfAtlantaOrlandoSavannahTriangle = (distanceBetweenAtlantaOrlando + distanceBetweenOrlandoSavannah + distanaceBetweenSavannahAtlanta) / 2;


        double areaOfSavannahCharlotteAtlantaTriangle = Math.sqrt(sOfSavannahCharlotteAtlantaTriangle
                * (sOfSavannahCharlotteAtlantaTriangle - distanceBetweenSavannahCharlotte)
                * (sOfSavannahCharlotteAtlantaTriangle - distanceBetweenCharlotteAtlanta)
                * (sOfSavannahCharlotteAtlantaTriangle - distanaceBetweenSavannahAtlanta));


        double areaOfAtlantaOrlandoSavannahTriangle = Math.sqrt(sOfAtlantaOrlandoSavannahTriangle
                * (sOfAtlantaOrlandoSavannahTriangle - distanceBetweenAtlantaOrlando)
                * (sOfAtlantaOrlandoSavannahTriangle - distanceBetweenOrlandoSavannah)
                * (sOfAtlantaOrlandoSavannahTriangle - distanaceBetweenSavannahAtlanta));


        double totalArea = areaOfSavannahCharlotteAtlantaTriangle + areaOfAtlantaOrlandoSavannahTriangle;

        System.out.println("Estimated area enclosed by these four cities : " + totalArea);


    }
}
