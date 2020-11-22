package case_study_furama_resort.models;

public class Room extends Services {
    //Dịch vụ miễn phí đi kèm.
    private String id;
    private String freeService;

    public Room() {
    }
    public Room(String id, String freeService) {
        this.id = id;
        this.freeService = freeService;
    }
    public Room(String id, String nameService, double usingArea, double rentCost, int amountMax, String rentType, String freeService) {
        super(nameService, usingArea, rentCost, amountMax, rentType);
        this.id = id;
        this.freeService = freeService;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return id + ", " + super.toString() + ", " + freeService;
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
