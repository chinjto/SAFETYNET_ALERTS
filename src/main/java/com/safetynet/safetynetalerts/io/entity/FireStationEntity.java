package com.safetynet.safetynetalerts.io.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class FireStationEntity {

    @EqualsAndHashCode.Include
    private String address;

    private String station;

}
