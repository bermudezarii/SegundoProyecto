/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$('#consult-form').submit(function(e) {
    e.preventDefault();
    
    var response = $('#consult-response');
    var requestid = $('#id-request').val();

    $.ajax({
        type: 'GET',
        url: 'ServletConsultUI',
        dataType: 'text',
        contentType: "application/json; charset=utf-8",
        data: {
            request: requestid
        },
        cache: false,
        success: function(result) {
            response.html("<p>"+result+"</p>");
        },
        error: function(){
            response.html("<p>Error: No se ha podido realizar la solicitud.</p>")
        }
    });
});