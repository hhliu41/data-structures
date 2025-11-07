import java.util.List;
import java.util.ArrayList;

/**
    Add a method void depthFirst(Visitor v) to the Tree class of
    Section 17.4 (below).
    Keep visiting until the visit method returns false.
*/
public class Tree
{
    private Node root;

    class Node
    {
        public Object data;
        public List<Node> children;

        /**
            Computes the size of the subtree whose root is this node.
            @return the number of nodes in the subtree
        */
        public int size()
        {
            int sum = 0;
            for (Node child : children) { sum = sum + child.size(); }
            return 1 + sum;
        }
    }

    /**
        Constructs an empty tree.
    */
    public Tree()
    {
        root = null;
    }

    /**
        Constructs a tree with one node and no children.
        @param rootData the data for the root
    */
    public Tree(Object rootData)
    {
        root = new Node();
        root.data = rootData;
        root.children = new ArrayList<>();
    }

    /**
        Adds a subtree as the last child of the root.
    */
    public void addSubtree(Tree subtree)
    {
        root.children.add(subtree.root);
    }

    /**
        Computes the size of this tree.
        @return the number of nodes in the tree
    */
    public int size()
    {
        if (root == null) { return 0; }
        else { return root.size(); }
    }

    // Additional methods will be added in later sections.
    public void depthFirst(Visitor v) {
        depthFirst(v, this.root);
    }

    public void depthFirst(Visitor v, Node n) {
        if (n == null) {
            return;
        }
        v.visit(n.data);

        for (Node child: n.children) {
            depthFirst(v, child);
        }
    }
    

    public void postOrder(Visitor v) {
        postOrder(this.root, v);
    }

    public void postOrder(Node n, Visitor v) {
        if (n == null) {
            return;
        }
        for (Node child : n.children) {
            postOrder (child, v);
        }
        v.visit(n.data);
    }
}
