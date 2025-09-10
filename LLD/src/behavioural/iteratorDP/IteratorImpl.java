package behavioural.iteratorDP;

import java.util.List;

public class IteratorImpl implements IteratorInterface {

    private final List<Content> contents;
    private int index = 0;

    public IteratorImpl(List<Content> contents) {
        this.contents = contents;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < contents.size();
    }

    @Override
    public Content next() {
        return hasNext() ? contents.get(index++) : null;
    }

}
