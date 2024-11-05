package Verisoft.ChainOfResponsibilityExample;

/**
 * Concrete handler that processes PDF documents.
 * It attempts to open a PDF document or passes the request to the next handler.
 */
public class PDFHandler implements DocumentHandler {
    private DocumentHandler nextHandler;

    @Override
    public void setNextHandler(DocumentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void openDocument(String fileType) {
        if (fileType.equalsIgnoreCase("pdf")) {
            System.out.println("Opening PDF document.");
        } else if (nextHandler != null) {
            nextHandler.openDocument(fileType);
        } else {
            System.out.println("No handler available for file type: " + fileType);
        }
    }
}
