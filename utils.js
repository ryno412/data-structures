var utils = {
	
	displayMsg : function (domId, msg, list) {
		var el = document.querySelector(domId);
		var message = '';
		if (Array.isArray(msg)) {
	        var msgList = "";
	        for (var i= 0; i < msg.length; i++){
	            var m = msg[i];
	            msgList += "<li>" + m + "</li>"
	        }

           	message =  "<ul>"+ msgList +"</ul>"
        }

        else {
            message =  "<p>"+ msg +"</p>"
        }
        if (list) {
        	var listEl = document.createElement('p');
        	listEl.innerHTML = msg;
        	el.appendChild(listEl);
        }
        else {
        	el.innerHTML = message;
        }
		
	
	}
}