<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
	<section class="container">
	 <div class="row">
		 <c:forEach items="${productos}" var="product">
			 <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
				 <div class="thumbnail">
					 <div class="caption">
						 <h3>${product.nombre}</h3>
						 <p>${product.descripcion}</p>
						 <p>${product.precio}</p>
						 <p>Hi ha ${product.stock} unitats enmagatzem</p>
					 </div>
				 </div>
			 </div>
		 </c:forEach>
	 </div>
	 </section>
</body>
</html>