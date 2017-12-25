package huan.router;
import huan.Application;
import huan.model.User;
import huan.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index(Model model) {
        Message message = new Message(1, 1234, "success");
        model.addAttribute("message", "this is a message");
        return "index";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save(String  name, String password) {
        User user = new User(name, password);
        userService.save(user);
        return "save success!";
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public Message getUser(String  name) {
        User user = userService.getUser(name);
        Message message = new Message(1, user, "success1");
        return message;
    }
}


