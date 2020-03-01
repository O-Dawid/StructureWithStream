package f;

import java.util.stream.Stream;

interface INode {
    String getCode();
    String getRenderer();

    /**
     * Transforms node to a stream.
     */
    Stream<INode> toStream();
}
  
