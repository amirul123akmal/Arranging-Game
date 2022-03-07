import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

import java.util.concurrent.TimeUnit;

public class kbListener extends KeyAdapter 
{
    mainGame game = new mainGame();
    boolean enable = false;
    public void keyPressed(KeyEvent event)
    {
        char receive = event.getKeyChar();
        int kc = event.getKeyCode();
        // System.out.println(receive);
        // System.out.println(kc);
        if(enable)
        {
            if(kc == KeyEvent.VK_LEFT)
                game.chooseUpdate(1);
            if(kc == KeyEvent.VK_RIGHT)
                game.chooseUpdate(0);
            else if(kc == KeyEvent.VK_SPACE)
            {
                enable = false;
                game.toggle();
                game.menuUpdate();
                return ;
            }
        }
        if(kc == KeyEvent.VK_SPACE)
        {
            enable = true;
            game.toggle();
            game.chooseUpdate(3);
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        if(receive >= 'a' && receive <= 'z')
        {
            switch(game.play(receive))
            {
                case 2:
                    
                    break;
                
                case 1:
                case 0:
                    game.menuUpdate();
                    break;
            }
        }
    }    
}
