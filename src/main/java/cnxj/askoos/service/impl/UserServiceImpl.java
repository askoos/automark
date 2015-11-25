package cnxj.askoos.service.impl;

import cnxj.askoos.model.User;
import cnxj.askoos.service.IUserService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Askoos on 2015/11/25.
 */
@Service
public class UserServiceImpl  implements IUserService {

    /**
     * 缓存的key
     */
    public static final String USER_ALL_KEY = "\"user_all\"";
    /**
     * value属性表示使用哪个缓存策略，缓存策略在ehcache.xml
     */
    public static final String USER_CACHE_NAME = "allShare";

    @CacheEvict(value = USER_CACHE_NAME, key = USER_ALL_KEY)
    @Override
    public void add(User user) {
        Long id = getNextId();
        user.setId(id);
        user.setUsername("Askoos");
        user.setAge(35);
        data.put(id, user);
    }

    @Cacheable(value = USER_CACHE_NAME, key = "#user.getId()+'thing'")
    @Override
    public User findById(Long id) {
        System.err.println("没有走缓存！" + id);
        return data.get(id);
    }

    @Cacheable(value = USER_CACHE_NAME, key = USER_ALL_KEY)
    @Override
    public List<User> findAll() {
        return Lists.newArrayList(data.values());
    }


    @Override
    @CachePut(value = USER_CACHE_NAME, key = "#user.getId()+'User'")
    @CacheEvict(value = USER_CACHE_NAME, key = USER_ALL_KEY)
    public User update(User user) {
        System.out.println(user);
        data.put(user.getId(), user);
        return user;
    }

    @CacheEvict(value = USER_CACHE_NAME)
    @Override
    public void delete(Long id) {
        data.remove(id);
    }

}
