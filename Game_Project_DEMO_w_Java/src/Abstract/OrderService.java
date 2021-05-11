package Abstract;

import Entity.Campaign;
import Entity.Game;
import Entity.User;

public interface OrderService {
	void saleWithCamp(User user,Game game,Campaign campaign);
	void saleWithoutCamp(User user,Game game);
}
