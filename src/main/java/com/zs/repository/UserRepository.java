package com.zs.repository;

import com.zs.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/7/1.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
