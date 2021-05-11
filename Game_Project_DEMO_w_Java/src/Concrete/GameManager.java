package Concrete;

import Abstract.GameService;
import Entity.Game;
import Entity.User;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " ba�ar�yla eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " ba�ar�yla g�ncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " ba�ar�yla silindi.");
		
	}



}
