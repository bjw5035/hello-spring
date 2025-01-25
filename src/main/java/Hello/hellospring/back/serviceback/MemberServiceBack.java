/*
package Hello.hellospring.back.serviceback;

import Hello.hellospring.back.domainback.MemberBack;
import Hello.hellospring.back.repositoryback.MemberRepositoryBack;
import java.util.List;
import java.util.Optional;

public class MemberServiceBack {

    private final MemberRepositoryBack memberRepositoryBack;

    public MemberServiceBack(MemberRepositoryBack memberRepositoryBack) {
        this.memberRepositoryBack = memberRepositoryBack;
    }

    */
/*
     * 회원가입
     * *//*

    public Long join(MemberBack memberBack) {
        validateDuplicateMember(memberBack); // 중복 회원 검증
        memberRepositoryBack.save(memberBack);
        return memberBack.getId();
    }

    private void validateDuplicateMember(MemberBack memberBack) {
        memberRepositoryBack.findById(memberBack.getId())
                .ifPresent(m -> {
                    throw new IllegalArgumentException("이미 존재하는 회원입니다.");
                });
    }

    */
/*
     * 전체 회원 조회
     * *//*

    public List<MemberBack> findMembers() {
        return memberRepositoryBack.findAll();
    }

    public Optional<MemberBack> findOne(Long memberId) {
        return memberRepositoryBack.findById(memberId);
    }
}
*/
