package com.bugtrack1B.DAO;

import org.springframework.data.repository.CrudRepository;

import com.bugtrack1B.entity.MemberEntity;

public interface MemberRepository extends CrudRepository<MemberEntity, Long> {

}
