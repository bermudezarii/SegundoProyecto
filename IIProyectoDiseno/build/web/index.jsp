<%-- 
    Document   : index
    Created on : 15/06/2017, 02:36:50 PM
    Author     : epikhdez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
       
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    
        <title>Formulario de Solicitud</title>

           <!-- CSS -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100italic,300,300italic,400,400italic,500,500italic">        
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="assets/css/animate.css">
        <link rel="stylesheet" href="assets/css/style.css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="assets/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">

        <link href="assets/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.10.0/css/bootstrap-select.min.css">
        <link href="http://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css" rel="stylesheet">
        <link href="assets/css/owl.carousel.css" rel="stylesheet">
        <link href="assets/css/owl.carousel.theme.min.css" rel="stylesheet">
        <link href="assets/css/main.css" rel="stylesheet">

        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>
    <body data-spy="scroll" data-target="#main-navbar">

        <!-- NavigationBar Section -->
            <nav class="navbar navbar-default navbar-fixed-top">
                <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#main-navbar" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                  </button>
                  <a class="navbar-brand" href="#">
                    <img class="img-responsive" src="assets/images/logo.png" alt="logo">
                  </a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="main-navbar">
                  <ul class="nav navbar-nav navbar-right">
                    <li class="active"><a href="#home">Inicio <span class="sr-only">(current)</span></a></li>
                    <li><a href="#form">Formulario</a></li>
                    <li><a href="#consult">Consultar</a></li>
                    <li><a href="#contact">Contáctenos</a></li>
                  </ul>
                </div><!-- /.navbar-collapse -->
                </div><!-- /.container-fluid -->
                </nav>

        <!-- Header Section -->
            <header id="home" class="header overlay-dark">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-4">
                            <div class="intro-box c-table">
                                <div class="intro ct-cell">
                                    <h1>Modificación de Actas</h1>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </header>

      
           

      
   
        <!-- Form -->
            <section id="form" class="clients">
                	<!-- Contact Form -->
		<div class="c-form-container section-container section-container-image-bg">
	        <div class="container">
	        	
	            <div class="row">
	                <div class="col-sm-8 col-sm-offset-2 c-form section-description wow fadeIn">
	                    <h1><strong>Formulario de Solicitud</strong></h1>
	                   
	                </div>
	            </div>
	            
	            <div class="row">
	            	<div class="col-sm-6 col-sm-offset-3 c-form-box wow fadeInUp">
	            		
	                    
                        <div class="c-form-bottom">
		                    <form role="form" action="assets/contact.php" method="post">
                                        <div class="form-group">
		                    		<label for="c-form-name">
		                    			<span class="label-text">ID/Carné solicitante:</span> 
		                    			<span class="contact-error"></span>
		                    		</label>
		                        	<input type="text" name="name" placeholder="" class="c-form-name form-control" id="c-form-name">
		                        </div>
		                    	<div class="form-group">
		                    		<label for="c-form-name">
		                    			<span class="label-text">Nombre:</span> 
		                    			<span class="contact-error"></span>
		                    		</label>
		                        	<input type="text" name="name" placeholder="" class="c-form-name form-control" id="c-form-name">
		                        </div>
                                        <div class="form-group">
		                    		<label for="c-form-name">
		                    			<span class="label-text">Carné estudiante:</span> 
		                    			<span class="contact-error"></span>
		                    		</label>
		                        	<input type="text" name="name" placeholder="" class="c-form-name form-control" id="c-form-name">
		                        </div>
                                        	<div class="form-group">
		                    		<label for="c-form-name">
		                    			<span class="label-text">Nombre del Estudiante:</span> 
		                    			<span class="contact-error"></span>
		                    		</label>
		                        	<input type="text" name="name" placeholder="" class="c-form-name form-control" id="c-form-name">
		                        </div>
		                    	<div class="form-group">
		                    		<label for="c-form-email">
		                    			<span class="label-text">Correo:</span> 
		                    			<span class="contact-error"></span>
		                    		</label>
		                        	<input type="text" name="email" placeholder="" class="c-form-email form-control" id="c-form-email">
		                        </div>
		                        <div class="form-group">
		                        	<label for="c-form-subject">
		                    			<span class="label-text">Teléfono:</span> 
		                    			<span class="contact-error"></span>
		                    		</label>
		                        	<input type="text" name="subject" placeholder="" class="c-form-subject form-control" id="c-form-subject">
		                        </div>
                                        	<div class="form-group">
		                    		<label for="c-form-name">
		                    			<span class="label-text">Periodo:</span> 
		                    			<span class="contact-error"></span>
		                    		</label>
		                        	<input type="text" name="name" placeholder="" class="c-form-name form-control" id="c-form-name">
		                        </div>
                                        <div class="form-group">
		                    		<label for="c-form-name">
		                    			<span class="label-text">Curso:</span> 
		                    			<span class="contact-error"></span>
		                    		</label>
		                        	<input type="text" name="name" placeholder="" class="c-form-name form-control" id="c-form-name">
		                        </div>
                                        	<div class="form-group">
		                    		<label for="c-form-name">
		                    			<span class="label-text">Grupo:</span> 
		                    			<span class="contact-error"></span>
		                    		</label>
		                        	<input type="text" name="name" placeholder="" class="c-form-name form-control" id="c-form-name">
		                        </div>
		                        <div class="form-group">
		                        	<label for="c-form-message">
		                    			<span class="label-text">Detalle de la Solicitud:</span> 
		                    			<span class="contact-error"></span>
		                    		</label>
		                        	<textarea name="message" placeholder="" class="c-form-message form-control" id="c-form-message"></textarea>
		                        </div>
		                        <button type="submit" class="btn">Enviar</button>
		                    </form>
	                    </div>
	                    
	                </div>
	            </div>
	            
	        
	            
	        </div>
        </div>
            </section>

        <!-- Consult -->
            <section id="consult" class="faq overlay-light">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="title-box">
                                <h2 class="section-title">Consultar solicitud</h2>
                            </div>
                        </div>
                    </div>
                    
                    <div class="row">
                        <div class="col-sm-4 col-sm-offset-4 c-form-box wow fadeInUp">
                            <div class="c-form-bottom form-overlap">
                                <form role="form" action="ServletConsultUI" method="get">
                                    <div class="form-group">
                                        <label for="c-form-name">
                                            <h3>Número de solicitud:</h3> 
                                            <span class="contact-error"></span>
                                        </label>
                                        <input type="text" name="request" placeholder="" class="c-form-name form-control" id="id-request">
                                    </div>
                                    <button type="submit" class="btn">Consultar</button>
                                </form>
                            </div>
                        </div>
                    </div>
                    <br>

                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3">
                            <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                                <div class="panel panel-default">
                                    <div class="panel-heading" role="tab" id="headingOne">
                                            <h4>
                                            Estado de la solicitud:
                                            </h4>
                                    </div>
                                    <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
                                        <div class="panel-body">
                                            ${empty state ? "Presione consultar para mostrar el estado de la solicitud." : state}
                                        </div>
                                    </div>
                                </div>
                                
                            </div>
                        </div>
                    </div>
                </div>
            </section>

        <!-- Contact -->
            <section id="contact" class="contact">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="title-box">
                            
                                <h2 class="section-title">Contáctenos</h2>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3">
                            <img src="assets/images/logo.png" alt="logo" class="contact-logo">
                            <p>
                               
                            </p>
                            <ul>
                                <li><span class="ion-location"></span>Instituto Tecnológico de Costa Rica</li>
                                <li><span class="ion-android-call"></span>2550-2307</li>
                                <li><span class="ion-paper-airplane"></span> ersolano@itcr.ac.cr </li>
                            </ul>
                        </div>
                        
                    </div>
                </div>
            </section>

        
       
        
        <!-- Scripts -->
        <script src="assets/js/jquery-1.12.3.min.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.10.0/js/bootstrap-select.min.js"></script>
        <script src="assets/js/owl.carousel.min.js"></script>
        <script src="assets/js/script.js"></script>
        <script src="assets/js/jquery-1.11.1.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.backstretch.min.js"></script>
        <script src="assets/js/wow.min.js"></script>
    </body>
</html>
