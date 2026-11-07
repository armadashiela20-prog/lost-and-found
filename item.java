package campuslostandfound;                   

public class item {

    private String ItemName;
    private String description;
    private String location;
    private String dateReported;
    private String status;
    
    public item(String itemName, String description,
        String location, String dateReported,
        String status) {

    validateRequiredField(itemName, "Item name");
    validateRequiredField(description, "Description");
    validateRequiredField(location, "Location");
    validateRequiredField(dateReported, "Date");
    validateRequiredField(status, "Status");

    this.ItemName = itemName;
    this.description = description;
    this.location = location;
    this.dateReported = dateReported;
    this.status = status;
}

    

    




    
