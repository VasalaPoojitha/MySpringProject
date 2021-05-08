<%@include file="CommonHeader.jsp"%>
<br/><br/><br/><br/>
<div class="container">

<div class="row" style="margin-top:20px">
    <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
		<form role="form">
			<fieldset>
				<h2>Product Credentails</h2>
				<hr class="colorgraph">
				<div class="form-group">
				<td>Product Id</td>
                    <input type="text" name="proId"  class="form-control input-lg">
				</div>
				
				<div class="form-group">
				<td>Product Name</td>
                    <input type="text" name="proName" class="form-control input-lg">
				</div>
				<div class="form-group">
				<td>Product Desc</td>
                  <input type="text" name="proDesc" class="form-control input-lg">
                    
				</div>
		
				<hr class="colorgraph">
				<div class="row">
					<div class="col-xs-6 col-sm-6 col-md-6">
                        <input type="submit" class="btn btn-lg btn-success btn-block" value="Insert Product">
					</div>
					
			</fieldset>
		</form>
	</div>
</div>

</div>

<br/><br/>
<div class="container">
<table class="table table-striped" cellspacing="5" cellpadding="5">
    <tr>
     <td>ProductId</td>
     <td>ProductName</td>
     <td>ProductDesc </td>
     <td>Operation</td>
    </tr>
    <c:forEach items="${productList}" var="product">
    <tr>
     <td>${product.productId}</td>
    <td>${product.productName}</td>
    <td>${product.productDesc}</td>
    
    <td>
     <a href="<c:url value='/deleteProduct/${product.productId}'/>">Delete</a>
      &nbsp;&nbsp;|&nbsp;&nbsp;
     <a href="<c:url value='/editProduct/${product.productId}'/>">Edit</a>
    </td>
    </tr>
    </c:forEach>
</table>

