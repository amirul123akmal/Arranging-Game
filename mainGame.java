import java.util.Random;
import java.util.ArrayList;

public class mainGame {    
    private int Qsize = 16;
    private int Bsize = 4;
    // private int question[] = new int[Qsize];
    private ArrayList<Integer> question = new ArrayList<>();
    private box loot[] = new box[Bsize];
    private Random pick = new Random();

    private int cursorCount = 0;
    private boolean cursor = false;
    private int choosenOne = 0;

    Basic basic = new Basic();

    mainGame()
    {
        basic.clear();
        for(int i = 0 ; i < Qsize ; i++)
            question.add(pick.nextInt(Bsize)+1);
        start();
    }
    public int play(char alp)
    {
        if(choosenOne == 0) return 0;
        loot[alp-'a'].insert(choosenOne);
        choosenOne = 0;
        if(question.size() == 0)
        {
            return 2;
        }
        return 1;
    }
    public void menuUpdate()
    {
        basic.clear();
        drawList();
        System.out.println("\nYou choose: " + Integer.toString(choosenOne));
        for(box a : loot)
        {
            a.update();
        }
    }
    public void chooseUpdate(int direction)
    {
        // 1 - left ; 0 - right
        if(cursor)
        {
            basic.clear();
            if(direction == 0)
                cursorCount += 2;
            else 
            if (direction == 1 && !(cursorCount <= 0))
                cursorCount -= 2;
            drawList();
            drawCursor();
        }
    }
    public void win()
    {
        basic.clear();
        
    }


    public void toggle()
    {
        if(cursor)
        {
            int index = (cursorCount/2) + (cursorCount == 0 ? 0 : 0);
            cursor = false;
            choosenOne = question.get(index);
            question.remove(index);
        }
        else
            cursor = true;
    }
    private void drawCursor()
    {
        //                  The Numbers:
        System.out.println("");
        for(int i = 0 ; i <= 12 + cursorCount ; i++)
            System.out.print(" ");
        basic.colorText("-", "BLUE", false);
    }
    private void start()
    {   
        basic.setColor("RED");
        System.out.println("============");
        System.out.println("INSTRUCTIONS");
        System.out.println("============");
        basic.setColor("GREEN");
        System.out.println(String.format("\n1. You'll be given %d numbers and %d box", Qsize, Bsize-1));
        System.out.println("2. The first box is 1 and so on");
        System.out.println("3. You can change the setting in setting.txt (further updates will be can update here)");
        System.out.println("4. Enter your input in the window");
        System.out.println("5. You may start choose by pressing space and using arrow key to move");
        basic.setColor("");
        System.out.println("");
        drawList();
        System.out.println("");
        for(char ch = 'a' ; ch < 'a'+Bsize;ch++)
        {
            loot[ch-'a'] = new box(ch);
        }
        basic.colorText("\nPress ENTER if you are ready to start...", "RED", true);
    }
    private void drawList()
    {
        basic.colorText("The numbers: ", "PURPLE", false);
        basic.setColor("YELLOW");
        for(int a : question)
            System.out.print(Integer.toString(a) + " ");
        basic.setColor("");
    }
}
