package enums;

public enum MenuItems {
    BURGER("Cheese Burger"),
    PIZZA("Pepperoni pizza"),
    PASTA("Pasta with alfredo sauce");

    private String foodType;

    MenuItems(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
}
