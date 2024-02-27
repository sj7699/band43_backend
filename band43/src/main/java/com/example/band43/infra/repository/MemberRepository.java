package com.example.band43.infra.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.band43.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

	public Optional<Member> findMemberByNickname(String nickname);

	public Optional<Member> findMemberById(Long id);

	public Optional<Member> findMemberBySocialId(Long id);
}
