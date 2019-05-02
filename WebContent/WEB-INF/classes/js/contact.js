
// Wait for the DOM to be loaded
$(document).ready(function() {
	$("#registration").validate({
	    // Specify validation rules
	    rules: {
	      // Element name is on the left. Rule is defined on the right.
	      firstName: {required:true,minlength:2},
	      lastName: "required",
	      email: {
	        required: true,
	        email: true
	      },
	      phoneNumber: {
	        required: true,
	        minlength: 9
	      }
	    },
	    // Specify validation error messages
	    messages: {
	      firstName: "Please enter your first name",
	      lastName: "Please enter your last name",
	      email: {
              required: "We need your email address to contact you",
              email: "Your email address must be in the format of name@domain.com"
          },
	      phoneNumber: {
	          required: "Please provide a phone number",
	          minlength: "Your phone number must be at least 9 characters long"
	      }
	    }	   
	 });
});




/*function validateForm() {
    var x = document.forms["registration"]["firstName"].value;
    if (x == "") {
        alert("First Name must be filled out");
        return false;
    }
}*/