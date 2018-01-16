function formCheck(){
	if($("#account").val()==null||$("#account").val()==""){
		$("workerMsg").html("请输入用户名")
		return false;
	}
	
}
