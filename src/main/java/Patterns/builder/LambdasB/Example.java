package Patterns.builder.LambdasB;

public class Example {
    public void exampleLamda() {
        Person person = new PersonBuilder().builder(
           personBuilder -> {
//               personBuilder.setId("121");
//               personBuilder.setName("Algo");
//               personBuilder.setAddress("Simpre");
           }
        ).build();
    }
}
