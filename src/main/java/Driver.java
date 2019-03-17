import com.google.common.collect.ImmutableMap;
import data.Graph;
import data.GraphImpl;
import data.Node;
import data.NodeImpl;
import util.DataReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Driver {

    public static void main(String[] args) throws IOException {
        generateSimpleGraph("/Users/schachte/Desktop/testTree.txt");
    }
    private static Graph generateSimpleGraph(String path) throws IOException {
        Graph graph = new GraphImpl();
        BufferedReader reader = DataReader.readAdjacencyList(path);
        traverseSerializedAdjacencyList(graph, reader);
        return graph;
    }

    private static Graph traverseSerializedAdjacencyList(Graph graph, BufferedReader bufferedReader) throws IOException {
        String currentLine = bufferedReader.readLine();
        if (currentLine == null) {
            return graph;
        }
        List<String> currentTreePath = new LinkedList<String>(Arrays.asList(currentLine.split("->|,")));
        Node parentNode = generateParent(currentTreePath.get(0));
        currentTreePath.remove(0);
        generateRelations(parentNode, currentTreePath);
        graph.addNode(parentNode);
        return traverseSerializedAdjacencyList(graph, bufferedReader);
    }

    private static Node generateRelations(Node parentNode, List<String> nodeChildren) {
        if (nodeChildren.isEmpty()) {
            return parentNode;
        }
        generateChild(parentNode, nodeChildren.get(0));
        nodeChildren.remove(0);
        return generateRelations(parentNode, nodeChildren);
    }

    /**
     * For now, only supporting nodes with a single parent
     */
    private static void generateChild(Node parent, String value) {
        Node childNode = new NodeImpl(parent,
                "value",
                ImmutableMap.<String, Object>builder().put("value", value).build());
        parent.addChild(childNode);
    }

    private static Node generateParent(String value) {
        return new NodeImpl(null,
                "value",
                ImmutableMap.<String, Object>builder().put("value", value).build());
    }

}
