

import lakhan.org.interfaces.Game;

public class BlackGame implements Game {
	static  String myGame;
	

	public static String getMyGame() {
		return myGame;
	}


	public void setMyGame(String myGame) {
		this.myGame = myGame;
	}


	@Override
	public void displaygame() {
		System.out.println(BlackGame.getMyGame());
		
		
	}

}
