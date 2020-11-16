package case_study_furama_resort.models;

public class House extends Services {
    //Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.
    private String roomStandard;
    private String otherUtility;
    private int floors;

    public House() {
    }
    public House(String roomStandard, String otherUtility, int floors) {
        this.roomStandard = roomStandard;
        this.otherUtility = otherUtility;
        this.floors = floors;
    }
    public House(String nameService, double usingArea, double rentCost, int amountMax, String rentType, String id, String roomStandard, String otherUtility, int floors) {
        super(nameService, usingArea, rentCost, amountMax, rentType, id);
        this.roomStandard = roomStandard;
        this.otherUtility = otherUtility;
        this.floors = floors;
    }

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

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", otherUtility='" + otherUtility + '\'' +
                ", floors=" + floors +
                super.toString() +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
