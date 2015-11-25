package cnxj.askoos.automark.model;

import java.io.Serializable;

/**
 * Created by Askoos on 2015/11/25.
 * 用户模型
 */
public class User implements Serializable {

    private Long id;// ID
    private String username;// 用户名
    private Integer age;// 年龄

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
