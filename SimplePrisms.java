//==============================================================================================\\
//=11/20/2015                                                                   Alexander Alava=\\
//=SimplePrisms.java                                                              Isaac Roberts=\\
//=                                                                                            =\\
//=  This is one of the classes defining a specific type of snowflake and its characteristics  =\\
//==============================================================================================\\

public class SimplePrisms extends SnowFlake
{
   public SimplePrisms()
   {
      setType(1);
      setDiameter((gen.nextDouble()*2+6));
      setRadius();
   }

   void melt()
   {
      double d = getDiameter();
      int t = getType();
      d -= (d / (t+meltModifier));

      setDiameter(d);
      setRadius();
   }
}   