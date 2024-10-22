package sessac.dev.webproject.user.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "user")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private int userId;

//    @Column(length = 100, nullable = false, unique = true)
//    private String email;

//    @Column(length = 256, nullable = false)
    private String password;

//    @Column(length = 11, nullable = false)
//    private String phoneNumber;

//    @Column(length = 15, nullable = false, unique = true)
    private String nickname;

//    @Column(length = 11, nullable = false)
//    private String userName;

//    @Column(length = 11)
    private String role;


//    @Builder
//    public UserInfo(int userId, String email, String password, String phoneNumber, String nickname, String userName, String role) {
//        this.userId = userId;
//        this.email = email;
//        this.password = password;
//        this.phoneNumber = phoneNumber;
//        this.nickname = nickname;
//        this.userName = userName;
//        this.role = role;
//    }
}
