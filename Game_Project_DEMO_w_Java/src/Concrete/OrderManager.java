package Concrete;

import Abstract.OrderService;
import Entity.Campaign;
import Entity.Game;
import Entity.User;

public class OrderManager implements OrderService{

	@Override
	public void saleWithCamp(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName() + " adlý kiþi  " + game.getName() + " oyununu "+campaign.getName()+" ile beraber baþarýlý bir þekilde satýn aldý.");;
		
		
	}

	@Override
	public void saleWithoutCamp(User user, Game game) {
		System.out.println(user.getFirstName() + " adlý kiþi  " + game.getName() + " oyununu baþarýlý bir þekilde satýn aldý.");
		
	}

}
