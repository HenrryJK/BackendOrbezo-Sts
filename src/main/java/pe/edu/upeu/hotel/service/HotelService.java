package pe.edu.upeu.hotel.service;

import java.util.List;

import pe.edu.upeu.hotel.entity.Cliente;

public interface HotelService {
	List<Cliente>readAll();
	int create (Cliente cli);
	int edit (Cliente cli);
	int delete(int id);
	Cliente read(int id);
}
