package dev.daqiang.ficusvirens.root.infra.mapper;

import dev.daqiang.ficusvirens.root.domain.entity.Role;
import dev.daqiang.ficusvirens.root.domain.enums.RoleEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Vista Yih
 * @version 0.1.0
 * <p>
 * Created on 2019/10/23
 * Package dev.daqiang.blog.infra.mapper in ficus-virens-back
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class RoleMapperTest {

    @Autowired
    private RoleMapper mapper;

    @Test
    public void selectTest() {
        List<Role> roles = mapper.selectAll();
        assertEquals(roles.size(), 4);


        Role role = mapper.selectById(1L);
        assertEquals(role.getRoleName(), RoleEnum.ADMIN);

        List<Role> roles1 = mapper.selectByUserId(1L);
        assertEquals(roles1.size(), 3);

        List<Role> roles2 = mapper.selectByUsername("admin");
        assertEquals(roles2.size(), 3);
    }
}
