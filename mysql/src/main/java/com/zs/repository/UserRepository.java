package com.zs.repository;

import com.zs.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018/7/15.
 */
public interface UserRepository extends JpaRepository<User,Integer>{
}
