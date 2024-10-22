package sessac.dev.webproject.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sessac.dev.webproject.user.dto.UserDto;
import sessac.dev.webproject.user.service.JoinService;

@Controller
@ResponseBody
public class JoinController {

    private final JoinService joinService;

    public JoinController(JoinService joinService) {
        this.joinService = joinService;
    }

    @PostMapping("/join")
    public String joinProcess(UserDto userDto){
        joinService.joinProcess(userDto);
        return "ok";
    }
}
