// HorizontallyFlipped.java
package lab.polymorphism;

public class HorizontallyFlipped implements TextBlock {
    private TextBlock contents;

    public HorizontallyFlipped(TextBlock contents) {
        this.contents = contents;
    }

    public String row(int i) throws Exception {
        String originalRow = contents.row(i);
        return new StringBuilder(originalRow).reverse().toString();
    }

    public int height() {
        return contents.height();
    }

    public int width() {
        return contents.width();
    }
}