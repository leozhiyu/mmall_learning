<%@ page contentType="text/html;charset=GBK"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html charset=gb2312">
</head>
<body>
<h2>Hello World!</h2>
srpingmvc�ϴ��ļ�
<form name="form1" action="/manage/product/upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file"/>
    <input type="submit" value="upload">
</form>

���ı�ͼƬ�ϴ��ļ�
<form name="form1" action="/manage/product/richtext_img_upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file"/>
    <input type="submit" value="upload">
</form>

</body>
</html>
