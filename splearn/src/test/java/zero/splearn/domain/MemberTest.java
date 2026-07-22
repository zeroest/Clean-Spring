package zero.splearn.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static zero.splearn.domain.MemberStatus.PENDING;

class MemberTest {

    @Test
    void createMember() {
        var member = new Member("test@example.com", "test", "password");

        assertThat(member.getStatus()).isEqualTo(PENDING);
    }
}