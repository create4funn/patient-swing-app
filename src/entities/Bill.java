package entities;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer MedicalHistoryId;
    private BigInteger cost;
    private String PaymentDate;
    private Integer paytientId;

    public Bill(Integer id, Integer medicalHistoryId, BigInteger cost, String paymentDate) {
        this.id = id;
        MedicalHistoryId = medicalHistoryId;
        this.cost = cost;
        PaymentDate = paymentDate;
    }



    public Bill() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMedicalHistoryId() {
        return MedicalHistoryId;
    }

    public void setMedicalHistoryId(Integer medicalHistoryId) {
        MedicalHistoryId = medicalHistoryId;
    }

    public BigInteger getCost() {
        return cost;
    }

    public void setCost(BigInteger cost) {
        this.cost = cost;
    }

    public String getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        PaymentDate = paymentDate;
    }

    public Integer getPaytientId() {
        return paytientId;
    }

    public void setPaytientId(Integer paytientId) {
        this.paytientId = paytientId;
    }

    public Bill(Integer medicalHistoryId, BigInteger cost, String paymentDate, Integer paytientId) {
        MedicalHistoryId = medicalHistoryId;
        this.cost = cost;
        PaymentDate = paymentDate;
        this.paytientId = paytientId;
    }
}
