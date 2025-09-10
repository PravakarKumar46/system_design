package behavioural.iteratorDP;

import java.util.ArrayList;
import java.util.List;

public class IterableConcreteImpl implements IterableInterface{

    List<Content> contents = new ArrayList<>();
    public void setContents(Content content) {
        contents.add(content);
    }

    @Override
    public IteratorInterface createIterator() {
        return new IteratorImpl(contents);
    }

}
