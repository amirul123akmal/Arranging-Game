// import java.util.*;

public class Basic{
	private String BLACK = "\033[0;30m"; // BLACK
    private String RED = "\033[0;31m"; // RED
    private String GREEN = "\033[0;32m"; // GREEN
    private String YELLOW = "\033[0;33m"; // YELLOW
    private String BLUE = "\033[0;34m"; // BLUE
    private String PURPLE = "\033[0;35m"; // PURPLE
    private String CYAN = "\033[0;36m"; // CYAN
    private String WHITE = "\033[0;37m"; // WHITE
    private String Color_Off = "\033[0m"; // RESET
	
    public String getColor(String choice)
    {
        if (choice == "BLACK")
            return BLACK;
        else if (choice == "RED")
            return RED;
        else if (choice == "GREEN")
            return GREEN;
        else if (choice == "YELLOW")
            return YELLOW;
        else if (choice == "BLUE")
            return BLUE;
        else if (choice == "PURPLE")
            return PURPLE;
        else if (choice == "CYAN")
            return CYAN;
        else if (choice == "WHITE")
            return WHITE;
        else if (choice == "RESET")
            return Color_Off;
        return Color_Off;
    }
    public void setColor(String choice)
    {
        if (choice == "BLACK")
            System.out.print(BLACK);
        else if (choice == "RED")
            System.out.print(RED);
        else if (choice == "GREEN")
            System.out.print(GREEN);
        else if (choice == "YELLOW")
            System.out.print(YELLOW);
        else if (choice == "BLUE")
            System.out.print(BLUE);
        else if (choice == "PURPLE")
            System.out.print(PURPLE);
        else if (choice == "CYAN")
            System.out.print(CYAN);
        else if (choice == "WHITE")
            System.out.print(WHITE);
        else if (choice == "RESET")
            System.out.print(Color_Off);
        else
            System.out.print(Color_Off);
    }
    public void clear()
	{
		System.out.println("\033[H\033[2J");
		System.out.flush();
	}
    public void colorText(String str, String color, boolean enable)
    {
    	setColor(color);
        System.out.print(str + (enable ? "\n":""));
        setColor("RESET");
    }
    public void colorText(String str, int r, int g, int b, boolean enable)
    {
    	
    }
    public void pause() throws Exception
    {
        colorText("\nPress Enter to continue......", "RED", false);
        System.in.read();
    }
}
