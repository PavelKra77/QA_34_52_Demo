package enums;

public enum Hobbies {
    SPORTS("//*[@for='hobbies-checkbox-1']"),
    READING("hobbies-checkbox-2"),
    MUSIC("hobbies-checkbox-3");


    private String locator;

    Hobbies(String locator) {
        this.locator = locator;
    }

    public String getLocator() {
        return locator;
    }
}
