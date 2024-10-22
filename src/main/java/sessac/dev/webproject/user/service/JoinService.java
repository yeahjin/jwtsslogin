package sessac.dev.webproject.user.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import sessac.dev.webproject.user.dto.UserDto;
import sessac.dev.webproject.user.entity.UserInfo;
import sessac.dev.webproject.user.repository.UserRepository;

@Service
public class JoinService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public JoinService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public void joinProcess(UserDto userDto){
        String password = userDto.getPassword();
        String nickname = userDto.getNickname();

        Boolean isExist = userRepository.existsByNickname(nickname);

        if (isExist){
            return;
        }

        UserInfo data = new UserInfo();

        data.setNickname(nickname);
        data.setPassword(bCryptPasswordEncoder.encode(password));
        data.setRole("ROLE_ADMIN");

        userRepository.save(data);

    }
}
