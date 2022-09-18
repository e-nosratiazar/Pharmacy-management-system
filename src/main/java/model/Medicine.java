package model;

public class Medicine {
    private int id;
    private String name;
    private String consumptionInstruction;
    private DrugForm drugForm;
    private int powerOfMedicine;
    private boolean doesExist;
    private double price;

    public Medicine(String name, DrugForm drugForm, int powerOfMedicine) {
        this.name = name;
        this.drugForm = drugForm;
        this.powerOfMedicine = powerOfMedicine;
    }

    public Medicine(String name, String consumptionInstruction, DrugForm drugForm, int powerOfMedicine, boolean doesExist, double price) {
        this.name = name;
        this.consumptionInstruction = consumptionInstruction;
        this.drugForm = drugForm;
        this.powerOfMedicine = powerOfMedicine;
        this.doesExist = doesExist;
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConsumptionInstruction() {
        return consumptionInstruction;
    }

    public void setConsumptionInstruction(String consumptionInstruction) {
        this.consumptionInstruction = consumptionInstruction;
    }

    public DrugForm getDrugForm() {
        return drugForm;
    }

    public void setDrugForm(DrugForm drugForm) {
        this.drugForm = drugForm;
    }

    public int getPowerOfMedicine() {
        return powerOfMedicine;
    }

    public void setPowerOfMedicine(int powerOfMedicine) {
        this.powerOfMedicine = powerOfMedicine;
    }

    public boolean isDoesExist() {
        return doesExist;
    }

    public void setDoesExist(boolean doesExist) {
        this.doesExist = doesExist;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "\n\tname: " + name +
                "\tdrugForm: " + drugForm +
                "\tpowerOfMedicine: " + powerOfMedicine
                ;
    }
}
