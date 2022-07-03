package dev.daqiang.ficusvirens.root.infra.mapper;

import dev.daqiang.ficusvirens.root.domain.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Vista Yih
 * @version 0.1.0
 * <p>
 * Created on 2019/10/20
 * Package dev.daqiang.blog.infra.mapper in ficus-virens-back
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class UserMapperTest {
    @Autowired
    UserMapper mapper;

    @Test
    public void selectTest() {
        List<User> users =  mapper.selectAll();
        assertEquals(4, users.size());
        assertEquals(3, users.get(0).getRoles().size());

        User user = mapper.selectById(1L);
        assertEquals("admin", user.getUsername());
        assertEquals(user.getRoles().size(), 3);
    }

    @Test
    public void selectByUsernameTest() {
        User user = mapper.selectByUsername("admin");
        assertEquals("admin", user.getUsername());
        assertEquals(3, user.getRoles().size());
    }

    @Test
    @Transactional
    public void deleteTest() {
        mapper.deleteById(3L);
        assertNull(mapper.selectById(3L));

        mapper.deleteRole(2L, 3L);
        User user = mapper.selectById(2L);
        assertEquals(1, user.getRoles().size());
    }

    @Test
    @Transactional
    public void insertTest() {
        User user = new User("insert", "password");
        user.setAvatar("https://www.baidu.com");
        user.setDescription("haha");
        user.setNickname("千秋");
        user.setEmail("test@test.com");
        user.setExpireTime(new Date(System.currentTimeMillis()));
        user.setEnabled(true);
        user.setLocked(true);
        mapper.insert(user);

        User user1 = mapper.selectByUsername("insert");
        assertNotNull(user1);
        assertEquals("test@test.com", user1.getEmail());
    }

    @Test
    @Transactional
    public void updateTest() {
        User user = mapper.selectById(3L);
        user.setUsername("Vista");
        user.setAvatar("https://www.baidu.com");
        user.setDescription("haha");
        user.setNickname("千秋");
        user.setEmail("test@test.com");
        user.setExpireTime(new Date(System.currentTimeMillis()));
        user.setEnabled(true);
        user.setLocked(true);

        mapper.update(user);
        User user1 = mapper.selectById(3L);
        assertEquals("Vista", user1);
    }

    @Test
    @Transactional
    public void userRoleTest() {
        mapper.deleteRole(3L, 3L);
        User user = mapper.selectById(3L);
        assertEquals(2, user.getRoles().size());

        mapper.addRole(3L, 3L);
        User user1 = mapper.selectById(3L);
        assertEquals(3, user1.getRoles().size());
    }
}
