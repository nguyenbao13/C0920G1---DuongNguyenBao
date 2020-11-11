package case_study_furamaresort.models;

public class House extends Services {
    //Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.
    private String roomStandard;
    private String otherDesciption;
    private int floors;

    public House() {
    }
    public House(String roomStandard, String otherDesciption, int floors) {
        this.roomStandard = roomStandard;
        this.otherDesciption = otherDesciption;
        this.floors = floors;
    }
    public House(String nameService, double usingArea, double rentCost, int amountMax, String rentType, String id, String roomStandard, String otherDesciption, int floors) {
        super(nameService, usingArea, rentCost, amountMax, rentType, id);
        this.roomStandard = roomStandard;
        this.otherDesciption = otherDesciption;
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

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void showInfor() {
        System.out.println("House{" +
                "roomStandard='" + roomStandard + '\'' + '\n' +
                ", otherDesciption='" + otherDesciption + '\'' + '\n' +
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
