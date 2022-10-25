const url = "http://193.122.154.164:8080/RutaC/"             
//const url = "http://localhost:8080/"

function  sendRequest(endPoint, method, data){
    let request = new XMLHttpRequest();
    request.open(method, url+endPoint);
    //console.log('Hola entre a funcion....', url+endPoint );
    request.responseType = 'json';
    request.setRequestHeader('Content-Type','application/json');    
    request.send(data ? JSON.stringify(data): data);
    return request
}