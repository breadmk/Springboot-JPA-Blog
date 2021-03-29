let index={
	init:function(){
		$("#btn-save").on("click",()=>{ //function(){} , ()=>{} this를 바인딩하기 위해서 사용.
			this.save();
		});	
//		$("#btn-login").on("click",()=>{ //function(){} , ()=>{} this를 바인딩하기 위해서 사용.
//			this.login();
//		});	
	},
	save:function(){
//		alert("userinit이 호출됨");

	let data = {
		title:$("#title").val(),
		content:$("#content").val(),
		};
		$.ajax({
			type:"post",
			url:"/api/board",
			data:JSON.stringify(data), 
			contentType:"application/json; charset=utf-8", 
			dataType:"json" 
		}).done(function(resp){
			alert("글쓰기가 완료 되었습니다");
			console.log(resp);
			location.href="/";
		}).fail(function(error){
			console.log(error);
			alert("중복 아이디입니다.")
//			alert(JSON.stringify(error));
		}); 
		
	},
}


index.init();











