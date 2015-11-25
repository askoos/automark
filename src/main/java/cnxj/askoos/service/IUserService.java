package cnxj.askoos.service;

import cnxj.askoos.model.User;

import java.util.List;

/**
 * Created by Askoos on 2015/11/25.
 */
public interface IUserService {

    public void add(User user);
    public User findById(Long id);
    public List<User> findAll();
    public User update(User user);
    public void delete(Long id);

}
