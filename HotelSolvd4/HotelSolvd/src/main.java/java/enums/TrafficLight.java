package enums;

public enum TrafficLight {
    RED(1, "Stop"),
    YELLOW(2,"Caution"),
    GREEN(3, "Go");

    private int id;
    private String lightColorMeaning;

    TrafficLight(int id, String lightColorMeaning) {
        this.id = id;
        this.lightColorMeaning = lightColorMeaning;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLightColorMeaning() {
        return lightColorMeaning;
    }

    public void setLightColors(String lightColors) {
        this.lightColorMeaning = lightColors;
    }
}
