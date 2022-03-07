import java.util.ArrayList;

public class box {

    ArrayList<Integer> menu = new ArrayList<>();
    char theName = 'a';
    box(char name)
    {
        this.theName = name;
        draw(name);
    }
    public void update()
    {
        draw(theName, menu);
    }
    public void insert(int a)
    {
        menu.add(a);
    }

    private void draw(char name)
    {
        System.out.println("\n  --\n" + name + " |\n  --");
    }
    private void draw(char name, ArrayList<Integer> updated)
    {
        int i;
        System.out.print("  --");
        for(i = 0 ; i < updated.size() ; i++)
            System.out.print("-");
        System.out.print("\n"+Character.toString(name)+" |");
        for(i = 0 ; i < updated.size() ; i++)
            System.out.print(Integer.toString(updated.get(i)));
        System.out.print("\n  --");
        for(i = 0 ; i < updated.size() ; i++)
            System.out.print("-");
        System.out.println("");
    }

}
