package main;

import model.Goal;
import org.springframework.stereotype.Service;

@Service
public class DBSService {


    public Goal calculateAction(String username, Goal goal) {
        return goal;
    }
}
