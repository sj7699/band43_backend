package com.example.band43.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseEntity {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String password;

	private Long socialId;

	private String email;

	private String nickname;

	private String profileImage;

	private String salt;

}
