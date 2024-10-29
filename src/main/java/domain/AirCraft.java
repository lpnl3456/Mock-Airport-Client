package domain;




public class AirCraft {

    private int airCraft_id;
    private String type;
    private String airlineName;
    private int numberOfPass;

    public AirCraft() {
    }

    public AirCraft(int airCraft_id) {
        this.airCraft_id = airCraft_id;
    }

    public AirCraft(int airCraft_id, String type, String airlineName, int numberOfPass) {
        this.airCraft_id = airCraft_id;
        this.type = type;
        this.airlineName = airlineName;
        this.numberOfPass = numberOfPass;
    }

    public int getAirCraft_id() {
        return airCraft_id;
    }

    public void setAirCraft_id(int airCraft_id) {
        this.airCraft_id = airCraft_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getNumberOfPass() {
        return numberOfPass;
    }

    public void setNumberOfPass(int numberOfPass) {
        this.numberOfPass = numberOfPass;
    }
}
