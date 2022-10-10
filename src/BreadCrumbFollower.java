//import kareltherobot.*;
//import karel.*;
//import kareltherobot.Robot;

import kareltherobot.Robot;

public class BreadCrumbFollower extends Robot
{
    public BreadCrumbFollower(int s, int a, Direction d, int b)
    {
        super(s,a,d,b);
    }

    // complete the following method (plus others as needed)
    public void travel()
    {
        int count = 0;
        while(true) {
            boolean found = false;
            if (frontIsClear()) {
                move();

                if (nextToABeeper()) {
                    pickBeeper();
                    found = true;
                    count = 0;
                } else {
                    turnLeft();
                    turnLeft();
                    move();
                    turnLeft();
                }
                if (!found) {
                    count++;
                }
            } else {
                turnLeft();
                turnLeft();
                turnLeft();
                count++;
            }
            if(count>=4) {
                break;
            }
        }
    }
}