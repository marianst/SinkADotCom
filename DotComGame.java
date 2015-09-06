public class DotComGame{
	public static void main (String[] args){
		DotCom theDotCom = new DotCom();
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		int randonNum = (int) (Math.random() * 5);
		int[] locations = {randonNum,randonNum+1,randonNum+2};
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
		while(isAlive == true){
				String guess = helper.getUserInput("Insira um numero");
				String result = theDotCom.checkYourself(guess);
				numOfGuesses ++;
				if (result.equals("kill")){
					isAlive = false;
					System.out.println("Voce usou " + numOfGuesses + "palpites");
				}
			
		}
	}
}
