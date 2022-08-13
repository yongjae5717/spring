package hello.hellospring.repository;
import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    // Optional 사용하는 이유? null을 그냥 반환하는 것 보다는 Optional을 이용하여 감싸여 반환한다.
    Optional<Member> findById(Long id);
    Optional<Member> findByname(String name);
    List<Member> findAll();

    void clearStore();
}
