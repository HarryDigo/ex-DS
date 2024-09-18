import java.util.ArrayList;

public class Car {
    public static ArrayList<String> names = new ArrayList<>();

    private String model;
    private String brand;
    private String cat;
    private boolean ac;
    private boolean radio;
    private boolean multi;

    public Car(String model, String brand, String cat, boolean ac, boolean radio, boolean multi) {
        this.model = model;
        this.brand = brand;
        this.cat = cat;
        this.ac = ac;
        this.radio = radio;
        this.multi = multi;
        names.add(brand+" "+model);
    }

    public String getName() {
        return brand+" "+model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getCat() {
        return cat;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public boolean getAc() {
        return ac;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public boolean getRadio() {
        return radio;
    }

    public void setMulti(boolean multi) {
        this.multi = multi;
    }

    public boolean getMulti() {
        return multi;
    }
}
