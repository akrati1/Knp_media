

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <input type="text" id="search"/>
        <div id="search_result"></div>
        <script>
            $('#search').keyup(function(){
                var search_term=$(this).val();
                $.post('search_1.jsp', {search_term: search_term},function(data){
                   $('#search_result').html(data);
                } );
            });

        </script>
    </body>
</html>
