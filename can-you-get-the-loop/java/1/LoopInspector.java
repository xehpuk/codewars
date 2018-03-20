import java.util.*;

public class LoopInspector {
  public int loopSize(Node node) {
    final Set<Node> nodes = new LinkedHashSet<>();
    while(nodes.add(node)) {
      node = node.getNext();
    }
    final Iterator<Node> iterator = nodes.iterator();
    for (int i = 0;; i++) {
      if (iterator.next() == node) {
        return nodes.size() - i;
      }
    }
  }
}