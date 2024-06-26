package sample.annamalai.demo_annamalai;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data// setters, getters, toString
@AllArgsConstructor
@NoArgsConstructor// default
public class KYC {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.AUTO)// auto increment
    private long accNumber;
    private String accHolder;
    private double accBalance;
    private boolean accStatus;
}
