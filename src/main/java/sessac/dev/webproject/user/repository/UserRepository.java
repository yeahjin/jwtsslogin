package sessac.dev.webproject.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sessac.dev.webproject.user.entity.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo,Integer> {
    Boolean existsByNickname(String nickname);

    UserInfo findByNickname(String nickname);

}
