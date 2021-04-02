<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>
<div class="container">

	<form action="" method="">
		<div class="form-group">
			<label for="username">Title</label> 
			<input type="text" class="form-control" placeholder="Enter title" id=title value="${board.title}">
		</div>
		<div class="form-group">
		  <label for="comment">Content</label>
		  <textarea class="form-control summernote" rows="5" placeholder="Enter content" id="content">${board.content}</textarea>
		</div>
	</form>
		<button id="btn-save" class="btn btn-primary">글작성</button>
    
</div>
 <script>
      $('.summernote').summernote({
        placeholder: 'Hello Mk',
        tabsize: 2,
        height: 300
      });
</script>
<script src="/js/board.js"></script>
<%@ include file="../layout/footer.jsp" %>



