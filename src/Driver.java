import kareltherobot.*;

public class Driver
{
    public static void main(String[] args)
    {
        World.setVisible(true);
        //World.reset();
        World.readWorld("/Users/ddevadas/IdeaProjects/Data_Structures/src", "RandomColumns.kwld");
        World.setDelay(1);
        World.setTrace(false);
        try {Thread.sleep(8000); } catch (Exception e){};

        ColumnPicker carol = new ColumnPicker(1,1,Directions.North,-1);
        carol.countColumns();
    }
}
