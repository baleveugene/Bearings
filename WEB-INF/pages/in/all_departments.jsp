<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="localeCode" value="${pageContext.response.locale}" />

                   
    <li><a href="/light"><spring:message code="all_departments.light" text="Industrial lighting" /></a></li>
    <li><a href="/bearings"><spring:message code="all_departments.bearings" text="Industrial bearings" /></a></li>  
                           
