public class BussInfo {
    private int busNo;
    private boolean ac;
    private int capacity;

    // Constructor
    BussInfo(int no, boolean ac, int cap) {
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }

    // Getter and Setter for busNo
    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    // Getter and Setter for ac
    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    // Getter and Setter for capacity
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public void displayBusInfo() {
    	System.out.println("Bus No: " + busNo + " Ac: " + ac + "Total capacity: " + capacity);
    }
}
