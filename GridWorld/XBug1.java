import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;


public class XBug1 extends Bug
{
    private int length;
    
    public XBug1(int aLength)
    {
        length = aLength;
    }
    
    public void act()
    {
        Grid<Actor> gr = getGrid();
        Location loc = getLocation();
        int dir = Location.NORTHEAST;
        for (int i = 0; i < 4; i++)
        {
            LineBug lbug = new LineBug(length);
            lbug.setDirection(dir);
            lbug.putSelfInGrid(gr, loc.getAdjacentLocation(dir));
            dir += Location.RIGHT;
        }
        removeSelfFromGrid();
    }
}
