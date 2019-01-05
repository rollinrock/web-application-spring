package studio.rollinrock.maven.archetypes.services.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import studio.rollinrock.maven.archetypes.services.UserService;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2018-12-23 19:43
 * @description
 **/
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Override
    public boolean register() {
        return false;
    }
}
