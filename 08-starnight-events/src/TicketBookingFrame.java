import javax.swing.*;
import java.awt.*;

public class TicketBookingFrame extends JFrame {

    private JComboBox<String> eventComboBox;
    private JTextField nameField;
    private JTextField ticketField;
    private JLabel seatsLabel;
    private JLabel messageLabel;

    private int availableSeats = 100;

    public TicketBookingFrame() {

        setTitle("StarNight Events - Ticket Booking");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        createInterface();
    }

    private void createInterface() {

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));

        JLabel titleLabel = new JLabel(
                "STARNIGHT EVENTS",
                SwingConstants.CENTER
        );

        titleLabel.setFont(
                new Font("Arial", Font.BOLD, 24)
        );

        mainPanel.add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(
                new GridLayout(5, 2, 10, 10)
        );

        formPanel.setBorder(
                BorderFactory.createEmptyBorder(
                        20, 20, 20, 20
                )
        );

        formPanel.add(new JLabel("Event:"));

        eventComboBox = new JComboBox<>(
                new String[]{
                        "Summer Music Festival",
                        "Comedy Night",
                        "Jazz Evening",
                        "Cultural Night"
                }
        );

        formPanel.add(eventComboBox);

        formPanel.add(new JLabel("Customer Name:"));

        nameField = new JTextField();

        formPanel.add(nameField);

        formPanel.add(new JLabel("Number of Tickets:"));

        ticketField = new JTextField();

        formPanel.add(ticketField);

        formPanel.add(new JLabel("Available Seats:"));

        seatsLabel = new JLabel(
                String.valueOf(availableSeats)
        );

        formPanel.add(seatsLabel);

        JButton bookButton = new JButton(
                "Book Tickets"
        );

        formPanel.add(bookButton);

        JButton clearButton = new JButton(
                "Clear"
        );

        formPanel.add(clearButton);

        mainPanel.add(
                formPanel,
                BorderLayout.CENTER
        );

        messageLabel = new JLabel(
                " ",
                SwingConstants.CENTER
        );

        mainPanel.add(
                messageLabel,
                BorderLayout.SOUTH
        );

        add(mainPanel);

        bookButton.addActionListener(
                e -> processBooking()
        );

        clearButton.addActionListener(
                e -> clearForm()
        );
    }

    private void processBooking() {

        String customerName =
                nameField.getText().trim();

        String ticketText =
                ticketField.getText().trim();

        if (customerName.isEmpty()) {

            showMessage(
                    "Please enter the customer's name."
            );

            return;
        }

        if (ticketText.isEmpty()) {

            showMessage(
                    "Please enter the number of tickets."
            );

            return;
        }

        int ticketCount;

        try {

            ticketCount =
                    Integer.parseInt(ticketText);

        } catch (NumberFormatException e) {

            showMessage(
                    "Ticket quantity must be a number."
            );

            return;
        }

        if (ticketCount <= 0) {

            showMessage(
                    "Ticket quantity must be greater than zero."
            );

            return;
        }

        if (ticketCount > availableSeats) {

            showMessage(
                    "Not enough seats available."
            );

            return;
        }

        String selectedEvent =
                (String) eventComboBox.getSelectedItem();

        availableSeats -= ticketCount;

        seatsLabel.setText(
                String.valueOf(availableSeats)
        );

        String confirmation = String.format(
                "Booking confirmed: %s booked %d ticket(s) for %s.",
                customerName,
                ticketCount,
                selectedEvent
        );

        showMessage(confirmation);

        ticketField.setText("");
    }

    private void clearForm() {

        nameField.setText("");
        ticketField.setText("");

        eventComboBox.setSelectedIndex(0);

        messageLabel.setText(" ");
    }

    private void showMessage(String message) {

        messageLabel.setText(message);
    }
}