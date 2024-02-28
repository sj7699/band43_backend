package com.example.band43.application.dto;

import lombok.Builder;

@Builder
public record MemberDto(
	Long memberId,
	Long socialId,
	String nickname,
	String email,
	String profileImageUrl,
	String profileImageFileName

) {
}
