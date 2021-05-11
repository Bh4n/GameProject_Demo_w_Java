package Concrete;

import Abstract.GameService;
import Entity.Game;
import Entity.User;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " başarıyla eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " başarıyla güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " başarıyla silindi.");
		
	}



}
