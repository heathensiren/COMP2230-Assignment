/*  COMP2230 
    c3320409
    Edges class */

public class edges 
{
    // attributes
    private int src;
    private int dest;
    private double weight;      // distance and weight are the same in this program

    // constructors
    public edges()
    {
        this.src = 0;
        this.dest = 0;
        this.weight = 0;
    }
    public edges(final int s, final int d, final double w) 
    {
        this.src = s;
        this.dest = d;
        this.weight = w;
    }

    // acessors
    public int getSrc() 
    {
        return this.src;
    }

    public int getDest() 
    {
        return this.dest;
    }

    public double getWeight() 
    {
        return this.weight;
    }

    // mutators
    public void setSrc(final int s) 
    {
        this.src = s;
    }

    public void setDest(final int d) 
    {
        this.dest = d;
    }

    public void setWeight(final double w) 
    {
        this.weight = w;
    }

    // methods
    public void printer() 
    {
        System.out.println("NODE(" + this.src + ") -> NODE(" + this.dest + "): " + this.weight);
    }

    int find(final subset subsets[], final int i) // find set element of i
    {
        // find root and make root as parent of i (path compression) 
        if(subsets[i].parent != i)
        {
            subsets[i].parent = find(subsets, subsets[i].parent);
        }
        return subsets[i].parent;
    }

}

// mst joining
class subset
{
    int parent, rank;
};