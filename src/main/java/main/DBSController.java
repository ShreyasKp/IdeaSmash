package main;

import model.Goal;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


@RestController
public class DBSController {

    @Autowired
    private DBSService DBSService;
    static String user = "";

    @RequestMapping(method = RequestMethod.POST, value ="/login")
    public void login(@RequestBody String username){
        user = username;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/calculate")
    public Goal calculateAction(@RequestBody Goal goal) {
        return DBSService.calculateAction(user, goal);
    }

}
