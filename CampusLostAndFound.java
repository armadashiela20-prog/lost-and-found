package campuslostandfound;

public class CampusLostAndFound extends javax.swing.JFrame {

    private ItemLinkedList itemList = new ItemLinkedList();

    private javax.swing.JTextField nameField;
    private javax.swing.JTextField descriptionField;
    private javax.swing.JTextField locationField;
    private javax.swing.JTextField personField;
    private javax.swing.JTextField searchField;

    private javax.swing.JComboBox<String> typeBox;
    private javax.swing.JComboBox<String> statusBox;

    private javax.swing.JTable table;
    private javax.swing.table.DefaultTableModel model;

     public CampusLostAndFound() {

        setTitle("Campus Lost-and-Found Tracker");
        setSize(1100, 650);

        setDefaultCloseOperation(
                javax.swing.JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
        setLayout(new java.awt.BorderLayout(10, 10));

        // HEADER
        javax.swing.JLabel title = new javax.swing.JLabel(
                "CAMPUS LOST-AND-FOUND TRACKER",
                javax.swing.SwingConstants.CENTER);

        title.setFont(new java.awt.Font(
                "Arial", java.awt.Font.BOLD, 23));

        title.setForeground(new java.awt.Color(30, 70, 120));

        add(title, java.awt.BorderLayout.NORTH);

    javax.swing.JPanel inputPanel =
        new javax.swing.JPanel(
                new java.awt.GridLayout(6, 2, 8, 8));

inputPanel.setBorder(
        javax.swing.BorderFactory.createTitledBorder(
                "Item Information"));

nameField = new javax.swing.JTextField();
descriptionField = new javax.swing.JTextField();
locationField = new javax.swing.JTextField();
personField = new javax.swing.JTextField();

typeBox = new javax.swing.JComboBox<>(
        new String[]{"Lost Item", "Found Item"});

statusBox = new javax.swing.JComboBox<>(
        new String[]{"Lost", "Found", "Claimed"});

inputPanel.add(new javax.swing.JLabel("Item Name:"));
inputPanel.add(nameField);

inputPanel.add(new javax.swing.JLabel("Description:"));
inputPanel.add(descriptionField);

inputPanel.add(new javax.swing.JLabel("Location:"));
inputPanel.add(locationField);

inputPanel.add(new javax.swing.JLabel("Reported By:"));
inputPanel.add(personField);

inputPanel.add(new javax.swing.JLabel("Record Type:"));
inputPanel.add(typeBox);

inputPanel.add(new javax.swing.JLabel("Status:"));
inputPanel.add(statusBox);
String[] columns = {
    "Item Name",
    "Description",
    "Location",
    "Date Reported",
    "Type",
    "Reported By",
    "Status"
};

model = new javax.swing.table.DefaultTableModel(
        columns, 0) {

    @Override
    public boolean isCellEditable(
            int row, int column) {
        return false;
    }
};

table = new javax.swing.JTable(model);
table.setRowHeight(25);

javax.swing.JScrollPane scrollPane =
        new javax.swing.JScrollPane(table);

javax.swing.JPanel centerPanel =
        new javax.swing.JPanel(
                new java.awt.BorderLayout(10, 10));

centerPanel.add(
        inputPanel, java.awt.BorderLayout.NORTH);

centerPanel.add(
        scrollPane, java.awt.BorderLayout.CENTER);

add(centerPanel, java.awt.BorderLayout.CENTER);

javax.swing.JPanel buttonPanel =
        new javax.swing.JPanel(
                new java.awt.FlowLayout());

javax.swing.JButton addButton =
        new javax.swing.JButton("Add Record");

javax.swing.JButton searchButton =
        new javax.swing.JButton("Search");

javax.swing.JButton showButton =
        new javax.swing.JButton("Show All");

javax.swing.JButton updateButton =
        new javax.swing.JButton("Update Status");

javax.swing.JButton deleteButton =
        new javax.swing.JButton("Delete");

searchField = new javax.swing.JTextField(15);

buttonPanel.add(addButton);
buttonPanel.add(searchField);
buttonPanel.add(searchButton);
buttonPanel.add(showButton);
buttonPanel.add(updateButton);
buttonPanel.add(deleteButton);

add(buttonPanel, java.awt.BorderLayout.SOUTH);

addButton.addActionListener(e -> addRecord());
searchButton.addActionListener(e -> searchRecord());
searchField.addActionListener(e -> searchRecord());
showButton.addActionListener(e -> displayRecords());
updateButton.addActionListener(e -> updateRecord());
deleteButton.addActionListener(e -> deleteRecord());