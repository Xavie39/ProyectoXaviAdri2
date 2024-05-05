package lospollos.model.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import lospollos.model.Producto;
import lospollos.model.repository.ProductoRepository;

@Repository
public class InMemoryProductoRepository implements ProductoRepository {
    private static final String URL = "jdbc:mysql://localhost:3306/polloshermanosdb";

    @Override
    public List<Producto> getAllProducts() {
        List<Producto> productos = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(URL, "root", "")) {
            Statement statement = conn.createStatement();
	        ResultSet resultSet = statement.executeQuery("SELECT * FROM producto");
	        while (resultSet.next()) {
	        	 int id = resultSet.getInt("IDProducto");
	             String nombre = resultSet.getString("Nombre");
	             String descripcion = resultSet.getString("Descripcion");
	             double precio = resultSet.getDouble("Precio");
	             int stock = resultSet.getInt("Stock");
	             String imagen = resultSet.getString("Imagen");
	             
	             Producto producto = new Producto(id, nombre, descripcion, precio, stock, imagen);
	             productos.add(producto);
	             System.out.println("nom: "+ producto.getNombre());
	        }
	        resultSet.close();
	        statement.close();
	        conn.close();
	    } catch (SQLException e) {
	        System.err.println("Connection failed: " + e.getMessage());
	    }

        return productos;
    }
}
