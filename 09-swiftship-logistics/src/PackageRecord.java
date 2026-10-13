import java.io.Serializable;

public class PackageRecord implements Serializable {
    private static final long serialVersionUID = 1L;

    private String trackingNumber;
    private String destination;
    private String customerName;
    private PackageStatus status;
    private double weightKg;

    public PackageRecord(String trackingNumber, String destination, String customerName,
                         PackageStatus status, double weightKg) {
        this.trackingNumber = trackingNumber;
        this.destination = destination;
        this.customerName = customerName;
        this.status = status;
        this.weightKg = weightKg;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getCustomerName() {
        return customerName;
    }

    public PackageStatus getStatus() {
        return status;
    }

    public double getWeightKg() {
        return weightKg;
    }

    @Override
    public String toString() {
        return "PackageRecord{" +
                "trackingNumber='" + trackingNumber + '\'' +
                ", destination='" + destination + '\'' +
                ", customerName='" + customerName + '\'' +
                ", status=" + status +
                ", weightKg=" + weightKg +
                '}';
    }
}
