public class Car {

    private CarType carType;

    public Car(CarType carType) {
        this.carType = carType;
    }

    public CarType getCarType() {
        return carType;
    }

    public double calculateRentalCost(int rentalDays)
            throws InvalidRentalException {

        if (rentalDays <= 0) {
            throw new InvalidRentalException(
                    "Rental period must be greater than 0 days."
            );
        }

        double totalCost = carType.getDailyRate() * rentalDays;

        // 10% discount for rentals of 7 or more days
        if (rentalDays >= 7) {
            totalCost = totalCost - (totalCost * 0.10);
        }

        return totalCost;
    }
}