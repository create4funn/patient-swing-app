package entities;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "medical_history")
public class MedicalHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer paytientId;
    String date;
    String description;
    String name;
    String status;
    int cost;

    public MedicalHistory() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPaytientId() {
        return paytientId;
    }

    public void setPaytientId(Integer paytientId) {
        this.paytientId = paytientId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public MedicalHistory(Integer paytientId, String date, String description, String name, String status, int cost) {
        this.paytientId = paytientId;
        this.date = date;
        this.description = description;
        this.name = name;
        this.status = status;
        this.cost = cost;
    }
}
