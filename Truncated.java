// Truncated.java
package lab.polymorphism;

public class Truncated implements TextBlock {
    public TextBlock contents;
    public int width;

    public Truncated(TextBlock contents, int width) {
        this.contents = contents;
        this.width = width;
    }

    public String row(int i) throws Exception {
        String originalRow = contents.row(i);
        return originalRow.substring(0, Math.min(originalRow.length(), width));
    }

    public int height() {
        return contents.height();
    }

    public int width() {
        return width;
    }
}
