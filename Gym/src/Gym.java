import java.util.ArrayList;
import java.util.List;

public class Gym {
    //atributos
    private List<Member> member = new ArrayList<>();

    //construtores
    public Gym(){}

    //metódos

    public boolean removeMember(String name){
        for(Member b: member){
            if(b.getName().equals(name)){
                member.remove(b);
                return true;
            }

        }
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
}}
