package homework4.add_task;
import java.net.Inet4Address;
import java.util.*;

public class Ticket { //extends Service {

    private int id;
    private String serviceName;
    private String problemDescription;
    private boolean isActive;
    private int customerId;
    private int supportSpecialistId;

    public void addTicket(int id, Service serviceName, String problemDescription, Service isActive, int customerId){
        this.id = id;
        this.serviceName = serviceName.getServiceName();
        this.problemDescription = problemDescription;
        this.isActive = isActive.isActive();
        this.customerId = customerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getSupportSpecialistid() {
        return supportSpecialistId;
    }

    public void setSupportSpecialistid(int supportSpecialistid) {
        supportSpecialistId = supportSpecialistid;
    }
}
