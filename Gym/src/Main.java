public class Main{
    public static void main(String[] args){
        //obejtos:
        Gym gym = new Gym();
        Member m1 = new Member(21, "Rafael");
        Member m2 = new Member(20, "Leticia");
        Member m3 = new Member(52, "Carla");

        gym.addMember(m1);
        gym.addMember(m2);
        gym.addMember(m3);

        m2.disable();

        gym.listMembers();
        gym.listActiveMembers();

        Member find = gym.findMemberByName("Rafael");
        if(find != null){
            find.disable();
        }
        gym.listActiveMembers();

        gym.removeMember("Rafael");
        gym.listMembers();
        gym.removeMember("João");

    }
}

