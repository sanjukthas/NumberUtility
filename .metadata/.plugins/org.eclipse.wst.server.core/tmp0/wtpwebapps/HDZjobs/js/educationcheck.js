$(document).ready(function() {
	
	
	$('.ValidateEdu').click(function (event) {
	
		 var idItem = $(this).attr('id');
		 var id = idItem.substring(11);
		 var comment=document.getElementById('addcomment').value;
		 var dataString ='eduid='+ id + "&addcomment=" + comment;
		 $.ajax({  
			    type: "GET",  
			    url: "EducationForm",
           data: dataString,
           success: function(data){
        	   alert("Education Validated!");
               window.location = 'http://localhost:8080/HDZJobs/educationcheck.jsp';
             }                
			  });
		
	 
	 
});            
	$('.FailEdu').click(function (event) {
		 var idItem = $(this).attr('id');
		 var id = idItem.substring(7);
		 var comment=document.getElementById('addcomment').value;
		 var dataString ='eduid='+ id + "&addcomment=" + comment;
		 
		 $.ajax({  
			    type: "POST",  
			    url: "EducationForm",
          data: dataString,
          success: function(data){
        	  alert("Failed to Verify Education");
              window.location = 'http://localhost:8080/HDZJobs/educationcheck.jsp';
            }                
			  });
	}); 
		 
		
	 
	             
		  
	
});