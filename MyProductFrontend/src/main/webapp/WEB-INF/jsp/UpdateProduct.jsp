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
                    <input type="text" name="proId"  class="form-control input-lg" value="${product.productId}" >
				</div>

				<div class="form-group">
				<td>Product Name</td>
                    <input type="text" name="proName" class="form-control input-lg"value="${product.productName}" >
				</div>
				<div class="form-group">
				<td>Product Desc</td>
                    <input type="text" name="proDesc" class="form-control input-lg" ${product.productDesc}>
				</div>
				
				<hr class="colorgraph">
				<div class="row">
					<div class="col-xs-6 col-sm-6 col-md-6"><center>
                        <input type="submit" class="btn btn-lg btn-success btn-block" value="Update Product"></center>
					</div>
					
			</fieldset>
		</form>
	</div>
</div>

</div>