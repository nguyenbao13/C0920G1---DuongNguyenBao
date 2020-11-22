package case_study_furama_resort.models;

public abstract class Services {
    //Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa,
    // Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ).
    protected String nameService;
    protected double usingArea;
    protected double rentCost;
    protected int amountMax;
    protected String rentType;

    public Services() {
    }
    public Services(String nameService, double usingArea, double rentCost, int amountMax, String rentType) {
        this.nameService = nameService;
        this.usingArea = usingArea;
        this.rentCost = rentCost;
        this.amountMax = amountMax;
        this.rentType = rentType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUsingArea() {
        return usingArea;
    }

    public void setUsingArea(double usingArea) {
        this.usingArea = usingArea;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getAmountMax() {
        return amountMax;
    }

    public void setAmountMax(int amountMax) {
        this.amountMax = amountMax;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return nameService + ", " + usingArea + ", " +
                rentCost + ", " + amountMax + ", " + rentType;
    }

    public abstract void showInfor();
}
