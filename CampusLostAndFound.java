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
