package Concrete;

import Abstract.OrderService;
import Entity.Campaign;
import Entity.Game;
import Entity.User;

public class OrderManager implements OrderService{

	@Override
	public void saleWithCamp(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName() + " adl� ki�i  " + game.getName() + " oyununu "+campaign.getName()+" ile beraber ba�ar�l� bir �ekilde sat�n ald�.");;
		
		
	}

	@Override
	public void saleWithoutCamp(User user, Game game) {
		System.out.println(user.getFirstName() + " adl� ki�i  " + game.getName() + " oyununu ba�ar�l� bir �ekilde sat�n ald�.");
		
	}

}
