/*
package Hello.hellospring.back.repositoryback;

import static org.assertj.core.api.Assertions.assertThat;

import Hello.hellospring.domain.Member;
import Hello.hellospring.repository.MemoryMemberRepository;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class MemoryMemberBackRepositoryTestBack {

    MemoryMemberRepository repository = new MemoryMemberRepository();

        @AfterEach
        public void afterEach() {
            repository.clearStore();
        }

        @Test
        public void save() {
            //given
            Member member = new Member();
            member.setName("spring");

            repository.save(member);

            Member result = repository.findById(member.getId()).get();
            assertThat(member).isEqualTo(result);
        }

        @Test
        public void findByName() {
            //given
            Member member1 = new Member();
            member1.setName("spring1");
            repository.save(member1);

            Member member2 = new Member();
            member2.setName("spring2");
            repository.save(member2);

            Member result = repository.findByName("spring1").get();

            assertThat(result).isEqualTo(member1);
//            assertThat(result).isEqualTo(member2);
        }

    @Test
    public void findAll() {
    //given
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);
        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);
    //when
        List<Member> result = repository.findAll();
    //then
        assertThat(result.size()).isEqualTo(2);
    }
}
*/
