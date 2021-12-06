class Arif {

    void show()
    {
        System.out.println("1");
    }

}
class Samar
{
    void show()
    {
        System.out.println("2");
    }

    public static void main(String[] args) {
        {
            Arif t = new Arif();
            t.show();
            Samar x = new Samar();
            x.show();
        }
    }
}
