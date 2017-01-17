//==============================================================================================\\
//=11/20/2015                                                                   Alexander Alava=\\
//=SplitPlatesAndStars.java                                                       Isaac Roberts=\\
//=                                                                                            =\\
//=  This is one of the classes defining a specific type of snowflake and its characteristics  =\\
//==============================================================================================\\

public class SplitPlatesAndStars extends SnowFlake
{
   public SplitPlatesAndStars()
   {
      setType(14);
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