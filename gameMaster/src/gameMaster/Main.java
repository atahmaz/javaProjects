package gameMaster;

import java.time.LocalDate;

import gameMaster.Concrete.CampaignManager;
import gameMaster.Concrete.GameManager;
import gameMaster.Concrete.UserManager;
import gameMaster.Entities.BlackFridayCampaign;
import gameMaster.Entities.Game;
import gameMaster.Entities.Gamer;
import gameMaster.Entities.User;
import gameMaster.ServiceAdapters.MernisServiceAdapter;


public class Main {

	public static void main(String[] args) {
		
		CampaignManager campaignManager = new CampaignManager();
		GameManager gameManager = new GameManager(new MernisServiceAdapter());
		UserManager userManager = new UserManager();
		
		
		Gamer gamer1= new Gamer(1,100);
		gamer1.setFirstName("AYÇA AYŞEN");
		gamer1.setLastName("TAHMAZ");
		gamer1.setDateOfBirth(LocalDate.of(1994, 05, 07));
		gamer1.setIdentityNumber(24970828358L);
		gamer1.setMoney(300);
		
	
		Gamer gamer2= new Gamer(1,100);
		gamer2.setFirstName("Cantürk");
		gamer2.setLastName("Ataş");
		gamer2.setDateOfBirth(LocalDate.of(1994, 11, 03));
		gamer2.setIdentityNumber(11111111112L);
		
		User[] users = {gamer1,gamer2};
		
		Game game = new Game(1,"Battlefield 2",180);
		BlackFridayCampaign campaign1 = new BlackFridayCampaign();
		campaign1.setDiscount(10);
		gameManager.discount(game, campaign1);
		userManager.add(users);
		
		gameManager.sell(game, gamer1);
		

	}

}