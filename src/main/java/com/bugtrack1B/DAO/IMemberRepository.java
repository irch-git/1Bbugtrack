package com.bugtrack1B.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bugtrack1B.entity.MemberEntity;

public interface IMemberRepository extends CrudRepository<MemberEntity, Long> {
	
	@Override
	public List<MemberEntity> findAll();
}
