package com.example.customerCenter.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.customerCenter.model.User;

public interface UserDao extends JpaRepository<User, Long>{
	User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
    //删除
    @Transactional
    Long deleteByNickName(String nickName);
    //统计
    Long countByUserName(String userName);
    //关键词like查询
    List<User> findByEmailLike(String email);
    //关键词ignoreCase查询
    User findByUserNameIgnoreCase(String userName);
    //关键词order by 查询
    List<User> findByUserNameOrderByEmailDesc(String email);
    //排序
    List<User> findFirst10ByUserName(String username, Sort sort);
    @Transactional
    @Modifying
    @Query("update User u set u.nickName = ?1 where u.userName = ?2")
    int modifyByUserName(String nickName,String  userName);
    @Transactional
    @Modifying
    @Query("delete from User where id = ?1")
    void deleteByUserId(Long id);
    
}
