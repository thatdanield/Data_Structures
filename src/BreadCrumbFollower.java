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
        if(nextToABeeper()) {
            //pickBeeper();
        }
        while(count<3) {
            boolean found = false;
            if (frontIsClear()) {
                move();

                if (nextToABeeper()) {
                    //pickBeeper();
                    found = true;
                    count = 0;
                } else {
                    if(count!=1) {
                        turnLeft();
                        turnLeft();
                        move();
                        turnLeft();
                    } else {
                        turnLeft();
                        turnLeft();
                        move();
                    }
                }
                if (!found) {
                    count++;
                }
            } else {
                if(count!=1) {
                    turnLeft();
                    turnLeft();
                    turnLeft();
                } else {
                    turnLeft();
                    turnLeft();
                }
                count++;
            }
        }
    }
}