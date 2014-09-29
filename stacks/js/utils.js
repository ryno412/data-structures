
YUI().add('messenger', function (Y) {


    function Messenger (domId, messages){
        this.domEl = Y.one(domId);
    }

    Messenger.prototype = {
        displayMessage : function (msg, msgHeading) {
            var formattedMsg = this.buildMessages(msg);
            this.domEl.getDOMNode().innerHTML = "<h1>" + msgHeading+"</h1>" + formattedMsg;


        },

        buildMessages : function(msg) {
            if (Array.isArray(msg)) {
                var m = "";
                for (var i= 0; i < msg.length; i++){
                    var message = msg[i];
                    m += "<li>" + message+ "</li>"
                }
                return "<ul>"+ m +"</ul>"
            }
            else {
                return "<p>"+ msg +"</p>"
            }
        }
    }

    Y.MSG = Messenger;

},{requires: ["node"]});