package main;

import model.Goal;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


@RestController
public class DBSController {

    @Autowired
    private DBSService DBSService;
    public static String user = "";

    @RequestMapping(method = RequestMethod.POST, value ="/login")
    public String login(@RequestBody String username){
        user = username;
        return username;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/calculate")
    public String calculateAction(@RequestBody Goal goal) {
        return DBSService.calculateAction(user, goal);
    }

}
