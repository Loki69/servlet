<%@ page pageEncoding="UTF-8" %>
<%@page import="storage.StorageFoldersDependence"%>
<%@page import="java.util.List"%>
<%@page import="java.lang.StringBuilder"%>

<%!
    public String shouRowsTabl() {
        List<String> folders = new StorageFoldersDependence().getData();
        StringBuilder sb = new StringBuilder();
        for (String st : folders) {
            sb.append("<tr><td>").append(st).append("</td></tr>");
        }
        return sb.toString();
    }
%>

<table border="1">
    <tr>
        <th>Url</th> 
    </tr>
    <%=shouRowsTabl()%>
</table>