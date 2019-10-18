<%--
- form.jsp
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

<acme:form>
	<acme:form-textbox code="anonymous.bulletinlalj.form.label.event" path="event"/>
	<acme:form-textarea code="anonymous.bulletinlalj.form.label.momentOfEvent" path="momentOfEvent"/>
	<acme:form-textarea code="anonymous.bulletinlalj.form.label.location" path="location"/>
	<acme:form-textarea code="anonymous.bulletinlalj.form.label.euros" path="euros"/>

	<acme:form-submit code="anonymous.bulletinlalj.form.button.create" action="/anonymous/bulletin-lalj/create"/>
	<acme:form-return code="anonymous.bulletinlalj.form.button.return"/>
</acme:form>