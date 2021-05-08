<%@include file="CommonHeader.jsp"%>
<br/><br/><br/><br/>
<div class="container">

<div class="row" style="margin-top:20px">
    <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
		<form role="form">
			<fieldset>
				<h2>Please Register</h2>
				<hr class="colorgraph">
				<div class="form-group">
                    <input type="text" name="LoginName" class="form-control input-lg" placeholder="LoginName">
				</div>
				<div class="form-group">
                    <input type="password" name="password" class="form-control input-lg" placeholder="Password">
				</div>
				<div class="form-group">
                    <input type="text" name="CustomerName" class="form-control input-lg" placeholder="CustomerName">
				</div>
                 <tr>
    			 <td>Gender</td>
   				  <td>
  				  <input type="radio" Name="gender" value="M" "/>Male  
  				  <input type="radio" Name="gender" value="F"/>Female
  				  </td>
				 </tr>
			
				<hr class="colorgraph">
				<div class="row">
					<div class="col-xs-6 col-sm-6 col-md-6">
                        <input type="submit" class="btn btn-lg btn-success btn-block" value="Sign Up">
				 </div>
					<div class="col-xs-6 col-sm-6 col-md-6">
						<a href="" class="btn btn-lg btn-primary btn-block">Reset</a>
					</div>
				</div>
			</fieldset>
		</form>
	</div>
</div>

</div>