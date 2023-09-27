package MyCompany.models;

public class DTOModel {
    private String name;
    private long age;

    public DTOModel() {
    }

    public DTOModel(String name, long age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }
}
