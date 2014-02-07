import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;


public class XBug2 extends Bug
{
    private int length; // the length of each of the arms of the X
    private int steps; // the number of times the act method has been called
    private Location bottomLeft; // the location of the bottom left end of the X
    private Location bottomRight; // the location of the bottom right end of the X
    
    public XBug2(int aLength)
    {
        length = aLength;
        steps = 0;
    }
        
    public void putSelfInGrid(Grid<Actor> gr, Location loc)
    {
        super.putSelfInGrid(gr, loc);
        bottomLeft = new Location(loc.getRow() + length, loc.getCol() - length);
        bottomRight = new Location(loc.getRow() + length, loc.getCol() + length);
    }

    public void act()
    {
        if (steps == 0)
        {
            setDirection(Location.NORTHEAST);
        }        
        else if (steps == length + 1)
        {
            moveTo(bottomRight);
            setDirection(Location.NORTHWEST);
        }
        else if (steps == 3 * length + 2)
        {
            moveTo(bottomLeft);
            setDirection(Location.NORTHEAST);
        }
        else if (steps >= 4 * length + 2)
            removeSelfFromGrid();
        move();
        steps++;
    }
}
