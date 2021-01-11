package area;

public class areaRecCir
{
    public int Area(int l, int b)
    {
        return l * b;
    }

    public float Area(float r)
    {
        return (float) (3.14 * r * r);
    }
    public static void main(String[] args) {
        areaRecCir obj = new areaRecCir();
        System.out.println(obj.Area(5, 4));
        System.out.println(obj.Area(3));
        
    }
}