

<div class="config open">
        <div class="config-options">
 
<form:form action="${pageContext.request.contextPath}/contact" method="POST" commandName="message">

   
    <p hidden> <form:input  class="le-input"  path="subject" name="subject" type="hidden"/> <br/> <form:errors style="color:red;" path="subject" cssClass="error" ></form:errors></p>
                            
            
            <div class="field-row">
                <label>Your Message*</label>
                <form:textarea  rows="3" class="le-input" path="message" name="message"/>  <br/> <form:errors style="color:red;" path="message" cssClass="error" ></form:errors>
            </div>
                
            
            <button type="submit" class="dropdown-toggle btn le-button btn-block" >Send</button>
            
  </form:form> 
 
        </div>
        <a class="show-theme-options" href="#"> @</a>
</div>
