
<!DOCTYPE HTML>
<html>
<title>Input Details</title>
  <head>
  	<style>
	body: { 

	}
	</style>
    <link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/css/bootstrap-combined.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" media="screen"
     href="http://tarruda.github.com/bootstrap-datetimepicker/assets/css/bootstrap-datetimepicker.min.css">
  </head>
  <body style="padding-left: 40% ; padding-top: 20%">
    <form method="post" action="${pageContext.request.contextPath}/api/urldata">
    DATE:
    <div id="datetimepicker1" class="input-append date">
      <input name="datepicker" id = "date" type="text" style="width:20.5%" value="Choose Date"></input>
      <span class="add-on">
        <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i>
      </span>
    </div>
    
    TIME: 
    <div id="datetimepicker" class="input-append date">
      <input name="timepicker" type="text" style="width:20.5%" value="Choose Time "></input>
      <span class="add-on">
        <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i>
      </span>
    </div>
    
    NEXRAD Station:
    <div id="nexrad_station"> 
        <select style="width:24%" name="nexrad_station">
        	<option value="">Select</option>
  			<option value="KABR">KABR</option>
  			<option value="KABX">KABX</option>
  			<option value="KAKQ">KAKQ</option>
  			<option value="KAMA">KAMA</option>
            <option value="KAMX">KAMX</option>
           	<option value="KAPX">KAPX</option>
            <option value="KIND">KIND</option>
            
		</select>
    </div>
    <br>
    
    <input type="submit" value="Submit" style="width: 24%">
    </form>


</script>
	<script type="text/javascript"
     	src="http://cdnjs.cloudflare.com/ajax/libs/jquery/1.8.3/jquery.min.js">
    </script> 
    <script type="text/javascript"
     	src="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/js/bootstrap.min.js">
    </script>
    <script type="text/javascript"
     	src="http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.min.js">
    </script>
    <script type="text/javascript"
     	src="http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.pt-BR.js">
    </script>
    <script type="text/javascript">
      $('#datetimepicker').datetimepicker({
        format: 'hh:mm:ss',
		pickDate: false,
		pick12HourFormat: true
      });
    </script>
    <script type="text/javascript">
      $('#datetimepicker1').datetimepicker({
        format: 'yyyy/MM/dd',
		pickTime: false,
      });
    </script>
  </body>
<html>
<!-- References Used: https://tarruda.github.io/bootstrap-datetimepicker/-->
