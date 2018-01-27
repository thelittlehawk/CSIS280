package ba.edu.ssst.week12;

import java.util.ArrayList;

public class Group<T extends IGroupMemeber> {

    private ArrayList<T> members;

    public Group() {
        this.members = new ArrayList<>();
    }

    public void AddMember(T newMember) {
        this.members.add(newMember);
    }

    public void PrintReport() {
        for (T member:
             members) {
            System.out.println(member.toString() + " || ID (" + member.MemberId() + ")");
        }
    }

}
