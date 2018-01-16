<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <!DOCTYPE html >
        <html>

        <head>
            <meta charset="UTF-8">
            <title>修改课室状态</title>
            <link rel="stylesheet" type="text/css" href="/SaveEnergy/css/bootstrap.min.css" />
            <link rel="stylesheet" type="text/css" href="/SaveEnergy/css/bootstrap-table.min.css" />
            <link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
            <link rel="stylesheet" href="/SaveEnergy/css/iconfont.css" />
            <link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
            <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
        </head>

        <body>
            <div class="containBox ">
            <form action="/SaveEnergy/lessonArrange/updateLessonArrange.do" method="post">
				<input type="hidden" name="classroomId" value="${la.classroomId}"/>
				<input type="hidden" name="schoolWeek" value="${la.schoolWeek}"/>
				<input type="hidden" name="datesOfWeek" value="${la.datesOfWeek}" />
				<input type="hidden" name="date" value="${la.date}"/>
                <table border="" class="table table-condensed">
                    <tr>
						
                        <td><label for="">早读:</label></td>
                        <td>
							<c:choose>
							    <c:when test="${la.morningReading==1}">
								    <input type="checkbox" checked="checked" name="morningReading" value="1"/>
							    </c:when>
							    <c:otherwise>
								    <input type="checkbox" name="morningReading" value="0"/>
							    </c:otherwise>
						    </c:choose>
                         </td>
                    </tr>
                    <tr>
                        <td><label for="">第一节课:</label></td>
                        <td>
							<c:choose>
							    <c:when test="${la.lesson1==1}">
								    <input type="checkbox" checked="checked" name="lesson1" value="1"/>
							    </c:when>
							    <c:otherwise>
								    <input type="checkbox" name="lesson1" value="0"/>
							    </c:otherwise>
						    </c:choose>
                         </td>
                    </tr>
                    <tr>
                        <td><label for="">第二节课:</label></td>
                        <td>
							<c:choose>
							    <c:when test="${la.lesson2==1}">
								    <input type="checkbox" checked="checked" name="lesson2" value="1"/>
							    </c:when>
							    <c:otherwise>
								    <input type="checkbox" name="lesson2" value="0"/>
							    </c:otherwise>
						    </c:choose>
                         </td>
                    </tr>
                    <tr>
                        <td><label for="">第三节课:</label></td>
                        <td>
							<c:choose>
							    <c:when test="${la.lesson3==1}">
								    <input type="checkbox" checked="checked" name="lesson3" value="1"/>
							    </c:when>
							    <c:otherwise>
								    <input type="checkbox" name="lesson3" value="0"/>
							    </c:otherwise>
						    </c:choose>
                         </td>
                    </tr>
                    <tr>
                        <td><label for="">第四节课:</label></td>
                        <td>
							<c:choose>
							    <c:when test="${la.lesson4==1}">
								    <input type="checkbox" checked="checked" name="lesson4" value="1"/>
							    </c:when>
							    <c:otherwise>
								    <input type="checkbox" name="lesson4" value="0"/>
							    </c:otherwise>
						    </c:choose>
                         </td>
                    </tr>
                    <tr>
                        <td><label for="">中午:</label></td>
                        <td>
							<c:choose>
							    <c:when test="${la.noon==1}">
								    <input type="checkbox" checked="checked" name="noon" value="1"/>
							    </c:when>
							    <c:otherwise>
								    <input type="checkbox" name="noon" value="0"/>
							    </c:otherwise>
						    </c:choose>
                         </td>
                    </tr>
                   <tr>
                        <td><label for="">第五节课:</label></td>
                        <td>
							<c:choose>
							    <c:when test="${la.lesson5==1}">
								    <input type="checkbox" checked="checked" name="lesson5" value="1"/>
							    </c:when>
							    <c:otherwise>
								    <input type="checkbox" name="lesson5" value="0"/>
							    </c:otherwise>
						    </c:choose>
                         </td>
                    </tr>
                    <tr>
                        <td><label for="">第六节课:</label></td>
                        <td>
							<c:choose>
							    <c:when test="${la.lesson6==1}">
								    <input type="checkbox" checked="checked" name="lesson6" value="1"/>
							    </c:when>
							    <c:otherwise>
								    <input type="checkbox" name="lesson6" value="0"/>
							    </c:otherwise>
						    </c:choose>
                         </td>
                    </tr>
                    <tr>
                        <td><label for="">第七节课:</label></td>
                        <td>
							<c:choose>
							    <c:when test="${la.lesson7==1}">
								    <input type="checkbox" checked="checked" name="lesson7" value="1"/>
							    </c:when>
							    <c:otherwise>
								    <input type="checkbox" name="lesson7" value="0"/>
							    </c:otherwise>
						    </c:choose>
                         </td>
                    </tr>
                    <tr>
                        <td><label for="">第八节课:</label></td>
                        <td>
							<c:choose>
							    <c:when test="${la.lesson4==1}">
								    <input type="checkbox" checked="checked" name="lesson8" value="1"/>
							    </c:when>
							    <c:otherwise>
								    <input type="checkbox" name="lesson8" value="0"/>
							    </c:otherwise>
						    </c:choose>
                         </td>
                    </tr>

                    <tr>
                        <td><label for="">晚餐:</label></td>
                        <td>
							<c:choose>
							    <c:when test="${la.dinner==1}">
								    <input type="checkbox" checked="checked" name="dinner" value="1"/>
							    </c:when>
							    <c:otherwise>
								    <input type="checkbox" name="dinner" value="0"/>
							    </c:otherwise>
						    </c:choose>
                         </td>
                    </tr>
                    <tr>
                        <td><label for="">晚修:</label></td>
                        <td>
							<c:choose>
							    <c:when test="${la.nightClasses==1}">
								    <input type="checkbox" checked="checked"  name="nightClasses" value="1"/>
							    </c:when>
							    <c:otherwise>
								    <input type="checkbox" name="nightClasses" value="0"/>
							    </c:otherwise>
						    </c:choose>
                         </td>
                    </tr>
                </table>
                 <div class="row cl">
					<div class="col-xs-8 col-sm-6 col-xs-offset-4 col-sm-offset-3">
						<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
					</div>
				</div>
            </form>
            </div>
            <script>
				

                /*重新加载，刷新*/
                function refresh() {
                    location.reload()
                }
            </script>
        </body>

        </html>