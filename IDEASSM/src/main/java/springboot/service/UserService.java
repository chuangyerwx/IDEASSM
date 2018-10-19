package springboot.service;

import springboot.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17.
 */
public interface UserService {

    public void insert(User u);

    public List<User> selectAll();
}
