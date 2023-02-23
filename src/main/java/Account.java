public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        boolean isValidLength = name.length()>=3 && name.length()<=19;
        boolean hasOneSpase = name.replace(" ", "").length() + 1 == name.length();
        boolean isValidSpase = name.trim().length() == name.length();
        return isValidLength && hasOneSpase && isValidSpase;
    }

}

