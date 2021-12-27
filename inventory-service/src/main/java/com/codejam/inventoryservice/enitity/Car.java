package com.codejam.inventoryservice.enitity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String modelType;
    @ManyToOne
    private Brand brand;
    @ManyToOne
    private Category category;
    @OneToMany(mappedBy = "car")
    private List<CarItem> carItems;
}
