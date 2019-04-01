package pl.danplo.dbservice.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.danplo.dbservice.model.Role;
import pl.danplo.dbservice.model.User;
import pl.danplo.dbservice.repository.RoleRepository;
import pl.danplo.dbservice.repository.UserRepository;
import pl.danplo.dbservice.repository.UserService;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.HashSet;

@Service("userService")
@Transactional
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private RoleRepository roleRepository;



    @Override
    public void saveUser(User user) {
        user.setActive(1);
        Role role = roleRepository.findByRole("ROLE_USER");
        user.setRoles(new HashSet<Role>(Arrays.asList(role)));
        userRepository.save(user);


    }
}
