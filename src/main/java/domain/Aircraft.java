package domain;




public class Aircraft {

    private int airCraft_id;
    private String type;
    private String airlineName;
    private int numberOfPass;

    public Aircraft() {
    }

    public Aircraft(int airCraft_id) {
        this.airCraft_id = airCraft_id;
    }

    public Aircraft(int airCraft_id, String type, String airlineName, int numberOfPass) {
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
