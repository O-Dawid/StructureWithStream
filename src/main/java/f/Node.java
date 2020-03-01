package f;

import java.util.Objects;
import java.util.stream.Stream;

public class Node implements INode {
    String code;
    String renderer;

    public Node(String code, String renderer) {
        this.code = code;
        this.renderer = renderer;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ " (" +"Code: "+code +", Renderer: "+renderer+")";
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getRenderer() {
        return renderer;
    }

    @Override
    public Stream<INode> toStream() {
        return Stream.of(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Node node = (Node) o;
        return Objects.equals(code, node.code) &&
                Objects.equals(renderer, node.renderer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, renderer);
    }
}