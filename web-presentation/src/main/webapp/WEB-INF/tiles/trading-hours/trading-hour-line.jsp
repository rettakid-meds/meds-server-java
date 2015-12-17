<%@include file="../common/taglib-includes.jsp" %>
<c:choose>
    <c:when test="${param.write == true}">
        <tr>
            <td><c:out value="${param.day} "/></td>
            <td><input name="tradingDay.${param.dayName}.effFrm" placeholder="HH:mm"
                       value="<c:out value="${param.effFrm}"/>" type="text"/>
            </td>
            <td> -</td>
            <td><input name="tradingDay.${param.dayName}.effTo" placeholder="HH:mm"
                       value="<c:out value="${param.effTo}"/>" type="text"/></td>
            <td>
                <select name="tradingDay.${param.dayName}.open" class="browser-default">
                    <option value="" disabled selected>Choose your option</option>
                    <option value="true"
                            <c:if test="${param.open == true}">selected="selected"</c:if> >Open
                    </option>
                    <option value="false"
                            <c:if test="${param.open == false}">selected="selected"</c:if> >Closed
                    </option>
                </select>
            </td>
        </tr>
    </c:when>
    <c:otherwise>
        <tr>
            <c:choose>
                <c:when test="${param.open}">
                    <td align="center"><c:out value="${param.day}"/></td>
                    <td align="center"><c:out value="${param.effFrm}"/></td>
                    <td> -</td>
                    <td align="center"><c:out value="${param.effTo}"/></td>
                </c:when>
                <c:otherwise>
                    <td align="center"><c:out value="${param.day}"/></td>
                    <td align="center" colspan="3"><span class="red-text">Closed</span></td>
                </c:otherwise>
            </c:choose>

        </tr>
    </c:otherwise>
</c:choose>
