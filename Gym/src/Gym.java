import java.util.ArrayList;
import java.util.List;

public class Gym {
    //atributos
    private List<Member> member = new ArrayList<>();

    //construtores
    public Gym(){}

    //metódos

    public boolean removeMember(String name){
        for(int i=0; i<member.size(); i++){
            Member m = member.get(i);

            if(m.getName().equals(name)){
                if(m.isActive()){
                    System.out.println("Cannot remove an activer member");
                    return false;
                }
                member.remove(i);
                System.out.printf("Member %s removed successfully\n", name);
                return true;
            }
        }
        System.out.println("Member not found");
        return false;
    }

    public void addMember(Member a){
        member.add(a);
    }

    public void listMembers(){
        System.out.println("---------------------");
        System.out.println("LIST ALL MEMBERS: ");
        for(Member list: member){
            list.showInfo();
        }
    }

    public void disableMember(String nome){
        Member find = findMemberByName(nome);
        if(find != null){
            find.disable();
        }
    }

    public boolean activateMember(String name){

        Member m = findMemberByName(name);

        if (m == null) {
            System.out.println("Member not found.");
            return false;
            }
        if (m.isActive()) {
            System.out.println("Member is already active.");
            return false;
            }
        m.active();
        System.out.println("Member activated successfully.");
        return true;
        }

    public void listActiveMembers(){
        System.out.println("---------------------");
        System.out.println("LIST ACTIVE MEBMERS: ");
        for(Member a : member){
            if(a.isActive()){
                a.showInfo();
            }
        }
    }
    public Member findMemberByName(String name){
        for (Member member : member) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
}

    public void rigisterMember(int age, String name, int id){
        Member newMember = new Member(age, name, id);
        member.add(newMember);

        System.out.println("Member registered successfully. ID: " + newMember.getId());
    }
    public Member findMemberById(int id){
        for(Member m : member){
            if(m.getId() == id){
                return m;
            }
        }
        return null;
    }
}
