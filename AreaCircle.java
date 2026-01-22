public class AreaCircle
{
   public static void main(String[] args)
   {
         //A=pi*r^2
      double radius = 5.43;
      
      double area = Math.PI * Math.pow(radius, 2.0);
      
      System.out.println("The radius of the circle is " + radius + 
         ", so the area of the circle is " + area + " square units.");
   }
}