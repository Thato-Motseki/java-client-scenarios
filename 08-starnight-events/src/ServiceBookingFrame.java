import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;

public class ServiceBookingFrame extends JFrame {

    private static final Color HEADER_BLUE = new Color(25, 77, 130);
    private static final Color ACTION_GREEN = new Color(46, 125, 50);
    private static final Color ACTION_BLUE = new Color(33, 105, 180);
    private static final Color ACTION_RED = new Color(190, 55, 55);

    public ServiceBookingFrame() {
        setTitle("Maseru Community Service - Service Booking System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(12, 12));

        add(createHeader(), BorderLayout.NORTH);
        add(createMainContent(), BorderLayout.CENTER);
        add(createButtonPanel(), BorderLayout.SOUTH);

        getRootPane().setBorder(
                BorderFactory.createEmptyBorder(12, 16, 12, 16)
        );
        setSize(960, 700);
        setMinimumSize(new java.awt.Dimension(760, 580));
        setLocationRelativeTo(null);
    }

    private JPanel createHeader() {
        JPanel header = new JPanel();
        header.setBackground(HEADER_BLUE);
        header.setLayout(new BoxLayout(header, BoxLayout.Y_AXIS));
        header.setBorder(BorderFactory.createEmptyBorder(16, 10, 16, 10));

        JLabel organizationLabel = new JLabel("MASERU COMMUNITY SERVICE");
        organizationLabel.setFont(new Font("Arial", Font.BOLD, 28));

        JLabel titleLabel = new JLabel("Service Booking System");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 21));

        JLabel taglineLabel = new JLabel(
                "Empowering our community through skills, access and support"
        );
        taglineLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        for (JLabel label : new JLabel[]{
                organizationLabel, titleLabel, taglineLabel
        }) {
            label.setForeground(Color.WHITE);
            label.setAlignmentX(CENTER_ALIGNMENT);
            header.add(label);
        }

        return header;
    }

    private JPanel createMainContent() {
        JPanel content = new JPanel(new GridLayout(1, 2, 12, 0));
        content.add(createCustomerColumn());
        content.add(createServiceColumn());
        return content;
    }

    private JPanel createCustomerColumn() {
        JPanel column = new JPanel(new BorderLayout(0, 10));

        JPanel customerPanel = titledPanel("Customer Information");
        customerPanel.setLayout(new GridLayout(3, 2, 8, 10));
        customerPanel.add(new JLabel("Full Name:"));
        customerPanel.add(new JTextField());
        customerPanel.add(new JLabel("Phone Number:"));
        customerPanel.add(new JTextField());
        customerPanel.add(new JLabel("Email Address:"));
        customerPanel.add(new JTextField());

        JPanel contactPanel = titledPanel("Preferred Contact Method");
        contactPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 8));
        ButtonGroup contactGroup = new ButtonGroup();
        addContactOption(contactPanel, contactGroup, "Phone", true);
        addContactOption(contactPanel, contactGroup, "Email", false);
        addContactOption(contactPanel, contactGroup, "SMS", false);

        JPanel informationPanel = titledPanel("Additional Information");
        informationPanel.setLayout(new BorderLayout(0, 6));
        informationPanel.add(
                new JLabel("Please provide additional information or comments"),
                BorderLayout.NORTH
        );
        JTextArea commentsArea = new JTextArea(5, 24);
        commentsArea.setLineWrap(true);
        commentsArea.setWrapStyleWord(true);
        informationPanel.add(new JScrollPane(commentsArea), BorderLayout.CENTER);

        JPanel upper = new JPanel(new BorderLayout(0, 10));
        upper.add(customerPanel, BorderLayout.NORTH);
        upper.add(contactPanel, BorderLayout.CENTER);

        column.add(upper, BorderLayout.NORTH);
        column.add(informationPanel, BorderLayout.CENTER);
        return column;
    }

    private JPanel createServiceColumn() {
        JPanel column = new JPanel(new BorderLayout(0, 10));

        JPanel servicePanel = titledPanel("Service Selection");
        servicePanel.setLayout(new BorderLayout(8, 8));
        servicePanel.add(new JLabel("Select Service:"), BorderLayout.WEST);
        servicePanel.add(new JComboBox<>(new String[]{
                "Computer Training",
                "Printing Service",
                "Internet Access",
                "CV Assistance",
                "Career Guidance",
                "Community Workshop"
        }), BorderLayout.CENTER);

        JPanel requirementsPanel = titledPanel("Additional Requirements");
        requirementsPanel.setLayout(new GridLayout(4, 1, 4, 8));
        requirementsPanel.add(new JCheckBox("Need wheelchair access"));
        requirementsPanel.add(new JCheckBox("Need computer"));
        requirementsPanel.add(new JCheckBox("Need assistance"));
        requirementsPanel.add(new JCheckBox("First-time visitor"));

        column.add(servicePanel, BorderLayout.NORTH);
        column.add(requirementsPanel, BorderLayout.CENTER);
        return column;
    }

    private JPanel createButtonPanel() {
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 12, 4));
        buttonPanel.add(createActionButton("Register Booking", ACTION_GREEN));
        buttonPanel.add(createActionButton("Clear", ACTION_BLUE));
        buttonPanel.add(createActionButton("Exit", ACTION_RED));
        return buttonPanel;
    }

    private JPanel titledPanel(String title) {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder(title),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));
        return panel;
    }

    private void addContactOption(
            JPanel panel,
            ButtonGroup group,
            String label,
            boolean selected
    ) {
        JRadioButton option = new JRadioButton(label, selected);
        group.add(option);
        panel.add(option);
    }

    private JButton createActionButton(String label, Color background) {
        JButton button = new JButton(label);
        button.setBackground(background);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setMargin(new Insets(8, 16, 8, 16));
        button.setOpaque(true);
        button.setBorderPainted(false);
        return button;
    }
}
