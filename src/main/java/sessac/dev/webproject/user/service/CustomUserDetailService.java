package sessac.dev.webproject.user.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sessac.dev.webproject.user.dto.CustomUserDetails;
import sessac.dev.webproject.user.entity.UserInfo;
import sessac.dev.webproject.user.repository.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService {
    private final UserRepository userRepository;

    public CustomUserDetailService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserInfo userData = userRepository.findByNickname(username);

        if (userData != null){
            return new CustomUserDetails(userData);
        }


        return null;
    }
}
