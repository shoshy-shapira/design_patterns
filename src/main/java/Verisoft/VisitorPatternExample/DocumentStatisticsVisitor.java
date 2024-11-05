package Verisoft.VisitorPatternExample;

/**
 * The DocumentStatisticsVisitor class implements the Visitor interface and collects
 * statistics about the document, such as the number of words in text sections,
 * the number of images, and the number of tables.
 */
public class DocumentStatisticsVisitor implements Visitor {
    private int wordCount = 0;
    private int imageCount = 0;
    private int tableCount = 0;

    /**
     * Visits a TextSection and counts the number of words in it.
     * @param textSection the TextSection element to visit.
     */
    @Override
    public void visit(TextSection textSection) {
        int words = textSection.getText().split("\\s+").length;
        wordCount += words;
    }

    /**
     * Visits an ImageSection and increments the image count.
     * @param imageSection the ImageSection element to visit.
     */
    @Override
    public void visit(ImageSection imageSection) {
        imageCount++;
    }

    /**
     * Visits a TableSection and increments the table count.
     * @param tableSection the TableSection element to visit.
     */
    @Override
    public void visit(TableSection tableSection) {
        tableCount++;
    }

    /**
     * Returns the total number of words in text sections.
     * @return the word count.
     */
    public int getWordCount() {
        return wordCount;
    }

    /**
     * Returns the total number of images in the document.
     * @return the image count.
     */
    public int getImageCount() {
        return imageCount;
    }

    /**
     * Returns the total number of tables in the document.
     * @return the table count.
     */
    public int getTableCount() {
        return tableCount;
    }
}
