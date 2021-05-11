package UI;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Concrete.UserManager;
import Concrete.ValidationManager;
import Entity.Campaign;
import Entity.Game;
import Entity.User;

public class Main {
	
	public static void main(String[] args) {
		
		
		User user1 = new User(1, "Enes Bahan", "Morova", 1999, "1234567890");
		User user2 = new User(2, "Engin", "Demiroð", 1985, "1234567890");
		UserManager userManager = new UserManager(new ValidationManager());
		userManager.add(user1);
		System.out.println("--------------");
		
		Game game1 = new Game(1,"Counter Strike Global Offensive",80);
		Game game2 = new Game(2,"Battlefield V",539);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		System.out.println("--------------");
		Campaign campaign1 = new Campaign(1, "Yaza Merhaba Kampanyasý", 0.5);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		System.out.println("--------------");
		OrderManager orderManager = new OrderManager();
		orderManager.saleWithCamp(user1, game1, campaign1);

		orderManager.saleWithoutCamp(user2, game2);
		
	}
}
