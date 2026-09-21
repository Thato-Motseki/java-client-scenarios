import javax.swing.SwingUtilities;

public class StarNightEvents {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            TicketBookingFrame frame =
                    new TicketBookingFrame();

            frame.setVisible(true);
        });
    }
}