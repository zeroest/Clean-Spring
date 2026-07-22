package zero.splearn.domain;

import lombok.Getter;

import static zero.splearn.domain.MemberStatus.PENDING;

public class Member {

    private String email;

    private String nickname;

    private String passwordHash;

    @Getter
    private MemberStatus status;

    public Member(String email, String nickname, String passwordHash) {
        this.email = email;
        this.nickname = nickname;
        this.passwordHash = passwordHash;
        this.status = PENDING;
    }

}
