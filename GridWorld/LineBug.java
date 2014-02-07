import info.gridworld.actor.Bug;

/**
 * This bug traces a line segment of a given length and then removes itself.
 */
public class LineBug extends Bug
{
    private int length;
    
    /**
     * Constructs a line bug with a given length
     * @param aLength the length of the line segment that this bug traces
     */
    public LineBug(int aLength)
    {
        length = aLength;
    }
    
    public void act()
    {
        if (length > 0) 
        {
            move();
            length--;
        }        
        else 
            removeSelfFromGrid();
    }
}
