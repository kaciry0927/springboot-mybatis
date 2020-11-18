function findAll() {

    $.ajax({
        url: '/user/findAll',//请求的地址
        type: 'post', //请求的方式
        dateType: "json", //请求的数据格式
        data: {},
        error: function () {
            alert("服务器未响应，加载视频信息失败！");
        },
        success: function (result) {
            alert(1);
            // document.getElementById("respFindAll").innerText = result;
        }
    });

    return false;
}