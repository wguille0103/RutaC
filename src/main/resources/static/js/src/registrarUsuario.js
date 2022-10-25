
function loadData(){
    console.log('Hola entre a funcion....');
    let request = sendRequest('usuario', 'GET', '')
    let table = document.getElementById('usuario-table');
    table.innerHTML = "";
    request.onload = function(){
        
        let data = request.response;
        console.log(data);
        data.forEach(element => {
            table.innerHTML += `
                <tr> 
                    <td>${element.tipoIdentificacion}</td>  
                    <td>${element.documento}</td>    
                    <td>${element.nombres}</td>   
                    <td>${element.apellidos}</td> 
                    <td>${element.celular}</td>     
                    <td>${element.email}</td>                 
                    <td>${element.sexo}</td>
                    <td>${element.estado}</td>
                    <td>
                        <button type="button" class="btn btn-primary" onclick='window.location = "form_registrarUsuario.html?id=${element.id}"'>Editar</button>
                        <button type="button" class="btn btn-danger" onclick='deleteProducto(${element.id})'>Eliminar</button>
                    </td>
                </tr>

                `
        });
    }
    request.onerror = function(){
        table.innerHTML = `
            <tr>
                <td colspan="6">Error al recuperar los datos.</td>
            </tr>
        `;
    }
}


