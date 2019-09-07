package com.bascomb;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Properties {

    @Value("${env}")
    String env;

    @Autowired
    public Properties() {

    }

}
