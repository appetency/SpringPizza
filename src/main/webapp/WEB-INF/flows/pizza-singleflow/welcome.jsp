<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

  <head><title>Spring Pizza</title></head>

  <body>
  	<h2>Welcome to Spring Pizza!!!</h2>
	
		<form:form>
      <input type="hidden" name="_flowExecutionKey" 
             value="${flowExecutionKey}"/>  	<%--流程执行的key--%>
		  <input type="text" name="phoneNumber"/><br/>
      <input type="submit" name="_eventId_phoneEntered" value="Lookup Customer" />   <%--触发phoneEntered事件--%>
			<%--点击这个按钮提交表单时，会触发phoneEntered事
			件进而转移到lookupCustomer。--%>

		</form:form>
	</body>
</html>