package ch13.comparator;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {

        return s1.compareTo(s2) * (-1);
    }
}


public class MemberTreeSetTest {
    public static void main(String[] args) {

//        MemberTreeSet memberTreeSet = new MemberTreeSet();
//        Member memberLee = new Member(1001, "Lee");
//        Member memberKim = new Member(1002, "Kim");
//        Member memberPack = new Member(1003, "Pack");
//        Member memberHong = new Member(1004, "Hong");
//
//        memberTreeSet.addMember(memberLee);
//        memberTreeSet.addMember(memberKim);
//        memberTreeSet.addMember(memberPack);
//        memberTreeSet.addMember(memberHong);
//
//
//        memberTreeSet.showAllMember();

        TreeSet<String> set = new TreeSet<>(new MyCompare());
        set.add("Park");
        set.add("Kim");
        set.add("Lee");

        System.out.println(set);
    }
}
