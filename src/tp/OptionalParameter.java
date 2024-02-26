package tp;

public class OptionalParameter {
    private String name;
    private String city;

    public OptionalParameter(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public OptionalParameter(String name) {
        this(name, "Bhusawal");
    }

    public static void main(String[] args) {
        OptionalParameter optionalParameter = new OptionalParameter("Navin","Pune");
        System.out.println(optionalParameter.name);
        System.out.println(optionalParameter.city);
    }
}
