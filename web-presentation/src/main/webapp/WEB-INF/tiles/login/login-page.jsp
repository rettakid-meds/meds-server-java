<%@include file="../common/taglib-includes.jsp" %>
<div class="row">
    <div class="col s12 m4 offset-m4">
        <div class="card">
            <c:url var="loginUrl" value="/login"/>
            <form:form commandName="loginVo" action="${loginUrl}" method="post">
                <div class="card-image">
                    <img src="<c:url value='/resources/img/welcome.jpg' />">
                    <span class="card-title">Login</span>
                </div>
                <div class="card-content">
                    <div class="row">
                        <div class="col s12">
                            <div class="row">
                                <div class="input-field col s12">
                                    <form:input path="username" type="text" class="validate"/>
                                    <label for="username">User</label>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <form:input path="password" type="password" class="validate"/>
                                    <label for="password">Password</label>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="card-action">
                    <button class="btn waves-effect waves-light" type="submit" name="action">Submit
                        <i class="material-icons right">send</i>
                    </button>
                </div>
            </form:form>
            <div class="fixed-action-btn" style="bottom: 45px; right: 24px;">
                <a class="btn-floating btn-large red">
                    <i class="large material-icons">mode_edit</i>
                </a>
                <ul>
                    <li><a class="btn-floating red"><i class="material-icons">insert_chart</i></i></a></li>
                    <li><a class="btn-floating yellow darken-1"><i class="material-icons">format_quote</i></a></li>
                    <li><a class="btn-floating green"><i class="material-icons">publish</i></a></li>
                    <li><a class="btn-floating blue"><i class="material-icons">attach_file</i></a></li>
                </ul>
            </div>
        </div>
    </div>
</div>