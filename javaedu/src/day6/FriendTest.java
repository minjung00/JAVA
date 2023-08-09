package day6;

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getInfo() {
        return name;
    }
}

class Friend extends Person {
    private String phoneNum;
    private String email;

    Friend(String name, String phoneNum, String email) {
        super(name);
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public String getInfo() {
        return super.getInfo() + "   " + phoneNum + "   " + email;
    }
}

public class FriendTest {
    public static void main(String[] args) {
        Friend[] friends = new Friend[5];

        friends[0] = new Friend("이름1", "111-1111", "aaa@gmail.com");
        friends[1] = new Friend("이름2", "222-2222", "bbb@gmail.com");
        friends[2] = new Friend("이름3", "333-3333", "ccc@gmail.com");
        friends[3] = new Friend("이름4", "444-4444", "ddd@gmail.com");
        friends[4] = new Friend("이름5", "555-5555", "eee@gmail.com");

        System.out.println("이름     전화번호        메일주소");
        System.out.println("----------------------------------");

        for (Friend friend : friends) {
            System.out.println(friend.getInfo());
        }
    }
}

