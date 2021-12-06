public class Return_type {

   protected void show()
    {
        System.out.println("5");

    }
}
class boy extends Return_type
{
    public void show()
    {
        System.out.println("8");
    }

    public static void main(String[] args) {
        {
            Return_type t = new Return_type();
            t.show();

            boy ob= new boy();
            ob.show();
        }
    }
}