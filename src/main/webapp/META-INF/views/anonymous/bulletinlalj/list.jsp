<%--
- list.jsp
-
- Copyright (c) 2019 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.bulletinlalj.list.label.event" path="event" width="20%"/>
	<acme:list-column code="anonymous.bulletinlalj.list.label.momentOfEvent" path="momentOfEvent" width="20%"/>
	<acme:list-column code="anonymous.bulletinlalj.list.label.location" path="location" width="20%"/>
	<acme:list-column code="anonymous.bulletinlalj.list.label.euros" path="euros" width="20%"/>
</acme:list>