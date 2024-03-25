package Patterns.builder.lombokB;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;


@Getter
@ToString
@Builder(setterPrefix = "set")
public class Player0 {
    private String name;
    private String address;
    private String id;
    private boolean likesCoke;
}
