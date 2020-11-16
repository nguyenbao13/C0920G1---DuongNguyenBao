package case_study_furama_resort.models;

public class Room extends Services {
    //Dịch vụ miễn phí đi kèm.
    private String freeService;

    public Room() {
    }
    public Room(String freeService) {
        this.freeService = freeService;
    }
    public Room(String nameService, double usingArea, double rentCost, int amountMax, String rentType, String id, String freeService) {
        super(nameService, usingArea, rentCost, amountMax, rentType, id);
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
        return "Room{" +
                "freeService='" + freeService + '\'' +
                super.toString() +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
