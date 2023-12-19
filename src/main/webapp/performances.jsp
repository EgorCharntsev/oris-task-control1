<%@ page import="ru.kpfu.itis.charntsev.model.Performance" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/header.jsp"%>

<%int count = 1;
    List<Performance> performances = (List<Performance>) request.getSession().getAttribute("performances");
%>

<div class="index">
    <div>
        <select>

            <%for(Performance performance : performances) {%>
            <option value="<%=count%>"><%=performance.getName()%></option>

            <%count++;
            }%>
        </select>
    </div>
</div>

<%@include file="/footer.jsp"%>