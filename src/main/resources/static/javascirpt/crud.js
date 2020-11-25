$(document).ready(function () {
    $("#respFindAll table").bootstrapTable({
        url: "/user/findAll",  //请求地址
        method: "post",
        striped: true, //是否显示行间隔色
        pageNumber: 1, //初始化加载第一页
        pagination: true,//是否分页
        sidePagination: 'client',//server:服务器端分页|client：前端分页
        pageSize: 5,//单页记录数
        //前面有空格，目的是修改class，原生的为左右浮动，然后在style里让hidden的display为none。
        paginationDetailHAlign: ' hidden',
        //showRefresh : true,//刷新按钮
        sortClass: 'id',
        columns: [{
            title: 'id',
            field: 'id',
            sortable: true
        }, {
            title: '姓名',
            field: 'name',
            sortable: false
        }, {
            title: '性别',
            field: 'sex',
            sortable: false
        }]
    })
});

$(document).ready(function () {
    initTable("respQueryByNameId");
    return false;
});

function ajaxRequestByName() {
    $.ajax({
        url: '/user/queryUserByName',//请求的地址
        type: 'post', //请求的方式
        dateType: "json", //请求的数据格式
        data: {
            name: $("#queryByName").val()
        },
        error: function () {
            console.error("服务器未响应");
        },
        success: function (result) {
            $("#dataTable").bootstrapTable('destroy');
            initTable("respQueryByNameId");
            $('#respQueryByNameId').bootstrapTable('load', result);
        }
    });
    return false;
}


//初始化
function initTable(tableId) {
    $("#" + tableId).bootstrapTable({
        search: false,
        sidePagination: "client",
        pagination: "true",
        pageSize: 5,
        sortClass: 'id',
        paginationDetailHAlign: ' hidden',
        columns: [{
            title: 'id',
            field: 'id',
            sortable: true
        }, {
            title: '姓名',
            field: 'name',
            sortable: false
        }, {
            title: '性别',
            field: 'sex',
            sortable: false
        }]
    });
    return false;
}