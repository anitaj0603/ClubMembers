import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ClubMembers club = new ClubMembers();
        String[] newMembers = {"SMITH, JANE", "FOX, STEVE", "XIN, MICHAEL", "GARCIA, MARIA"};
        club.addMembers(newMembers, 2019);
        System.out.println("Initial members:");
        System.out.println(club.getMemberList());

        ArrayList<MemberInfo> roster = new ArrayList<>();
        roster.add(new MemberInfo("SMITH, JANE", 2019, false));
        roster.add(new MemberInfo("FOX, STEVE", 2018, true));
        roster.add(new MemberInfo("XIN, MICHAEL", 2017, false));
        roster.add(new MemberInfo("GARCIA, MARIA", 2020, true));
        club.setMemberList(roster);

        System.out.println("\nBefore removal:");
        System.out.println(club.getMemberList());

        ArrayList<MemberInfo> graduated = club.removeMembers(2018);
        System.out.println("\nGraduated members in good standing:");
        System.out.println(graduated);

        System.out.println("\nRemaining members:");
        System.out.println(club.getMemberList());
    }
}