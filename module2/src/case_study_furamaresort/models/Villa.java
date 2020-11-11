package case_study_furamaresort.models;

public class Villa extends Services {
    //Tiêu chuẩn phòng, Mô tả tiện nghi khác, Diện tích hồ bơi, Số tầng.
    private String roomStandard;
    private String otherDesciption;
    private double poolArea;
    private int floors;

    public Villa() {
    }
    public Villa(String roomStandard, String otherDesciption, double poolArea, int floors) {
        this.roomStandard = roomStandard;
        this.otherDesciption = otherDesciption;
        this.poolArea = poolArea;
        this.floors = floors;
    }
    public Villa(String nameService, double usingArea, double rentCost, int amountMax, String rentType, String id, String roomStandard, String otherDesciption, double poolArea, int floors) {
        super(nameService, usingArea, rentCost, amountMax, rentType, id);
        this.roomStandard = roomStandard;
        this.otherDesciption = otherDesciption;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getOtherDesciption() {
        return otherDesciption;
    }

    public void setOtherDesciption(String otherDesciption) {
        this.otherDesciption = otherDesciption;
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
    public void showInfor() {
        System.out.println("Villa{" +
                "roomStandard='" + roomStandard + '\'' + '\n' +
                ", otherDesciption='" + otherDesciption + '\'' + '\n' +
                ", poolArea=" + poolArea + '\n' +
                ", floors=" + floors + '\n' +
                ", nameService='" + nameService + '\'' + '\n' +
                ", usingArea=" + usingArea + '\n' +
                ", rentCost=" + rentCost + '\n' +
                ", amountMax=" + amountMax + '\n' +
                ", rentType='" + rentType + '\'' + '\n' +
                ", id='" + id + '\'' +
                '}');
    }
}
