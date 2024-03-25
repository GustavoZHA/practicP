package Patterns.builder.staticinner;

public class Student {
    public static String temp;
    private String name;
    private String address;
    private String id;
    private boolean lovesCoffee;

    public static String getTemp() {
        return temp;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }

    public boolean isLovesCoffee() {
        return lovesCoffee;
    }

    public Student(String name, String address, String id, boolean lovesCoffee) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.lovesCoffee = lovesCoffee;
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private String name;
        private String address;
        private String id;
        private boolean lovesCoffee;

        public Student build() {
            return new Student(name,address,id,lovesCoffee);
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setLovesCoffee(boolean lovesCoffee) {
            this.lovesCoffee = lovesCoffee;
            return this;
        }
    }
}
