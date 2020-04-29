function eliminar(id) {
	swal({
		  title: "¿Esta seguro de eliminar?",
		  text: "Se eliminar permanente",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				 url:"/eliminar/"+id,
				success :function(res){
					 console.log(res);
				 }
				  
			  });
		    swal("Se elimino con exito", {
		      icon: "success",
		      
		    }).then((ok)=>{
		    	
		    	if(ok){
		    		location.href="/listar"
		    		
		    	}
		    		
		    })
		    
		    
		  } else {
		    swal("Cancelado");
		  }
		});
}








