package action;

import behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("<< Silence >>");
    }

}