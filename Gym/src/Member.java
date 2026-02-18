public class Member {
    private String name;
    private int age;
    private boolean status;

    //construtores
    public Member(int age, String name) {
        this.age = age;
        this.name = name;
        this.status = true;
    }
    public Member(){}

    //getter e setter
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
        System.out.printf(" Name: %s\n Age: %d\n Status: %s\n\n", name, age, status);
    }
}
