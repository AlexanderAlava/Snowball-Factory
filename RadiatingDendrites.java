//==============================================================================================\\
//=11/20/2015                                                                   Alexander Alava=\\
//=RadiatingDendrites.java                                                        Isaac Roberts=\\
//=                                                                                            =\\
//=  This is one of the classes defining a specific type of snowflake and its characteristics  =\\
//==============================================================================================\\

public class RadiatingDendrites extends SnowFlake
{
   public RadiatingDendrites()
   {
      setType(20);
      setDiameter((gen.nextDouble()*2+6));
      setRadius();
   }

   void melt()
   {
      // toString test can go here

      double d = getDiameter();
      int t = getType();
      d -= (d / (t+meltModifier));

      setDiameter(d);
      setRadius();

   }
} 