package com.zs.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Administrator on 2018/7/15.
 */
@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;
    private String password;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"age\":")
                .append(age);
        sb.append(",\"password\":\"")
                .append(password).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
