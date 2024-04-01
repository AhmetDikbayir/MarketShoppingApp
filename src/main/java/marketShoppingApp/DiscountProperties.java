package marketShoppingApp;

public class DiscountProperties {
    private boolean discountCard;
    private boolean isStudent;
    private boolean isRetired;

    public boolean isDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(boolean discountCard) {
        this.discountCard = discountCard;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    public DiscountProperties(boolean discountCard, boolean isStudent, boolean isRetired) {
        this.discountCard = discountCard;
        this.isStudent = isStudent;
        this.isRetired = isRetired;
    }
}
