package favorisShop.service.serviceImpl;

import favorisShop.dao.UserDao;
import favorisShop.entity.User;
import favorisShop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    public void save(User user) {
        userDao.save(user);
    }

    public User findById(int id) {
        return userDao.findOne(id);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User selectByUsername(String phone) {
        return userDao.selectByUsername(phone);
    }
}
