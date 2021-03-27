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
		username:$("#username").val(),
		password:$("#password").val(),
		email:$("#email").val()
		};
//		console.log(data);

		//ajax 호출시 default가 비동기 호출
		//ajax 통신을 이용해서 3개의 데이터를 json으로 변경하여 insert 요청
		//ajax가 통신을 성공하고 서버가 json을 리턴해주면 자동으로 자바 오브젝트로 변환. 
		$.ajax({
			//회원가입 수행 요청
			type:"post",
			url:"/auth/joinProc",
			data:JSON.stringify(data), //http body 데이터
			contentType:"application/json; charset=utf-8", //body 데이터가 어떤 타입인지 (MINE)
			dataType:"json" //요청을 서버로해서 응답이 왔을 때 기본적으로 문자열 String (생긴게 json이라면) => javascript 오브젝트로 변경.
		}).done(function(resp){
			alert("회원가입이 완료 되었습니다");
			console.log(resp);
			location.href="/";
		}).fail(function(error){
			console.log(error);
			alert("중복 아이디입니다.")
//			alert(JSON.stringify(error));
		}); 
		
	},
//	login:function(){
////		alert("userinit이 호출됨");
//
//	let data = {
//		username:$("#username").val(),
//		password:$("#password").val(),
//		};
////		console.log(data);
//
//		//ajax 호출시 default가 비동기 호출
//		//ajax 통신을 이용해서 3개의 데이터를 json으로 변경하여 insert 요청
//		//ajax가 통신을 성공하고 서버가 json을 리턴해주면 자동으로 자바 오브젝트로 변환. 
//		$.ajax({
//			//회원가입 수행 요청
//			type:"post",
//			url:"/api/user/login",
//			data:JSON.stringify(data), //http body 데이터
//			contentType:"application/json; charset=utf-8", //body 데이터가 어떤 타입인지 (MINE)
//			dataType:"json" //요청을 서버로해서 응답이 왔을 때 기본적으로 문자열 String (생긴게 json이라면) => javascript 오브젝트로 변경.
//		}).done(function(resp){
//			alert("로그인 완료 되었습니다");
//			console.log(resp);
//			location.href="/";
//		}).fail(function(error){
////			alert(JSON.stringify(error));
//			alert("아이디와 비밀번호를 확인하세요");
//		}); 
//		
//	}
}


index.init();











