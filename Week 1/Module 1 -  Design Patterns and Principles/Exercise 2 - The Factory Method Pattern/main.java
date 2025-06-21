public class main {
    public static void main(String[] args) {
        
        DocumentFactory pdfFactory = new PDFDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.displayContent();

        
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.displayContent();

        
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.displayContent();
    }
}
 
interface Document {
    void displayContent();
}

class PDFDocument implements Document {
    public void displayContent() {
        System.out.println("Displaying the contents of PDF DOCUMENT");
    }
}

class WordDocument implements Document {
    public void displayContent() {
        System.out.println("Displaying the contents of WORD DOCUMENT");
    }
}

class ExcelDocument implements Document {
    public void displayContent() {
        System.out.println("Displaying the contents of EXCEL DOCUMENT");
    }
}

abstract class DocumentFactory {
    public abstract Document createDocument();
}

class PDFDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PDFDocument();
    }
}

class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}

