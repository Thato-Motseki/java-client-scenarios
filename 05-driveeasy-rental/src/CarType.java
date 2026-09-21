public enum CarType {

    ECONOMY("Economy", 400.00),
    SUV("SUV", 650.00),
    LUXURY("Luxury", 950.00);

    private final String displayName;
    private final double dailyRate;

    CarType(String displayName, double dailyRate) {
        this.displayName = displayName;
        this.dailyRate = dailyRate;
    }

    public String getDisplayName() {
        return displayName;
    }

    public double getDailyRate() {
        return dailyRate;
    }
}