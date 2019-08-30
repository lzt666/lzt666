<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">
</head>

<body>
    <form action="batchUpdateSubmit.action" name="userinfoForm" method="post">
        商品列表
        <table width="100%" border="1">
            <tr>
                <td>
                    <input type="submit" value="批量更新">
                </td>
            </tr>
        </table>
        <table width="100%" border="1">
            <tr>
                <td>商品ID</td>
                <td>商品名称</td>
                <td>商品价格</td>
                <td>生产日期</td>
                <td>商品描述</td>
            </tr>
            <c:forEach items="${itemsListKey}" var="items" varStatus="status">
                <tr>

                    <td><input type="text" name="itemsCustomList[${status.index}].id" value="${items.id}" readonly="true"> </td>
                    <td><input type="text" name="itemsCustomList[${status.index}].name" value="${items.name}"> </td>
                    <td><input type="text" name="itemsCustomList[${status.index}].price" value="${items.price}"></td>
                    <td><input type="text" name="itemsCustomList[${status.index}].createtime" value="<fmt:formatDate value="${items.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/>"></td>
                    <td><input type="text" name="itemsCustomList[${status.index}].detail" value="${items.detail}"></td>
                </tr>
            </c:forEach>
        </table>
    </form>

</body>
</html>
