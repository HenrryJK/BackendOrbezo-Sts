package pe.edu.upeu.hotel;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.hotel.dao.HotelDao;

@SpringBootTest
class Exa03OrbezoBackApplicationTests {
	@Autowired
	private HotelDao hotelDao;
	@Test
	void contextLoads() {
	}
	
}
