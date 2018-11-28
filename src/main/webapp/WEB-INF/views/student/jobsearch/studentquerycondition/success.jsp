<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>新增职业查询条件</h1>
<form action="${pageContext.request.contextPath }/student/jobsearch/studentquerycondition/testadd" method="post">
    <%--<tr>--%>
        <%--<td>查询名称</td>--%>
        <%--<td><input type="text" name="queryname"/></td>--%>
    <%--</tr>--%>
    <tr>
        <td>省份名称</td>
        <td><select name="srcList"  id="typenum" size="8" multiple>
            <c:forEach items="${resultProvince}" var="resp" varStatus="status">
            <option   value="${resp.provinceid}">${resp.provincename}</option>
            </c:forEach>
        </select>
        </td>
    </tr>

        <tr>
            <td>所有行业</td>
            <td><select name="srcList1"  id="typenum1" size="4" multiple>
                <c:forEach items="${resultIndustry}" var="resp" varStatus="status">
                    <option   value="${resp.industryID}">${resp.industryName}</option>
                </c:forEach>
            </select>
            </td>
        </tr>

        <tr>
        <td>岗位类型</td>
        <td><select name="srcList2"  id="typenum2" size="4" multiple>
            <c:forEach items="${resultJobCategory}" var="resp" varStatus="status">
                <option   value="${resp.jobCategoryID}">${resp.jobCategoryName}</option>
            </c:forEach>
        </select>
        </td>
    </tr>

        <tr>
            <td>企业类型</td>
            <td><select name="srcList3"  id="typenum3" size="4" multiple>
                <c:forEach items="${resultEnterpriseType}" var="resp" varStatus="status">
                    <option   value="${resp.enterpriseTypeID}">${resp.enterpriseTypeName}</option>
                </c:forEach>
            </select>
            </td>
        </tr>
        <tr>
            <input type="text" name="ssalary" id="ssalary"/>--
            <input type="text" name="bsalary" id="bsalary"/>
        </tr>

        <tr>
            <input type="text" name="syear" id="syear"/>--
            <input type="text" name="byear" id="byear"/>
        </tr>

    <input type="submit" value="提交"/>
</form>
</body>
</html>
