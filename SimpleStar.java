//==============================================================================================\\
//=11/20/2015                                                                   Alexander Alava=\\
//=SimpleStar.java                                                                Isaac Roberts=\\
//=                                                                                            =\\
//=  This is one of the classes defining a specific type of snowflake and its characteristics  =\\
//==============================================================================================\\

public class SimpleStar extends SnowFlake {

   public SimpleStar()
   {
      setType(21);
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
