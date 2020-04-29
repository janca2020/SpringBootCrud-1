
function sololetras(e){
	
    key=e.keyCode || e.which;
    letras = " abcdefghijklmnñopqrstuvwxyz";
	teclado = String.fromCharCode(key).toLowerCase();
	especiales = "8-37-38-46";
     
	tecladoEspecial=false;
	
	for (var i in  especiales){
		
		if(key==letras[i]){
            tecladoEspecial=true;break;
            
			
            
			
		}
		if(letras.indexOf(teclado)==-1 && !tecladoEspecial)
		
		return false;
	}
	
}




function solonumeros(e){
	
	key=e.keyCode || e.which;
	teclado = String.fromCharCode(key);
	especiales = "8-37-38-46";
	numero ="0123456789";
	tecladoEspecial=false;
	
	for (var i in  especiales){
		
		if(key==especiales[i]){
			tecladoEspecial=true;
			
			
			
		}
		if(numero.indexOf(teclado)==-1 && !tecladoEspecial)
		
		return false;
	}
	
}









