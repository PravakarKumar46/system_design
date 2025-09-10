package behavioural.iteratorDP;

public class IteratorMain {

    public static void main(String[] args) {

        IterableConcreteImpl list = new IterableConcreteImpl();
        list.setContents(new Content(1, "content1"));
        list.setContents(new Content(2, "content2"));
        list.setContents(new Content(3, "content3"));
        list.setContents(new Content(4, "content4"));
        list.setContents(new Content(5, "content5"));
        list.setContents(new Content(6, "content6"));

        IteratorInterface iterator = list.createIterator();

        while (iterator.hasNext()) {
            Content content = iterator.next();  // Only call once per loop
            if (content != null) {
                System.out.println("contentId: " + content.contentsId +
                        " and contentName: " + content.contentsName);
            } else {
                break; // Optional, depending on your design
            }
        }

    }
}
