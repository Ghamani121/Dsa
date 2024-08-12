package JavaNptel;

public class Objects
{
    private String name;
    Objects(String name)
    {
        this.name=name;
        System.out.println("hi");
    }

    public static void main(String[] args) {
        //create a new object
        Objects ob= new Objects();
        ob.name="ghamani";
    }

}

