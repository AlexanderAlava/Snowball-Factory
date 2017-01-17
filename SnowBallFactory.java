//=============================================================================================\\
//=11/20/2015                                                                  Alexander Alava=\\
//=SnowBallFactory.java                                                          Isaac Roberts=\\
//=                                                                                           =\\
//= This program is the driver class of SnowFlake.java and it simulates the creation of three =\\
//=  snowballs with specific sizes requested by the user and using different types of flakes  =\\
//=============================================================================================\\

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SnowBallFactory
{
    static Random gen = new Random(System.currentTimeMillis());
    static NumberFormat fmt = new DecimalFormat("#.##");
    static double snowFall;
    static final double PI = 3.14159265359;

    public static void main(String[] args)
    {

        ArrayList<SnowFlake> snowBall = new ArrayList<SnowFlake>();
        Scanner input = new Scanner(System.in);

        System.out.println("Snow Ball Factory up and running.");

        int balls = 3;

        for(int j = 0; j < balls; j++)
        {
            System.out.print("\nEnter desired size of snowball to be created (in mm): ");
            double desiredSize = input.nextDouble();

            //Snowball creation
            createSnowBall(desiredSize, 0, snowBall);


            //Snow ball analysis\\
            double size = 0.0;
            double area = 0.0;
            double areaTotal = 0.0;

            for (SnowFlake s : snowBall)
            {
                size += s.getDiameter();
                area = (s.getRadius()*s.getRadius())*PI;
                areaTotal += area;

            }
            System.out.println("Target size: " + desiredSize + "mm.");
            System.out.println("Actual Size: " + fmt.format(size) + "mm.");
            System.out.println("Number of snowflakes: " + snowBall.size() + ".");
            System.out.println("Average area of snowflake: " + fmt.format(areaTotal/snowBall.size()) + "mm^2.");

            //How long to melt?\\
            int minutes = 0;
            while (!snowBall.isEmpty())
            {
                for (SnowFlake s : snowBall)
                {
                    s.melt();
                }
                for (int i = snowBall.size() - 1; i >= 0; i--)
                {
                    if (snowBall.get(i).getDiameter() < 1.0)
                    {
                        snowBall.remove(i);
                    }
                }
                minutes++;
            }
            System.out.println("It took " + minutes + " minutes to melt the snowball.");
        }

        System.out.println("\nSnowfall total: " + fmt.format((snowFall-balls)) + " snowflakes.");
        //Thanking the user for using the program and printing credits\\
        System.out.println("\nThank you for using this program!");
        System.out.println("Have a happy holidays!");
        System.out.println("\n------------------------------------------------------------");
        System.out.println("|   Program developed by Alexander Alava & Isaac Roberts   |");
        System.out.println("|     Created for The COP Snowball Factory Association     |");
        System.out.println("------------------------------------------------------------");
        input.close();
    }

    public static void createSnowBall(double desiredSize, double currentSize, ArrayList<SnowFlake> ball){
        //Recursively calling createSnowBall\\
        double targetSize = desiredSize;
        double presentSize = currentSize;
        snowFall++;
        if (targetSize > presentSize)
        {
            SnowFlake flake = createSnowFlake();
            //System.out.println(flake.toString()); // for testing, uncomment to see individual stats
            presentSize += flake.getDiameter();
            ball.add(flake);
            createSnowBall(targetSize, presentSize, ball);
        }
    }

    private static SnowFlake createSnowFlake()
    {
        //Switch case established to match through the generator a specific type of snowflake\\
        int type = gen.nextInt(35) +1;
        switch(type){
            case(1):
                return new SimplePrisms();
            case(2):
                return new SolidColumns();
            case(3):
                return new Sheaths();
            case(4):
                return new ScrollsOnPlates();
            case(5):
                return new TriangularForms();
            case(6):
                return new HexagonalPlates();
            case(7):
                return new HollowColumns();
            case(8):
                return new Cups();
            case(9):
                return new ColumnsOnPlates();
            case(10):
                return new TwelveBranchedStar();
            case(11):
                return new StellarPlates();
            case(12):
                return new BulletRosettes();
            case(13):
                return new CappedColumns();
            case(14):
                return new SplitPlatesAndStars();
            case(15):
                return new RadiatingPlates();
            case(16):
                return new SectoredPlates();
            case(17):
                return new IsolatedBullets();
            case(18):
                return new MultiplyCappedColumns();
            case(19):
                return new SkeletalForms();
            case(20):
                return new RadiatingDendrites();
            case(21):
                return new SimpleStar();
            case(22):
                return new SimpleNeedles();
            case(23):
                return new CappedBullets();
            case(24):
                return new TwinColumns();
            case(25):
                return new Irregulars();
            case(26):
                return new StellarDendrites();
            case(27):
                return new NeedleClusters();
            case(28):
                return new DoublePlates();
            case(29):
                return new  ArrowheadTwins();
            case(30):
                return new Rimed();
            case(31):
                return new FernlikeStellarDendrites();
            case(32):
                return new CrossedNeedles();
            case(33):
                return new HollowPlates();
            case(34):
                return new CrossedPlates();
            case(35):
                return new Graupel();
        }
        return null;
    }
}