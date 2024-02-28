package com.example.band43.infra.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.band43.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

	Optional<Member> findMemberByNickname(String nickname);

	Optional<Member> findMemberById(Long id);

	Optional<Member> findMemberBySocialId(Long id);
}
