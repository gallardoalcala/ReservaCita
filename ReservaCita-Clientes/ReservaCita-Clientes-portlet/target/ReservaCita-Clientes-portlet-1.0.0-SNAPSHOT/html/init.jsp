<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="javax.portlet.PortletURL"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<%@ page import="javax.portlet.PortletPreferences" %>

<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil" %>
<%@page import="com.liferay.portlet.documentlibrary.service.DLAppServiceUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.util.DLUtil"%>

<%@page import="java.text.SimpleDateFormat" %>

<%@page import="java.util.Formatter"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Arrays" %>
<%@page import="java.util.Comparator" %>
<%@page import="java.util.Collections" %>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar" %>

<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.theme.PortletDisplay"%>

<%@ page import="com.liferay.portal.kernel.dao.orm.DynamicQuery" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil" %>

<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.HttpUtil" %>
<%@page import="com.liferay.portal.kernel.util.PortalClassLoaderUtil" %>
<%@page import="com.liferay.portal.kernel.util.GetterUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ page import="com.liferay.portal.kernel.util.Constants" %>

<%@page import="com.liferay.portal.kernel.repository.model.Folder"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil" %>

<%@page import="com.liferay.portal.theme.*" %>
<%@page import="com.liferay.portal.kernel.util.WebKeys" %>


<!-- CSS files -->
<link href="<%=request.getContextPath()%>/css/main.css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet" />

<!-- JS files -->
<script src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery-ui.js"></script>

<portlet:defineObjects />
<liferay-theme:defineObjects />