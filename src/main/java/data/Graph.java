package data;

import java.util.List;

/**
 * Baseline methods for interfacing with a particular graph instance
 */
public interface Graph {
    Node getRoot();

    List<Node> getNodes();

    void addNode(Node node);

    void removeNode(Graph node);

    Node findNode(int nodeValue);

    Node findNode(String nodeValue);

    Node findNode(Node node);
}
