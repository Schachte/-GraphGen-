package data;

import java.util.List;
import java.util.Map;

/**
 * Generic representation of a node type
 */
public interface Node {
    Node getParent(Node node);

    Map<String, Object> getMetadata();

    void addChild(Node node);

    List<Node> getChildren();

    void addMetadata(String key, Object metaValue);
}
