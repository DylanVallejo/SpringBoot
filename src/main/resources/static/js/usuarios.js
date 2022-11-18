// Call the dataTables jQuery plugin
$(document).ready(function() {
	cargarUsuarios()
	alert("hola  mundo");
  $('#usuarios').DataTable();
  
  async function cargarUsuarios(){
	  
	  const request	= await fetch('/usuarios',{
		  
		  method: 'GET',
		  headers: {
			  'Accept': 'application/json',
			  'Content-Type': 'application/json'
		  }
	  });
	  const usuarios = await request.json();
	  console.log(usuarios);
	  
  }
  
});
