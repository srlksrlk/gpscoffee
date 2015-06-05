<!--
-@author T.Senna 5/21
-@version 1.0
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<%@ taglib prefix="s" uri="/struts-tags"%>
	<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
	<title>売上統計画面</title>
	<link href="stylecss/basic.css" type="text/css" rel="stylesheet" />
	<link href="stylecss/Master.css" type="text/css" rel="stylesheet" />
	<link rel="shortcut icon" href="img/fab.ico" />
	<script type="text/javascript" src="http://filamentgroup.github.com/EnhanceJS/enhance.js"></script>
	<script type="text/javascript"><!-- グラフのJS記述 -->
		enhance({
			loadScripts: [
				'js/excanvas.js',
				'https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js',
				'js/visualize.jQuery.js',
				'js/example.js'
			],
			loadStyles: [
				'stylecss/visualize.css',
				'stylecss/visualize-light.css'
			]
		});
    </script>
</head>

<body>




<table>
	<caption><s:property value="monthCount"/>月利益統計</caption>
	<thead>
		<tr>

			<th scope="col">１</th>
			<th scope="col">２</th>
			<th scope="col">３</th>
			<th scope="col">４</th>
			<th scope="col">５</th>
			<th scope="col">６</th>
			<th scope="col">７</th>
			<th scope="col">８</th>
			<th scope="col">９</th>
			<th scope="col">10</th>
			<th scope="col">11</th>
			<th scope="col">12</th>
			<th scope="col">13</th>
			<th scope="col">14</th>
			<th scope="col">15</th>
			<th scope="col">16</th>
			<th scope="col">17</th>
			<th scope="col">18</th>
			<th scope="col">19</th>
			<th scope="col">20</th>
			<th scope="col">21</th>
			<th scope="col">22</th>
			<th scope="col">23</th>
			<th scope="col">24</th>
			<th scope="col">25</th>
			<th scope="col">26</th>
			<th scope="col">27</th>
			<th scope="col">28</th>
			<th scope="col">29</th>
			<th scope="col">30</th>
			<th scope="col">31</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<s:iterator value="sales">
			<td><s:property value="Profit"/>
			</s:iterator>
			<th scope="row">円</th><!-- 計算式を代入 -->

		</tr>
	</tbody>
</table>	<br><br>
	<s:form action = "GoTaskAction">
	<input type="submit" class="btn btn-default" value="戻る" />
	</s:form>
<script src="bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
</body>
</html>



