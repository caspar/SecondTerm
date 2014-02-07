import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class XBug1Runner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        XBug1 xman = new XBug1(3);
        world.add(new Location(5, 5), xman);
        world.show();
    }
}
