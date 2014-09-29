
    function Stack (initialItems) {
        //restrict access to the stack by making it private.
        var theStack = [];
        if (initialItems && Array.isArray(initialItems)) {
            //set the stack with the initials items
            theStack = initialItems;
            console.log("stack created with: " + initialItems)
        }


        return {
            length : function () {
                return theStack.length;
            },
            push : function (item) {
                theStack.push(item);
            },

            pop : function ()  {
                return theStack.pop();
            },

            read : function () {

                if (theStack && theStack.length >0) {
                    return theStack[theStack.length -1];
                }
            },
            readAll : function () {
                console.log(theStack.toString())
            },
            isEmpty : function () {
                return theStack.length === 0;
            }

        }
    }