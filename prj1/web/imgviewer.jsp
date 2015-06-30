
<html>
	<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Images Viewer</title>

    <!-- Bootstrap core CSS -->
    <link href="../css/bootstrap.min.css" rel="stylesheet" />
	<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
	
	<script type="text/javascript">
	
		function initSlider(){
			var div = document.createElement('div');
		}
	</script>
	<style type="text/css">
		h1 {
			font-family: cursive;
			font-variant: small-caps;
			font-size: 50px;
		}
		body{
			margin: 0;
			background-color: rgba(6, 255, 0, 0.34);
			background-image: linear-gradient(to left, rgba(74, 255, 0, 1) 0%, rgba(8, 66, 16, 1) 98%);
		}
		.container{
			text-align: center;
			margin: 1%;
			padding: 5%;
			background-color: rgb(127, 147, 147);
			height: auto;
			min-height: 100%;
			width: auto;
		}
		.btn {
			margin-top: 50px;
			border-radius: 25px;
			padding: 5px 20px;
			background-color: lime;
			cursor: pointer;
			border: 0px;
			color: rgb(86, 86, 86);
			transition: background-color 0.2s ease-in-out;
		}
		.btn:hover {
			background-color: rgba(0, 255, 0, 0.30);
		}
		#slider1_container{
			display: none;
			position: relative;
			margin: 0;
			margin-top: 50px;
			width: 100%!important;
			max-height: 500px!important;
			height: 442px;
			overflow: hidden;
		}
	</style>
	</head>
		<body>
			<div class="container">
				<h1>Images Viewer</h1>
				<div id="slider1_container">
		            <!-- Loading Screen -->
		            <div u="loading" style="position: absolute; top: 0px; left: 0px;">
		                <div style="filter: alpha(opacity=70); opacity:0.7; position: absolute; display: block;
		
		                background-color: #000; top: 0px; left: 0px;width: 100%; height:100%;">
		                </div>
		                <div style="position: absolute; display: block; background: url(../img/loading.gif) no-repeat center center;
		
		                top: 0px; left: 0px;width: 100%;height:100%;">
		                </div>
		            </div>
		
		            <!-- Slides Container -->
		            <div u="slides" id="slides" style="cursor: move; position: absolute; left: 0px; top: 0px; width: 1140px; height: 442px;
		            overflow: hidden;">
		                <div>
		                    <img u="image" src2="../File/01.jpg" />
		                </div>
		                <div>
		                    <img u="image" src2="../File/02.jpg" />
		                </div>
		                <div>
		                    <img u="image" src2="../File/03.jpg" />
		                </div>
		                <div>
		                    <img u="image" src2="../File/04.jpg" />
		                </div>
		            </div>
		            
		            <style>
		                
		                .jssorb05 {
		                    position: absolute;
		                }
		                .jssorb05 div, .jssorb05 div:hover, .jssorb05 .av {
		                    position: absolute;
		                    width: 16px;
		                    height: 16px;
		                    background: url(../img/b05.png) no-repeat;
		                    overflow: hidden;
		                    cursor: pointer;
		                }
		                .jssorb05 div { background-position: -7px -7px; }
		                .jssorb05 div:hover, .jssorb05 .av:hover { background-position: -37px -7px; }
		                .jssorb05 .av { background-position: -67px -7px; }
		                .jssorb05 .dn, .jssorb05 .dn:hover { background-position: -97px -7px; }
		            </style>
		            <!-- Slider navigator container -->
		            <div u="navigator" class="jssorb05" style="bottom: 16px; right: 6px;">
		                <div u="prototype"></div>
		            </div>
		          
		            <style>
		                .jssora11l, .jssora11r {
		                    display: block;
		                    position: absolute;
		                    /* size of arrow element */
		                    width: 37px;
		                    height: 37px;
		                    cursor: pointer;
		                    background: url(../img/a11.png) no-repeat;
		                    overflow: hidden;
		                }
		                .jssora11l { background-position: -11px -41px; }
		                .jssora11r { background-position: -71px -41px; }
		                .jssora11l:hover { background-position: -131px -41px; }
		                .jssora11r:hover { background-position: -191px -41px; }
		                .jssora11l.jssora11ldn { background-position: -251px -41px; }
		                .jssora11r.jssora11rdn { background-position: -311px -41px; }
		            </style>
		            <!-- Arrow Left -->
		            <span u="arrowleft" class="jssora11l" style="top: 123px; left: 1%;">
		            </span>
		            <!-- Arrow Right -->
		            <span u="arrowright" class="jssora11r" style="top: 123px; right: 1%;">
		            </span>
		        </div>
			</div>
			
			<script src="../js/jquery-1.9.1.min.js"></script>
		    <script src="../js/bootstrap.min.js"></script>
		    <script src="../js/docs.min.js"></script>
		    
		    <script src="../js/ie10-viewport-bug-workaround.js"></script>
		    <script type="text/javascript" src="../js/jssor.slider.mini.js"></script>
		    
		    <script>
		  //function to start the slider    
		    jssor_slider1_starter = function (containerId) {
					    	var options = {
					                $AutoPlay: true,                                    //[Optional] Whether to auto play, to enable slideshow, this option must be set to true, default value is false
					                $AutoPlaySteps: 1,                                  //[Optional] Steps to go for each navigation request (this options applys only when slideshow disabled), the default value is 1
					                $AutoPlayInterval: 10000,                           //[Optional] Interval (in milliseconds) to go for next slide since the previous stopped if the slider is auto playing, default value is 3000
					                $PauseOnHover: 1,                                   //[Optional] Whether to pause when mouse over if a slider is auto playing, 0 no pause, 1 pause for desktop, 2 pause for touch device, 3 pause for desktop and touch device, 4 freeze for desktop, 8 freeze for touch device, 12 freeze for desktop and touch device, default value is 1
					
					                $ArrowKeyNavigation: true,   			            //[Optional] Allows keyboard (arrow key) navigation or not, default value is false
					                $SlideEasing: $JssorEasing$.$EaseOutQuint,          //[Optional] Specifies easing for right to left animation, default value is $JssorEasing$.$EaseOutQuad
					                $SlideDuration: 800,                                //[Optional] Specifies default duration (swipe) for slide in milliseconds, default value is 500
					                $MinDragOffsetToSlide: 20,                          //[Optional] Minimum drag offset to trigger slide , default value is 20
					                //$SlideWidth: 600,                                 //[Optional] Width of every slide in pixels, default value is width of 'slides' container
					                //$SlideHeight: 300,                                //[Optional] Height of every slide in pixels, default value is height of 'slides' container
					                $SlideSpacing: 0, 					                //[Optional] Space between each slide in pixels, default value is 0
					                $DisplayPieces: 1,                                  //[Optional] Number of pieces to display (the slideshow would be disabled if the value is set to greater than 1), the default value is 1
					                $ParkingPosition: 0,                                //[Optional] The offset position to park slide (this options applys only when slideshow disabled), default value is 0.
					                $UISearchMode: 1,                                   //[Optional] The way (0 parellel, 1 recursive, default value is 1) to search UI components (slides container, loading screen, navigator container, arrow navigator container, thumbnail navigator container etc).
					                $PlayOrientation: 1,                                //[Optional] Orientation to play slide (for auto play, navigation), 1 horizental, 2 vertical, 5 horizental reverse, 6 vertical reverse, default value is 1
					                $DragOrientation: 1,                                //[Optional] Orientation to drag slide, 0 no drag, 1 horizental, 2 vertical, 3 either, default value is 1 (Note that the $DragOrientation should be the same as $PlayOrientation when $DisplayPieces is greater than 1, or parking position is not 0)
					
					                $ArrowNavigatorOptions: {                           //[Optional] Options to specify and enable arrow navigator or not
					                    $Class: $JssorArrowNavigator$,                  //[Requried] Class to create arrow navigator instance
					                    $ChanceToShow: 2,                               //[Required] 0 Never, 1 Mouse Over, 2 Always
					                    $AutoCenter: 2,                                 //[Optional] Auto center arrows in parent container, 0 No, 1 Horizontal, 2 Vertical, 3 Both, default value is 0
					                    $Steps: 1,                                      //[Optional] Steps to go for each navigation request, default value is 1
					                    $Scale: false                                   //Scales bullets navigator or not while slider scale
					                },
					
					                $BulletNavigatorOptions: {                                //[Optional] Options to specify and enable navigator or not
					                    $Class: $JssorBulletNavigator$,                       //[Required] Class to create navigator instance
					                    $ChanceToShow: 2,                               //[Required] 0 Never, 1 Mouse Over, 2 Always
					                    $AutoCenter: 1,                                 //[Optional] Auto center navigator in parent container, 0 None, 1 Horizontal, 2 Vertical, 3 Both, default value is 0
					                    $Steps: 1,                                      //[Optional] Steps to go for each navigation request, default value is 1
					                    $Lanes: 1,                                      //[Optional] Specify lanes to arrange items, default value is 1
					                    $SpacingX: 12,                                   //[Optional] Horizontal space between each item in pixel, default value is 0
					                    $SpacingY: 4,                                   //[Optional] Vertical space between each item in pixel, default value is 0
					                    $Orientation: 1,                                //[Optional] The orientation of the navigator, 1 horizontal, 2 vertical, default value is 1
					                    $Scale: false                                   //Scales bullets navigator or not while slider scale
					                }
		                        };

				            $("#slider1_container").css("display", "block");
				            var jssor_slider1 = new $JssorSlider$("slider1_container", options);
				
				            function ScaleSlider() {
				                var parentWidth = jssor_slider1.$Elmt.parentNode.clientWidth;
				                if (parentWidth) {
				                    jssor_slider1.$ScaleWidth(parentWidth - 30);
				                }
				                else
				                    window.setTimeout(ScaleSlider, 30);
				            }
				            ScaleSlider();
				
				            $(window).bind("load", ScaleSlider);
				            $(window).bind("resize", ScaleSlider);
				            $(window).bind("orientationchange", ScaleSlider);
				            
		                    };
	   
		     $.ajax({
		    	 url:"/prj1/DispatchServlet?jspUrl=getImages",
                 success:function(data){
                     var imgurls_str=data;
                     var imgurls=imgurls_str.split(';');
                     var imgHtmls='';
                     if(imgurls.length<=1){
                    	 jssor_slider1_starter('slider1_container');
                    	 return;
                     }
                     for(var i=0;i<imgurls.length;++i){
                    	 if(imgurls[i].length>=3){
                    		 imgHtmls+='<div><img u="image" style="padding: 0 23%;width: auto!important;" src2="../File/'+imgurls[i]+'" /></div>'; 
                    	 }
                     }
                     $("#slides").html(imgHtmls);
                     jssor_slider1_starter('slider1_container');
                 }
             });
		    </script>
		</body>
</html>
