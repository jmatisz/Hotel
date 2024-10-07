import java.math.BigDecimal;

public class Room {
    private int roomNumber;
    private int numberOfBeds;
    private boolean isBalcony;
    private boolean isViewOnSea;
    private BigDecimal price;

    public Room(int roomNumber, int numberOfBeds, boolean isBalcony,
                boolean isViewOnSea, BigDecimal price) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.isBalcony = isBalcony;
        this.isViewOnSea = isViewOnSea;
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isBalcony() {
        return isBalcony;
    }

    public void setBalcony(boolean balcony) {
        isBalcony = balcony;
    }

    public boolean isViewOnSea() {
        return isViewOnSea;
    }

    public void setViewOnSea(boolean viewOnSea) {
        isViewOnSea = viewOnSea;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
