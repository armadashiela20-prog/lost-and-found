package campuslostandfound;

public class FoundItem extends item {

    private String finderName;

    public FoundItem(String name, String description,
        String location, String date,
        String status, String finderName) {

    super(name, description, location, date, status);

    validateRequiredField(finderName, "Finder name");
    this.finderName = finderName;
}
}