package ch14;


import java.util.HashMap;

public class MemberHashMapTest {
    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();
        Member memberLee = new Member(1001, "Lee");
        Member memberKim = new Member(1002, "Kim");
        Member memberPack = new Member(1003, "Pack");
        Member memberHong = new Member(1003, "Hong");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberPack);
        memberHashMap.addMember(memberHong);


        memberHashMap.showAllMember();

        memberHashMap.removeMember(memberKim.getMemberId());
        memberHashMap.showAllMember();

        HashMap<Integer, String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1001, "Kim");
        hashMap.put(1002, "Lee");
        hashMap.put(1003, "Park");
        hashMap.put(1004, "Hong");

        System.out.println(hashMap);
    }
}
