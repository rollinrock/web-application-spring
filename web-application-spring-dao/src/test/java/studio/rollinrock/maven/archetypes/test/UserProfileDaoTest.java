package studio.rollinrock.maven.archetypes.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import studio.rollinrock.maven.archetypes.entity.UserProfile;
import studio.rollinrock.maven.archetypes.entity.UserProfileExample;
import studio.rollinrock.maven.archetypes.mapper.UserProfileMapper;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2019-01-15 15:48
 * @description
 **/

@Sql(scripts = "classpath:scripts/schema.sql")
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring-dao.xml")
public class UserProfileDaoTest {

//    @Autowired
//    private ApplicationContext applicationContext;

    @Autowired
    private UserProfileMapper userProfileMapper;

    @Before
    public void initialize() {

    }


    @Test
    public void insertAndCheck() {
        UserProfileExample example = new UserProfileExample();
        example.or();
        long existed = userProfileMapper.countByExample(example);

        UserProfile profile = new UserProfile();
        profile.setUid(2);
        profile.setName("cj");
        profile.setBiologicalSex("M");
        profile.setLocalLimit(0);
        Assert.assertTrue(userProfileMapper.insertSelective(profile) > 0);

        Assert.assertTrue(userProfileMapper.countByExample(example) == existed + 1);
    }



}
