package Patterns.builder.lombokB;

public class Player2 {
    private String name;
    private String address;
    private String id;
    private boolean likesCoke;

    Player2(String name, String address, String id, boolean likesCoke) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.likesCoke = likesCoke;
    }

    public static Player2Builder builder() {
        return new Player2Builder();
    }

    public static class Player2Builder {
        private String name;
        private String address;
        private String id;
        private boolean likesCoke;

        Player2Builder() {
        }

        public Player2Builder name(String name) {
            this.name = name;
            return this;
        }

        public Player2Builder address(String address) {
            this.address = address;
            return this;
        }

        public Player2Builder id(String id) {
            this.id = id;
            return this;
        }

        public Player2Builder likesCoke(boolean likesCoke) {
            this.likesCoke = likesCoke;
            return this;
        }

        public Player2 build() {
            return new Player2(name, address, id, likesCoke);
        }

        public String toString() {
            return "Player2.Player2Builder(name=" + this.name + ", address=" + this.address + ", id=" + this.id + ", likesCoke=" + this.likesCoke + ")";
        }
    }
}
