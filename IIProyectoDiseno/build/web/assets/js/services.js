/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function() {
    var period = $('#periods');
    
    $.ajax({
        type: 'GET',
        url: 'ServletPeriods',
        dataType: 'text',
        contentType: "text/html; charset=utf-8",
        cache: false,
        success: function(result) {
            period.html(result);
        },
        error: function(){
        }
    });
});

$('#consult-form').submit(function(e) {
    e.preventDefault();
    
    var response = $('#consult-response');
    var requestid = $('#id-request').val();

    $.ajax({
        type: 'GET',
        url: 'ServletConsultUI',
        dataType: 'text',
        contentType: "text/html; charset=utf-8",
        data: {
            request: requestid
        },
        cache: false,
        success: function(result) {
            response.html(result);
        },
        error: function(){
            response.html("<p>Error: No se ha podido realizar la consulta.</p>")
        }
    });
});

$('#request-form').submit(function(e) {
    e.preventDefault();
    
    console.log($('#courses').val());

    $.ajax({
        type: 'GET',
        url: 'ServletFormUI',
        dataType: 'text',
        contentType: "text/html; charset=utf-8",
        data: {
            requesterid: $('#requesterid').val(),
            requestername: $('#requestername').val(),
            studentid: $('#studentid').val(),
            studentname: $('#studentname').val(),
            email: $('#email').val(),
            phone: $('#phone').val(),
            period: $('#periods').val(),
            course: $('#courses').val(),
            group: $('#groups').val(),
            details: $('#details').val()
        },
        cache: false,
        success: function(result) {
            alert(result);
        },
        error: function(){
            alert("Error: No se ha podido realizar la solicitud.")
        }
    });
});

$periods = $('#periods');
$courses = $('#courses');
$groups = $('#groups');

$periods.change (
    function() {
        $groups.html("<option></option>");
        
        $.ajax({
            type: "GET",
            url: "ServletCourses",
            dataType: 'text',
            contentType: "text/html; charset=utf-8",
            data: {
                period: $periods.val() 
            },
            success: function(data){
                $courses.html(data);
            }
        });
    }
);

$courses.change (
    function() {
        $.ajax({
            type: "GET",
            url: "ServletGroups",
            dataType: 'text',
            contentType: "text/html; charset=utf-8",
            data: {
                course: $courses.val(),
                period: $periods.val()
            },
            success: function(data){
                $groups.html(data);
            }
        });
    }
);