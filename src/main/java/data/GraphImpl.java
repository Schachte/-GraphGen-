package data;

import java.util.ArrayList;
import java.util.List;

public class GraphImpl implements Graph {

    private List<Node> nodes = new ArrayList<Node>();

    public Node getRoot() {
        return nodes.get(0);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void removeNode(Graph node) {

    }

    public Node findNode(int nodeValue) {
        return null;
    }

    public Node findNode(String nodeValue) {
        return null;
    }

    public Node findNode(Node node) {
        return null;
    }
}
