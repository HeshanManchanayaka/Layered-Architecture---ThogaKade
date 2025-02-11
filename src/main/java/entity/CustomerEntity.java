package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "customer_V2")
public class CustomerEntity {
    @Id
    private String id;
    private String name;
    private String address;
    private Double salary;
}
