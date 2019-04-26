<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="/WEB-INF/pages/includes/header.jsp"%>
<title>Product Lia</title>
</head>
<body id="page-top">
	<!-- Page Wrapper -->
	<div id="wrapper">
		<%@include file="/WEB-INF/pages/includes/sidebar.jsp"%>

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">
				<%@include file="/WEB-INF/pages/includes/topmenu.jsp"%>
				<!-- Begin Page Content -->
				<div class="container-fluid">

					<table class="table table-bordered">
						<thead>
							<tr class="bg-info text-light">
								<th>ID</th>
								<th>Name</th>
								<th>Price</th>
								<th>Qty</th>
								<th>Status</th>
								<th>Manage</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>1</td>
								<td>aaa</td>
								<td>200</td>
								<td>20</td>
								<td>1</td>
								<td style="width:200px">
									<a href="#" class="btn btn-warning">Edit</a>
									<a href="#" class="btn btn-danger">Delete</a>
								</td>
							</tr>
						</tbody>
					</table>

				</div>
			</div>
			<!-- content -->
			<%@include file="/WEB-INF/pages/includes/footer_content.jsp"%>
		</div>
	</div>
	<%@include file="/WEB-INF/pages/includes/footer.jsp"%>
</body>
</html>