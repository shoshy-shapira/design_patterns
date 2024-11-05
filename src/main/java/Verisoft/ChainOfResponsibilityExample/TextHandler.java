package Verisoft.ChainOfResponsibilityExample;

/**
 * Concrete handler that processes Text documents.
 * It attempts to open a Text document or passes the request to the next handler.
 */
public class TextHandler implements DocumentHandler {
    private DocumentHandler nextHandler;

    @Override
    public void setNextHandler(DocumentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void openDocument(String fileType) {
        if (fileType.equalsIgnoreCase("txt")) {
            System.out.println("Opening Text document.");
        } else if (nextHandler != null) {
            nextHandler.openDocument(fileType);
        } else {
            System.out.println("No handler available for file type: " + fileType);
        }
    }
}
