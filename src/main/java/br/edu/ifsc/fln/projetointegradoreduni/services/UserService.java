package br.edu.ifsc.fln.projetointegradoreduni.services;


import br.edu.ifsc.fln.projetointegradoreduni.models.UserEntity;
import br.edu.ifsc.fln.projetointegradoreduni.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByUsername(username);

        if (userEntity != null){
            var springUser = User.withUsername(userEntity.getUsername())
                    .password(userEntity.getPassword())
                    .build();

            return springUser;
        }

        return null;
    }
}
