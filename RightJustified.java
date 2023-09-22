// RightJustified.java
package lab.polymorphism;

public class RightJustified implements TextBlock {
    public TextBlock contents;
    public int width;

    public RightJustified(TextBlock contents, int width) {
        this.contents = contents;
        this.width = width;
    }

    public String row(int i) throws Exception {
        String originalRow = contents.row(i);
        int padding = width - originalRow.length();
        String paddedRow = TBUtils.spaces(padding) + originalRow;
        return paddedRow.substring(0, width);
    }

    public int height() {
        return contents.height();
    }

    public int width() {
        return width;
    }
}