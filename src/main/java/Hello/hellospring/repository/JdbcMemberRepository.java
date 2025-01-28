package Hello.hellospring.repository;

import Hello.hellospring.domain.Member;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import javax.sql.DataSource;

public class JdbcMemberRepository implements MemberRepository{

    private final DataSource dataSource;

    public JdbcMemberRepository(DataSource dataSource) throws SQLException {
        this.dataSource = dataSource;
    }

    @Override
    public Member save(Member member) {
        // mysql과 연결가능해서 따로 수업 코드 작성 안함
        return null;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        return List.of();
    }
}
