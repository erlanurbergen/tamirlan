package tamirlan.Books_and_dictionaries;

public class Dictionary extends Books{
    private String sourceLanguage;
    private String targetLanguage;
    private int numDefinitions;

    public Dictionary(String isbn, String title, int pages, String sourceLanguage, String targetLanguage, int numDefinitions) {
        super(isbn, title, pages);
        this.sourceLanguage = sourceLanguage;
        this.targetLanguage = targetLanguage;
        this.numDefinitions = numDefinitions;
    }

    public String getSourceLanguage() {
        return sourceLanguage;
    }

    public void setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }

    public String getTargetLanguage() {
        return targetLanguage;
    }

    public void setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
    }

    public int getNumDefinitions() {
        return numDefinitions;
    }

    public void setNumDefinitions(int numDefinitions) {
        this.numDefinitions = numDefinitions;
    }

    @Override
    public String toString() {
        return super.toString() + getSourceLanguage()
                + " " + getTargetLanguage()
                + " " + getNumDefinitions();
    }
}
