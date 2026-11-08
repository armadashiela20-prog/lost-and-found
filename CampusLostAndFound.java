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

    