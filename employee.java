public class employee {
    private String fio;
    private String post;
    private String email;
    private String cellphone;
    private double salary;
    private int age;

    employee(String fio, String post, String email, String cellphone, double salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.cellphone = cellphone;
        this.salary = salary;

            this.age = age;

    }

    int GetAge() {
        return age;
    }

    void Show() {
        System.out.println(fio + " " + post + " " +  email + " " + cellphone + " " + salary + " " + age);
    }
}