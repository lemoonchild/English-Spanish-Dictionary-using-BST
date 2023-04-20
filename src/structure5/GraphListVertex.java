package structure5;
import java.util.Iterator;

/**
 * A private implementation of a vertex for use in graphs that
 * are internally represented as a list.  A vertex
 * is capable of holding a label and has a flag that can be set
 * to mark it as visited.
 * <p>
 * Typical Usage:
 * <p>
 * <pre>
 *     Vertex v = new {@link #GraphListVertex(Object) Vertex(someLabel)};
 *     //...several graph related operations occur
 *     if(!v.{@link #isVisited() isVisited()}){
 *         Object label = v.label();
 *         v.{@link #visit() visit()};
 *     }
 * </pre>
 *
 * @param <V> the type parameter
 * @param <E> the type parameter
 * @version $Id : GraphListVertex.java 22 2006-08-21 19:27:26Z bailey $
 * @author, 2001 duane a. bailey
 * @see GraphListVertex
 * @see Vertex
 */
class GraphListVertex<V,E> extends Vertex<V>
{
    /**
     * The Adjacencies.
     */
    protected Structure<Edge<V,E>> adjacencies; // adjacent edges

    /**
     * Instantiates a new Graph list vertex.
     *
     * @param key the key
     * @post constructs a new vertex, not incident to any edge
     */
    public GraphListVertex(V key)
    {
        super(key); // init Vertex fields
        adjacencies = new SinglyLinkedList<Edge<V,E>>(); // new list
    }

    /**
     * Add edge.
     *
     * @param e the e
     * @pre e is an edge that mentions this vertex
     * @post adds edge to this vertex's adjacency list
     */
    public void addEdge(Edge<V,E> e)
    {
        if (!containsEdge(e)) adjacencies.add(e);
    }

    /**
     * Contains edge boolean.
     *
     * @param e the e
     * @return boolean
     * @post returns true if e appears on adjacency list
     */
    public boolean containsEdge(Edge<V,E> e)
    {
        return adjacencies.contains(e);
    }

    /**
     * Remove edge edge.
     *
     * @param e the e
     * @return edge
     * @post removes and returns adjacent edge "equal" to e
     */
    public Edge<V,E> removeEdge(Edge<V,E> e)
    {
        return adjacencies.remove(e);
    }

    /**
     * Gets edge.
     *
     * @param e the e
     * @return edge
     * @post returns the edge that "equals" e, or null
     */
    public Edge<V,E> getEdge(Edge<V,E> e)
    {
        Iterator<Edge<V,E>> edges = adjacencies.iterator();
        while (edges.hasNext())
        {
            Edge<V,E> adjE = edges.next();
            if (e.equals(adjE)) return adjE;
        }
        return null;
    }

    /**
     * Degree int.
     *
     * @return int
     * @post returns the degree of this node
     */
    public int degree()
    {
        return adjacencies.size(); 
    }

    /**
     * Adjacent vertices iterator.
     *
     * @return iterator
     * @post returns iterator over adj. vertices
     */
    public Iterator<V> adjacentVertices()
    {
        return new GraphListAIterator<V,E>(adjacentEdges(), label());
    }

    /**
     * Adjacent edges iterator.
     *
     * @return iterator
     * @post returns iterator over adj. edges
     */
    public Iterator<Edge<V,E>> adjacentEdges()
    {
        return adjacencies.iterator();
    }

    /**
     * @post returns string representation of vertex
     * 
     * @return String representation of vertex
     */
    public String toString()
    {
        return "<GraphListVertex: "+label()+">";
    }
}

