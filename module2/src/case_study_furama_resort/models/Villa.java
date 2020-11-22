package case_study_furama_resort.models;

public class Villa extends Services {
    //Tiêu chuẩn phòng, Mô tả tiện nghi khác, Diện tích hồ bơi, Số tầng.
    private String id;
    private String roomStandard;
    private String otherUtility;
    private double poolArea;
    private int floors;

    public Villa() {
    }
    public Villa(String id, String roomStandard, String otherUtility, double poolArea, int floors) {
        this.id = id;
        this.roomStandard = roomStandard;
        this.otherUtility = otherUtility;
        this.poolArea = poolArea;
        this.floors = floors;
    }
    public Villa(String id, String nameService, double usingArea, double rentCost, int amountMax,
                 String rentType, String roomStandard, String otherUtility, double poolArea, int floors) {
        super(nameService, usingArea, rentCost, amountMax, rentType);
        this.id = id;
        this.roomStandard = roomStandard;
        this.otherUtility = otherUtility;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getOtherUtility() {
        return otherUtility;
    }

    public void setOtherUtility(String otherUtility) {
        this.otherUtility = otherUtility;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return id + ", " + super.toString() + ", " + roomStandard + ", " + otherUtility + ", " + poolArea + ", " + floors;
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
