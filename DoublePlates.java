//==============================================================================================\\
//=11/20/2015                                                                   Alexander Alava=\\
//=DoublePlates.java                                                              Isaac Roberts=\\
//=                                                                                            =\\
//=  This is one of the classes defining a specific type of snowflake and its characteristics  =\\
//==============================================================================================\\

public class DoublePlates extends SnowFlake
{
   public DoublePlates()
   {
      setType(28);
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