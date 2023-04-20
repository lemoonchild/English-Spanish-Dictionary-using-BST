package structure5;

/**
 * A private implementation of a vertex for use in graphs that
 * are internally represented as a Matrix.  A vertex
 * is capable of holding a label and has a flag that can be set
 * to mark it as visited.
 * <p>
 * Typical Usage:
 * <p>
 * <pre>
 *     Vertex v = new {@link #GraphMatrixVertex(Object, int) Vertex(someLabel)};
 *     //...several graph related operations occur
 *     if(!v.{@link #isVisited() isVisited()}){
 *         Object label = v.label();
 *         v.{@link #visit() visit()};
 *     }
 * </pre>
 *
 * @param <V> the type parameter
 * @version $Id : GraphMatrixVertex.java 22 2006-08-21 19:27:26Z bailey $
 * @author, 2001 duane a. bailey
 * @see GraphListVertex
 * @see Vertex
 */
class GraphMatrixVertex<V> extends Vertex<V>
{
    /**
     * The Index.
     */
    protected int index;

    /**
     * Instantiates a new Graph matrix vertex.
     *
     * @param label the label
     * @param idx   the idx
     * @post constructs a new augmented vertex
     */
    public GraphMatrixVertex(V label, int idx)
    {
        super(label);
        index = idx;
    }

    /**
     * Index int.
     *
     * @return int
     * @post returns index associated with vertex
     */
    public int index()
    {
        return index;
    }

    /**
     * @post returns string representation of vertex
     * 
     * @return 
     */
    public String toString()
    {
        return "<GraphMatrixVertex: "+label()+">";
    }
}
