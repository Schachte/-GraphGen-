package data;

import com.google.common.collect.ImmutableMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NodeImpl implements Node {

    private Map<String, Object> nodeMetadata;

    private String primaryKey;

    private Node parent;

    private List<Node> children = new ArrayList<Node>();

    public NodeImpl(Node parent, String primaryKey, ImmutableMap<String, Object> nodeMetadata) {
        this.primaryKey = primaryKey;
        this.nodeMetadata = nodeMetadata;
        this.parent = parent;
    }

    public NodeImpl(Map<String, Object> nodeMetadata) {
        this.primaryKey = primaryKey;
        this.nodeMetadata = nodeMetadata;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public Object getMetadata(String metaKey) {
        if (nodeMetadata.containsKey(metaKey)) {
            return nodeMetadata.get(metaKey);
        }
        return null;
    }

    public Object getNodeKey() {
        return nodeMetadata.get(primaryKey);
    }

    public Node getParent(Node node) {
        return parent;
    }

    public Map<String, Object> getMetadata() {
        return nodeMetadata;
    }

    public void addChild(Node node) {
        children.add(node);
    }

    public List<Node> getChildren() {
        return children;
    }

    public void addMetadata(String key, Object metaValue) {
        nodeMetadata.put(key, metaValue);
    }
}
