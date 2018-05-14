
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<li class="dropdown le-dropdown">
    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
        <i class="fa fa-list"></i> <spring:message code="dropdown_le_dropdown.shopbydepartment" text="CNC Machines From Germany" />
    </a>

    <ul class="dropdown-menu">
        <!--<li><a href="vmc">Vertical machine centers</a></li>-->
    <%@include file="all_departments.jsp" %>

    </ul>


</li>