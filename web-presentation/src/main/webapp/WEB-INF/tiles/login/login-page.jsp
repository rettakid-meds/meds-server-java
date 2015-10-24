<%@include file="../../tiles/common/taglib-includes.jsp" %>
<div class="row">
    <div class="col s12 m4 offset-m4">
        <div class="card">
            <c:url var="loginUrl" value="/login"/>
            <form:form commandName="loginVo" action="${loginUrl}" method="post">
                <div class="card-image">
                    <img src="<c:url value='/resources/img/welcome.jpg' />">
                    <span class="card-title">Card Title</span>
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
        </div>
    </div>
</div>