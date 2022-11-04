package com.rnd.kafkaproducer.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProducerRequest {

    private String name;
    private String address;
    private Integer totalData;
    private Integer number;

}
