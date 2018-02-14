/// <reference path="sixteen.js"/>

myApp.factory('stringService', function(){
	 return {
		 processString: function(inputText){
			 if(inputText == undefined || inputText=="")
				 return "";
			 var outputText = inputText[0];
				for (index = 1; index < inputText.length; index++) {
					if (inputText.charAt(index).toLowerCase() == inputText
							.charAt(index)) {
						outputText = outputText + inputText.charAt(index);
					} else {
						outputText = outputText + " " + inputText.charAt(index);
					}
				}
			 return outputText;
		 }
	 };
 });

