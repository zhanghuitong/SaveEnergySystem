<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>修改课室状态</title>
    <link rel="stylesheet" type="text/css" href="/SaveEnergy/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css"href="/SaveEnergy/css/bootstrap-table.min.css" />
	<link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="/SaveEnergy/css/iconfont.css" />
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
</head>

<body>
	<nav class="breadcrumb">
		<span class="fa fa-home"></span> 首页 <span class="c-gray en">&gt;</span>
		修改课室状态 <span class="c-gray en">&gt;</span> 修改课室状态 <a
			class="btn btn-success radius"
			style="line-height: 1.6em; margin-top: 3px ;"  onclick="refresh()" title="刷新"><span class="fa fa-refresh"></span></a>
	</nav>
	<h1 align="center">修改课室状态</h1>
	<h4 align="center">当前课室: ${classStatus.classroomId }</h4>
	<div class="containBox ">
		<table border="" class="table table-condensed">
			<tr>
				<td><label for="">灯1:</label></td>
				<td><button class="btn" id="btn1">
						<c:choose>
							<c:when test="${classStatus.l1Switch==1 }">
								<span class="icon iconfont icon-light1 font-color-yellow"
									onclick="toggle('l1Switch',1)"></span>
							</c:when>
							<c:otherwise>
								<span class="icon iconfont icon-light"
									onclick="toggle('l1Switch',0)"></span>
							</c:otherwise>
						</c:choose>
					</button></td>
			</tr>
			<tr>
				<td><label for="">灯2:</label></td>
				<td><button class="btn ">
						<c:choose>
							<c:when test="${classStatus.l2Switch==1}">
								<span class="icon iconfont icon-light1 font-color-yellow"
									onclick="toggle('l2Switch',1)"></span>
							</c:when>
							<c:otherwise>
								<span class="icon iconfont icon-light"
									onclick="toggle('l2Switch',0)"></span>
							</c:otherwise>
						</c:choose>
					</button></td>
			</tr>
			<tr>
				<td><label for="">灯3:</label></td>
				<td><button class="btn">
						<c:choose>
							<c:when test="${classStatus.l3Switch==1}">
								<span class="icon iconfont icon-light1 font-color-yellow"
									onclick="toggle('l3Switch',1)"></span>
							</c:when>
							<c:otherwise>
								<span class="icon iconfont icon-light"
									onclick="toggle('l3Switch',0)"></span>
							</c:otherwise>
						</c:choose>
					</button></td>
			</tr>
			<tr>
				<td><label for="">灯4:</label></td>
				<td><button class="btn">
						<c:choose>
							<c:when test="${classStatus.l4Switch==1}">
								<span class="icon iconfont icon-light1 font-color-yellow"
									onclick="toggle('l4Switch',1)"></span>
							</c:when>
							<c:otherwise>
								<span class="icon iconfont icon-light"
									onclick="toggle('l4Switch',0)"></span>
							</c:otherwise>
						</c:choose>
					</button></td>
			</tr>
			<tr>
				<td><label for="">风扇1:</label></td>
				<td><button class="btn">
						<c:choose>
							<c:when test="${classStatus.f1Switch==1}">
								<span class="icon iconfont icon-fengshan font-color-green"
									onclick="toggle('f1Switch',1)"></span>
							</c:when>
							<c:otherwise>
								<span class="icon iconfont icon-fengshan"
									onclick="toggle('f1Switch',0)"></span>
							</c:otherwise>
						</c:choose>
					</button></td>
			</tr>
			<tr>
				<td><label for="">风扇2:</label></td>
				<td><button class="btn">
						<c:choose>
							<c:when test="${classStatus.f2Switch==1}">
								<span class="icon iconfont icon-fengshan font-color-green"
									onclick="toggle('f2Switch',1)"></span>
							</c:when>
							<c:otherwise>
								<span class="icon iconfont icon-fengshan"
									onclick="toggle('f2Switch',0)"></span>
							</c:otherwise>
						</c:choose>
					</button></td>
			</tr>
			<tr>
				<td><label for="">风扇3:</label></td>
				<td><button class="btn">
						<c:choose>
							<c:when test="${classStatus.f3Switch==1}">
								<span class="icon iconfont icon-fengshan font-color-green"
									onclick="toggle('f3Switch',1)"></span>
							</c:when>
							<c:otherwise>
								<span class="icon iconfont icon-fengshan"
									onclick="toggle('f3Switch',0)"></span>
							</c:otherwise>
						</c:choose>
					</button></td>
			</tr>
			<tr>
				<td><label for="">风扇4:</label></td>
				<td><button class="btn">
						<c:choose>
							<c:when test="${classStatus.f4Switch==1}">
								<span class="icon iconfont icon-fengshan font-color-green"
									onclick="toggle('f4Switch',1)"></span>
							</c:when>
							<c:otherwise>
								<span class="icon iconfont icon-fengshan"
									onclick="toggle('f4Switch',0)"></span>
							</c:otherwise>
						</c:choose>
					</button></td>
			</tr>
			<tr>
				<td><label for="">空调1:</label></td>
				<td><button class="btn">
						<span id="A1" class="icon iconfont icon-kaiguanguan-copy-copy"
							onclick="changeFont8(this) "></span>
					</button></td>
			</tr>

			<tr>
				<td><label for="">空调2:</label></td>
				<td><button class="btn">
						<span class="icon iconfont icon-kaiguanguan-copy-copy"></span>
					</button></td>
			</tr>
			<tr>
				<td><label for="">空调1温度:</label></td>
				<td><span>-----</span></td>
			</tr>
			<tr>
				<td><label for="">空调2温度:</label></td>
				<td><span>-----</span></td>
			</tr>
		</table>
	</div>
	<script>
		/*开关*/
		function toggle(deviceName, data) {
			var name = "${classStatus.classroomName}";
			$.ajax({
				type : "post",
				url : "/SaveEnergy/classStatus/insertCommand.do",
				async : true,
				dataType : "json",
				data : {
					name : name,
					data : data,
					deviceName : deviceName
				},
				success : function(result) {
					if (result != 0) {
						alert("已发送命令");
						//两秒后刷新
						setTimeout(function()  {
							location.reload();
						}, 2000);
					} else {
						alert("发送命令失败");
					}
				}
			});
		}
		/*重新加载，刷新*/
		function refresh(){
			location.reload()
		}
	</script>
</body>
</html>