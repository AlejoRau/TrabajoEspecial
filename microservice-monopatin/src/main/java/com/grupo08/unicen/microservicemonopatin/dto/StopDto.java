package com.grupo08.unicen.microservicemonopatin.dto;

import com.grupo08.unicen.microservicemonopatin.entity.Stop;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class StopDto {
    private UUID id;
    private int x;
    private int y;
    private String address;

}
