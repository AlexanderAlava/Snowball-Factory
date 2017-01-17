//==============================================================================================\\
//=11/20/2015                                                                    AlexanderAlava=\\
//=SnowFlake.java                                                                 Isaac Roberts=\\
//=                                                                                            =\\
//=  This program is an abstract class that defines some of the methods that will be used by   =\\
//=  SnowBallFactory.java and also by all the snow flakes classes, including the melt method   =\\
//==============================================================================================\\ 

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public abstract class SnowFlake
{
    //Declaring variables and a NumberFormat object\\
    private int type;
    private double diameter;
    private double radius;

    static final double meltModifier = 0.05;
    static double snowFall;
    static Random gen = SnowBallFactory.gen;
    static NumberFormat fmt = new DecimalFormat("#.####");

    //Getters\\
    public int getType()
    {
        return type;
    }
    public double getDiameter()
    {
        return diameter;
    }
    public double getRadius()
    {
        return radius;
    } 
    
    //Setters\\
    public void setType(int t)
    {
        type = t;
    }
    public void setDiameter(double d)
    {
        diameter = d;
    }
    public void setRadius()
    {
        radius = diameter/2;
    }

    //toString method\\
    public String toString()
    {
        return "Type: " + type
                + "\nDiameter: " + fmt.format(diameter)
                + "\nRadius: " + fmt.format(radius);
    }

    //Abstract melt method without a body that will be defined in each snow flake class\\
    abstract void melt();

}
