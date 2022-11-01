public class Triangle {
    byte a;
    byte b;
    byte c;

    public void area(){
      double p=(a+b+c)/2;
      double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Area: "+s);

    }
}
