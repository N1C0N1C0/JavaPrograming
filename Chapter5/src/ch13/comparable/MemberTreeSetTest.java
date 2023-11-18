package ch13.comparable;

public class MemberTreeSetTest {
    public static void main(String[] args) {

        MemberTreeSet memberTreeSet = new MemberTreeSet();
        Member memberLee = new Member(1001, "Lee");
        Member memberKim = new Member(1002, "Kim");
        Member memberPack = new Member(1003, "Pack");
        Member memberHong = new Member(1004, "Hong");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberPack);
        memberTreeSet.addMember(memberHong);


        memberTreeSet.showAllMember();

    }
}
