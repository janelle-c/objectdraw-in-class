package smcs.battis.tankwars;
import objectdraw.*;

public class TankWars extends WindowController {
	private KeyboardManager keyboardManager;
	
	public void begin() {
		keyboardManager = new KeyboardManager(canvas);
		for (int i = 0; i < 10; i++) {
			new Wall(canvas);
		}
		new Tank(keyboardManager, new KeyboardBinding(), canvas);
		new Tank(keyboardManager, new KeyboardBinding(), canvas);
		new Tank(keyboardManager, new KeyboardBinding(), canvas);
	}
}
