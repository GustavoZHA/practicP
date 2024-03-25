package Patterns.builder.LambdasB;

import lombok.Setter;

import java.util.function.Consumer;

@Setter
public class PersonBuilder {
    private String name;
    private String address;
    private String id;
    private boolean likesCoke;

    public PersonBuilder builder(Consumer<PersonBuilder> personBuilder){
        personBuilder.accept(this);
        return this;
    }

    public Person build(){
        return new Person(name,address,id,likesCoke);
    }
}
