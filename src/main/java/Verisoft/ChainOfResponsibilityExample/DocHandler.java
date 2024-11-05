package Verisoft.ChainOfResponsibilityExample;

/**
 * Concrete handler that processes Doc documents.
 * It attempts to open a Doc document or passes the request to the next handler.
 */
public class DocHandler implements DocumentHandler {
    private DocumentHandler nextHandler;

    @Override
    public void setNextHandler(DocumentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void openDocument(String fileType) {
        if (fileType.equalsIgnoreCase("doc")) {
            System.out.println("Opening Doc document.");
        } else if (nextHandler != null) {
            nextHandler.openDocument(fileType);
        } else {
            System.out.println("No handler available for file type: " + fileType);
        }
    }
}
