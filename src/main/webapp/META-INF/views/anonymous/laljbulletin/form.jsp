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

<div class="jumbotron">
	<acme:message code="anonymous.laljbulletin.form.initialMessage"/>
</div>

<acme:form>
	<acme:form-textbox code="anonymous.laljbulletin.form.label.event" path="event"/>
	<acme:form-textarea code="anonymous.laljbulletin.form.label.momentOfEvent" path="momentOfEvent"/>
	<acme:form-textarea code="anonymous.laljbulletin.form.label.location" path="location"/>
	<acme:form-textarea code="anonymous.laljbulletin.form.label.euros" path="euros"/>

	<acme:form-submit code="anonymous.laljbulletin.form.button.create" action="/anonymous/lalj-bulletin/create"/>
	<acme:form-return code="anonymous.laljbulletin.form.button.return"/>
</acme:form>