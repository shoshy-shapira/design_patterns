package Verisoft.ChainOfResponsibilityExample;

/**
 * Handler Interface that defines the method for handling requests
 * and setting the next handler in the chain.
 */
public interface DocumentHandler {
    /**
     * Sets the next handler in the chain.
     *
     * @param nextHandler the next handler to be set
     */
    void setNextHandler(DocumentHandler nextHandler);

    /**
     * Opens a document based on the provided file type.
     *
     * @param fileType the type of the file to open
     */
    void openDocument(String fileType);
}