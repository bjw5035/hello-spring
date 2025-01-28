package Hello.hellospring;

import Hello.hellospring.repository.JdbcTemplatememberRepository;
import Hello.hellospring.repository.MemberRepository;
import Hello.hellospring.service.MemberService;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final DataSource dataSource;

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
        return new JdbcTemplatememberRepository(dataSource);
    }
}
