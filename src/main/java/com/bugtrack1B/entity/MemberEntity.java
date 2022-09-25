package com.bugtrack1B.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MemberEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long memberId;
	
	private String memberFname;
	private String memberLname;
	private String memberEmail;
	private String memberTitle;
	
	public MemberEntity() {
		
	}
	
	public MemberEntity(String memberFname, String memberLname, String memberEmail, String memberTitle) {
		super();
		this.memberFname = memberFname;
		this.memberLname = memberLname;
		this.memberEmail = memberEmail;
		this.memberTitle = memberTitle;
	}
	
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public String getMemberFname() {
		return memberFname;
	}
	public void setMemberFname(String memberFname) {
		this.memberFname = memberFname;
	}
	public String getMemberLname() {
		return memberLname;
	}
	public void setMemberLname(String memberLname) {
		this.memberLname = memberLname;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberTitle() {
		return memberTitle;
	}
	public void setMemberTitle(String memberTitle) {
		this.memberTitle = memberTitle;
	}
	
}
