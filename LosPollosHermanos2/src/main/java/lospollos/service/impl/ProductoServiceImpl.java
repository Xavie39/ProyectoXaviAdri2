package lospollos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lospollos.model.Producto;
import lospollos.model.repository.ProductoRepository;
import lospollos.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public List<Producto> getAllProducts() {
		return productoRepository.getAllProducts();
	}

}
