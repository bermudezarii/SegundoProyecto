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
            response.html("<p>Error: No se ha podido realizar la solicitud.</p>")
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