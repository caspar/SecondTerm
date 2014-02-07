import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class XBug2Runner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        XBug2 xman = new XBug2(3);
        world.add(new Location(5, 5), xman);
        world.show();
    }
}
