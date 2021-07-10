/*  COMP2230 
    c3320409
    Hotspots class */

public class hotspot 
{
    // attributes
    int hotspotId;
    float x, y;
    hotspot next;
    hotspot previous;

    
    public hotspot(int hotspotId, float x, float y) 
    {
        this.hotspotId = hotspotId;
        this.x = x;
        this.y = y;
        this.next = null;
        this.previous = null;
    }

    // accessors
    public int gethotspotId() 
    {
        return this.hotspotId;
    }

    public float getx() 
    {
        return this.x;
    }

    public float gety() 
    {
        return this.y;
    }

    public hotspot getNext() 
    {
        return this.next;
    }

    public hotspot getPrevious() 
    {
        return this.previous;
    }

    // mutators
    public void setNext(final hotspot d) 
    {
        this.next = d;
    }

    public void setPrevious(final hotspot h)
    {
        this.previous = h;
    }
}