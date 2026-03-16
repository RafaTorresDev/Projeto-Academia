public class Member {
    //atributos
    private String name;
    private int age;
    private boolean status;
    private static int counter = 1;
    private int id;

    //construtores
    public Member(int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.status = true;
        this.id = counter++;
    }

    //getter e setter


    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0){
            this.age = age;}
        else{
            System.out.println("ERROR!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //metódos
    public void registerMember(String name, int age, int id){
    }
    public boolean isActive(){
        return status;
    }
    public void active(){
        status = true;
    }
    public void disable(){
        status = false;
    }
    public void showInfo(){
        System.out.printf(
                "ID: %d | Name: %s | Age: %d | Status: %s\n",
                id, name, age, status
        );
    }
}
