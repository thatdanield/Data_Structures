import kareltherobot.*;
public class Driver
{
    public static void main(String[] args)
    {
        World.setVisible(true);
        //World.reset();
        World.readWorld("BreadCrumbs");
        World.setDelay(10);
        World.setTrace(false);
        try {Thread.sleep(3000); } catch (Exception e){};

        BreadCrumbFollower gretel = new BreadCrumbFollower(1,1,Directions.East,0);
        gretel.travel();
        gretel.turnOff();
    }
}
