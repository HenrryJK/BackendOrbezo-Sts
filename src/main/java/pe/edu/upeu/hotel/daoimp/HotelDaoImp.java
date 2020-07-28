package pe.edu.upeu.hotel.daoimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.hotel.dao.HotelDao;
import pe.edu.upeu.hotel.entity.Cliente;

@Repository
public class HotelDaoImp implements HotelDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub

return jdbcTemplate.query("select *from cliente" , BeanPropertyRowMapper.newInstance(Cliente.class));
	}

	@Override
	public int create(Cliente cli) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int edit(Cliente cli) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Cliente read(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
