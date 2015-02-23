package org.example;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import lombok.Getter;
import lombok.Setter;

@RequestScoped
@Named
public class ExampleBean {

    @Getter
    @Setter
    private String greeting = "Hello World!";

}
