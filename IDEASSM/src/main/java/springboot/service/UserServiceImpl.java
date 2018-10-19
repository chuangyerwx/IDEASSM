package springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springboot.dao.UserDao;
import springboot.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17.
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao ud;     //需要把错误级别调成warn

    @Override
    public void insert(User u) {
        ud.insert(u);
    }

    @Override
    public List<User> selectAll() {

        return ud.selectAll();
    }
}
