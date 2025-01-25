/*
package Hello.hellospring.back.repositoryback;


import Hello.hellospring.back.domainback.MemberBack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

*/
/**
 * 동시성 문제가 고려되어 있지 않음, 실무에서는 ConcurrentHashMap, AtomicLong 사용 고려
 *//*

public class MemoryMemberRepositoryBack implements MemberRepositoryBack {
    private static Map<Long, MemberBack> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public MemberBack save(MemberBack memberBack) {
        memberBack.setId(++sequence);
        store.put(memberBack.getId(), memberBack);
        return memberBack;
    }

    @Override
    public Optional<MemberBack> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<MemberBack> findByName(String name) {
        return store.values().stream()
                .filter(memberBack -> memberBack.getName().equals(name))
                .findAny();
    }

    @Override
    public List<MemberBack> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
*/
