package case_study_furama_resort.models;

public class Room extends Services {
    //Dịch vụ miễn phí đi kèm.
    private String freeService;

    public Room() {
    }
    public Room(String freeService) {
        this.freeService = freeService;
    }
    public Room(String id, String nameService, double usingArea, double rentCost, int amountMax, String rentType, String freeService) {
        super(id, nameService, usingArea, rentCost, amountMax, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + freeService;
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
